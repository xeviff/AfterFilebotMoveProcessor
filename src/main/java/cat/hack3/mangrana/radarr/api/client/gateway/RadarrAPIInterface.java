package cat.hack3.mangrana.radarr.api.client.gateway;

import cat.hack3.mangrana.radarr.api.schema.MovieResource;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * For more information, visit: <a href="https://radarr.video/docs/api/#/Movie/get_api_v3_movie">...</a>
 */
@Path("/api/v3")
public interface RadarrAPIInterface {

    @GET
    @Path("/movie")
    @Produces({ MediaType.APPLICATION_JSON })
    List<MovieResource> movieLookupByTMDBid(@QueryParam("tmdbId") int tmdbId, @QueryParam("apikey") String apikey);

    @PUT
    @Path("/movie/{id}")
    @Consumes({ MediaType.APPLICATION_JSON })
    void updateMovie(MovieResource movie, @PathParam("id") int movieId, @QueryParam("apikey") String apikey);

}