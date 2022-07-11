package cat.hack3.mangrana.radarr.api.client.process;

import cat.hack3.mangrana.config.ConfigFileLoader;
import cat.hack3.mangrana.exception.IncorrectWorkingReferencesException;
import cat.hack3.mangrana.radarr.api.schema.MovieResource;
import cat.hack3.mangrana.utils.StringCaptor;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

import static cat.hack3.mangrana.utils.Output.log;

public class EditMoviesPathProcessor extends MoviesProcessor {

    public EditMoviesPathProcessor(ConfigFileLoader configFileLoader) {
        super(configFileLoader);
    }

    @Override
    public void processMovie(String moviePath) {
        try {
            int tmdbId = getTMDBFromFile(moviePath);
            moviePath = moviePath.replaceFirst("pelis", "movies");
            String newFolder = getFolderFromFullPath(moviePath);

            log("Retrieving Radarr info for tmdbId="+tmdbId);
            List<MovieResource> movies = radarrApiGateway.movieLookupByTMDBid(tmdbId);

            if (CollectionUtils.isNotEmpty(movies)) {
                MovieResource movie = movies.get(0);
                String oldFolder = movie.getFolderName();
                if (configFileLoader.getPossibleCurrentLocations()
                        .stream().noneMatch(oldFolder::contains)) {
                    throw new IncorrectWorkingReferencesException("It has to be in expected paths. current: "+oldFolder);
                }
                movie.setFolderName(newFolder);
                movie.setPath(newFolder);
                radarrApiGateway.updateMovie(movie);

                log("Updated Radarr path for: "+movie.getTitle());
                log("from "+oldFolder);
                log("to "+newFolder);
                log(":)");
            } else
                log("No elements on Radarr for this tmdbid: "+tmdbId);

        } catch (IncorrectWorkingReferencesException e) {
            log(e.getMessage());
            log("Ignoring...");
        } catch (Exception e) {
            log("Unexpected exception: "+e);
            e.printStackTrace();
        }
    }

    private int getTMDBFromFile(String path) throws IncorrectWorkingReferencesException {
        String tmdbId = Optional.ofNullable(
                        StringCaptor.getMatchingSubstring(path, "\\{tmdb-(.*)\\}"))
                .orElseThrow(() -> new IncorrectWorkingReferencesException("Couldn't find tmdb from: "+path));
        return Integer.parseInt(tmdbId);
    }

    private String getFolderFromFullPath(String moviePath) {
        return moviePath.substring(0, moviePath.lastIndexOf('/'));
    }

}
