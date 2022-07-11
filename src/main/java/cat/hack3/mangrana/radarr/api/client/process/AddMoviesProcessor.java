package cat.hack3.mangrana.radarr.api.client.process;

import cat.hack3.mangrana.config.ConfigFileLoader;

public class AddMoviesProcessor extends MoviesProcessor{

    public AddMoviesProcessor(ConfigFileLoader configFileLoader) {
        super(configFileLoader);
    }

    @Override
    public void processMovie(String moviePath) {

    }
}
