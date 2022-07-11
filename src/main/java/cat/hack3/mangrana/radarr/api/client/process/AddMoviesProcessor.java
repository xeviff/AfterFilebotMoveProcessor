package cat.hack3.mangrana.radarr.api.client.process;

import cat.hack3.mangrana.config.ConfigFileLoader;
import cat.hack3.mangrana.exception.IncorrectWorkingReferencesException;
import cat.hack3.mangrana.radarr.api.schema.MovieResource;

import java.util.Objects;

import static cat.hack3.mangrana.utils.Output.log;

public class AddMoviesProcessor extends MoviesProcessor{

    public AddMoviesProcessor(ConfigFileLoader configFileLoader) {
        super(configFileLoader);
    }

    @Override
    public void processMovie(String moviePath) {
        try {
            int tmdbId = getTMDBFromFile(moviePath);
            MovieResource radarrMovie = getMovieRadarrByTMDBid(tmdbId);
            if (Objects.nonNull(radarrMovie)) {
                new EditMoviesPathProcessor(configFileLoader).editRadarrMoviePath(moviePath, radarrMovie);
            } else {
                addNewMovieToRadarr(tmdbId, moviePath);
            }
        } catch (IncorrectWorkingReferencesException e) {
            log(e.getMessage());
            log("Ignoring...");
        } catch (Exception e) {
            log("Unexpected exception: " + e);
            e.printStackTrace();
        }
    }

    private void addNewMovieToRadarr(int tmdbId, String moviePath) {
        MovieResource nonexistentMovie = null;
        radarrApiGateway.addNonExistentMovie(nonexistentMovie);
    }

}
