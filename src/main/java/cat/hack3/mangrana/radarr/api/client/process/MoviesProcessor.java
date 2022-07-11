package cat.hack3.mangrana.radarr.api.client.process;

import cat.hack3.mangrana.config.ConfigFileLoader;
import cat.hack3.mangrana.radarr.api.client.gateway.RadarrApiGateway;

public abstract class MoviesProcessor {

    ConfigFileLoader configFileLoader;
    RadarrApiGateway radarrApiGateway;

    protected MoviesProcessor(ConfigFileLoader configFileLoader) {
        this.configFileLoader = configFileLoader;
        radarrApiGateway = new RadarrApiGateway(configFileLoader);
    }

    public abstract void processMovie (String moviePath);

}
