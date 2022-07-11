package cat.hack3.mangrana.radarr.api.client.gateway;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.UriBuilder;

public class RadarrAPIInterfaceBuilder {

    public RadarrAPIInterface buildProxy(String host) {
        System.out.println("preparing Radarr API call at host "+ host + " ...");
        UriBuilder fullPath = UriBuilder.fromPath(host);
        ResteasyClient client = (ResteasyClient) ClientBuilder.newClient();
        ResteasyWebTarget target = client.target(fullPath);
        return target.proxy(RadarrAPIInterface.class);
    }
}
