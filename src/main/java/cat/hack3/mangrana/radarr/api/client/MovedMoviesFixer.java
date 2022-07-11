package cat.hack3.mangrana.radarr.api.client;

import cat.hack3.mangrana.config.ConfigFileLoader;
import cat.hack3.mangrana.config.LogsFilesInfo;
import cat.hack3.mangrana.exception.IncorrectWorkingReferencesException;
import cat.hack3.mangrana.filebot.results.FilebotLogsExtractor;
import cat.hack3.mangrana.radarr.api.client.process.MoviesProcessorFactory;

import java.util.Optional;

import static cat.hack3.mangrana.utils.Output.log;
import static cat.hack3.mangrana.utils.Output.logDate;

public class MovedMoviesFixer {

    ConfigFileLoader configFileLoader;
    FilebotLogsExtractor filebotLogsExtractor;
    MoviesProcessorFactory moviesProcessorFactory;

    private MovedMoviesFixer() throws IncorrectWorkingReferencesException {
        log("Hi my friends, here the -after filebot- care taker ;) enjoy");
        configFileLoader = new ConfigFileLoader();
        filebotLogsExtractor = new FilebotLogsExtractor();
        moviesProcessorFactory = new MoviesProcessorFactory(configFileLoader);
    }

    public static void main(String[] args) throws IncorrectWorkingReferencesException {
        new MovedMoviesFixer().process();
    }

    private void process() {
        configFileLoader
                .getLogsFilesInfoList()
                .forEach(this::processLogsFile);
        log("that's all, folks");
        logDate();
    }

    private void processLogsFile(LogsFilesInfo logsFilesInfo) {
        log("going to work with logs file: "+ logsFilesInfo.getPath());
        filebotLogsExtractor
                .getNewPathsFromFileBotLogFile(logsFilesInfo.getPath())
                .forEach(newPath -> processPath(newPath, logsFilesInfo.getAction()));
    }

    private void processPath(String moviePath, LogsFilesInfo.Action whatToDo) {
        Optional.ofNullable(
                moviesProcessorFactory.getInstanceForAction(whatToDo))
                .ifPresent(processor ->
                        processor.processMovie(moviePath));
    }
}
