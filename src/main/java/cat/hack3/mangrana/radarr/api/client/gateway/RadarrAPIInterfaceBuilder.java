package cat.hack3.mangrana.radarr.api.client.gateway;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.UriBuilder;

import static cat.hack3.mangrana.utils.Output.log;

public class RadarrAPIInterfaceBuilder {

    public static RadarrAPIInterface buildProxy(String host) {
        log("preparing Radarr API call at host "+ host + " ...");
        UriBuilder fullPath = UriBuilder.fromPath(host);
        ResteasyClient client = (ResteasyClient) ClientBuilder.newClient();
        ResteasyWebTarget target = client.target(fullPath);
        return target.proxy(RadarrAPIInterface.class);
    }
}
