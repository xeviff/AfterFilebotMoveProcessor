package cat.hack3.mangrana.radarr.api.client.process;

import cat.hack3.mangrana.config.ConfigFileLoader;
import cat.hack3.mangrana.config.LogsFilesInfo;

import static cat.hack3.mangrana.utils.Output.log;

public class MoviesProcessorFactory {

    ConfigFileLoader config;

    public MoviesProcessorFactory(ConfigFileLoader config) {
        this.config = config;
    }

    public MoviesProcessor getInstanceForAction(LogsFilesInfo.Action whatToDo) {
        switch (whatToDo) {
            case EDIT:
                return new EditMoviesPathProcessor(config);
            case ADD:
                return new AddMoviesProcessor(config);
        }
        log("Couldn't find the desired action!! -> "+whatToDo.name());
        return null; //to skip
    }

}
