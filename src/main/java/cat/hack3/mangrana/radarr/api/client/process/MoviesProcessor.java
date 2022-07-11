package cat.hack3.mangrana.radarr.api.client.process;

import cat.hack3.mangrana.config.ConfigFileLoader;
import cat.hack3.mangrana.exception.IncorrectWorkingReferencesException;
import cat.hack3.mangrana.radarr.api.client.gateway.RadarrApiGateway;
import cat.hack3.mangrana.radarr.api.schema.MovieResource;
import cat.hack3.mangrana.utils.StringCaptor;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

import static cat.hack3.mangrana.utils.Output.log;

public abstract class MoviesProcessor {

    ConfigFileLoader configFileLoader;
    RadarrApiGateway radarrApiGateway;

    protected MoviesProcessor(ConfigFileLoader configFileLoader) {
        this.configFileLoader = configFileLoader;
        radarrApiGateway = new RadarrApiGateway(configFileLoader);
    }

    public abstract void processMovie (String moviePath);

    protected int getTMDBFromFile(String path) throws IncorrectWorkingReferencesException {
        String tmdbId = Optional.ofNullable(
                        StringCaptor.getMatchingSubstring(path, "\\{tmdb-(.*)\\}"))
                .orElseThrow(() -> new IncorrectWorkingReferencesException("Couldn't find tmdb from: "+path));
        return Integer.parseInt(tmdbId);
    }

    protected MovieResource getMovieRadarrByTMDBid(int tmdbId) {
        log("Retrieving Radarr info for tmdbId=" + tmdbId);
        List<MovieResource> singleMovieInAList = radarrApiGateway.movieLookupByTMDBid(tmdbId);
        if (CollectionUtils.isNotEmpty(singleMovieInAList)) {
            return singleMovieInAList.get(0);
        } else {
            log("No elements on Radarr for this tmdbid: " + tmdbId);
            return null;
        }
    }

}
