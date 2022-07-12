package cat.hack3.mangrana.radarr.api.client.gateway;

import cat.hack3.mangrana.config.ConfigFileLoader;
import cat.hack3.mangrana.radarr.api.schema.MovieResource;
import org.apache.commons.lang.NotImplementedException;

import java.util.List;

public class RadarrApiGateway {

    private final String apiKey;
    private final RadarrAPIInterface proxy;

    public RadarrApiGateway(ConfigFileLoader config) {
        apiKey = config.getApiKey();
        proxy = RadarrAPIInterfaceSingleton.getInterface(config.getHost());
    }

    public List<MovieResource> movieLookupByTMDBid (int tmdbId) {
        return proxy.movieLookupByTMDBid(tmdbId, apiKey);
    }

    public void updateMovie(MovieResource movie){
        proxy.updateMovie(movie, movie.getId(), apiKey);
    }

    public void addNonExistentMovie(MovieResource movie){
        throw new NotImplementedException();
    }

}
