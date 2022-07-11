package cat.hack3.mangrana.radarr.api.client.gateway;

import cat.hack3.mangrana.config.ConfigFileLoader;
import cat.hack3.mangrana.radarr.api.schema.MovieResource;

import java.util.List;

public class RadarrApiGateway {

    private final String apiKey;
    private final RadarrAPIInterface proxy;

    public RadarrApiGateway(ConfigFileLoader config) {
        apiKey = config.getApiKey();
        RadarrAPIInterfaceBuilder apiInterfaceBuilder = new RadarrAPIInterfaceBuilder();
        proxy = apiInterfaceBuilder.buildProxy(config.getHost());
    }

    public List<MovieResource> movieLookupByTMDBid (int tmdbId) {
        return proxy.movieLookupByTMDBid(tmdbId, apiKey);
    }

    public void updateMovie(MovieResource movie){
        proxy.updateMovie(movie, movie.getId(), apiKey);
    }

}
