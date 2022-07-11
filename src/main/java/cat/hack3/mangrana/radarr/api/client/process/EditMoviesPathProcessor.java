package cat.hack3.mangrana.radarr.api.client.process;

import cat.hack3.mangrana.config.ConfigFileLoader;
import cat.hack3.mangrana.exception.IncorrectWorkingReferencesException;
import cat.hack3.mangrana.radarr.api.schema.MovieResource;

import java.util.Objects;

import static cat.hack3.mangrana.utils.Output.log;

public class EditMoviesPathProcessor extends MoviesProcessor {

    public EditMoviesPathProcessor(ConfigFileLoader configFileLoader) {
        super(configFileLoader);
    }

    @Override
    public void processMovie(String moviePath) {
        try {
            int tmdbId = getTMDBFromFile(moviePath);
            MovieResource radarrMovie = getMovieRadarrByTMDBid(tmdbId);
            if (Objects.nonNull(radarrMovie)) {
                editRadarrMoviePath(moviePath, radarrMovie);
            }
        } catch (IncorrectWorkingReferencesException e) {
            log(e.getMessage());
            log("Ignoring...");
        } catch (Exception e) {
            log("Unexpected exception: " + e);
            e.printStackTrace();
        }
    }

    public void editRadarrMoviePath(String moviePath, MovieResource radarrMovie) throws IncorrectWorkingReferencesException {
        String oldFolder = radarrMovie.getFolderName();
        if (configFileLoader.getPossibleCurrentLocations()
                .stream().noneMatch(oldFolder::contains)) {
            throw new IncorrectWorkingReferencesException("It has to be in expected paths. current: " + oldFolder);
        }
        String newFolder = getRightFolderFromFullPath(moviePath);
        radarrMovie.setFolderName(newFolder);
        radarrMovie.setPath(newFolder);
        radarrApiGateway.updateMovie(radarrMovie);

        log("Updated Radarr path for: " + radarrMovie.getTitle());
        log("from " + oldFolder);
        log("to " + newFolder);
        log(":)");

    }

    private String getRightFolderFromFullPath(String moviePath) {
        String rightPath = moviePath.replaceFirst("pelis", "movies");
        return rightPath.substring(0, rightPath.lastIndexOf('/'));
    }

}
