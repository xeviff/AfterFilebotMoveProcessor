package cat.hack3.mangrana.filebot.results;

import cat.hack3.mangrana.exception.IncorrectWorkingReferencesException;
import cat.hack3.mangrana.utils.StringCaptor;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static cat.hack3.mangrana.config.LocalEnvironmentManager.getLocalLogsPathFromConfig;
import static cat.hack3.mangrana.config.LocalEnvironmentManager.isLocal;
import static cat.hack3.mangrana.utils.Output.log;

public class FilebotLogsExtractor {

    public List<String> getNewPathsFromFileBotLogFile(String filebotLogFilePath) {
        try {
            return readAllLinesFromFile(filebotLogFilePath)
                    .stream()
                    .filter(line -> line.startsWith("[MOVE]"))
                    .map(this::getNewPathFromLine)
                    .filter(Objects::nonNull) //skipping
                    .collect(Collectors.toList());
        } catch (IOException e) {
            log("couldn't get the new paths from the filebot logs file :(");
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    private String getNewPathFromLine(String line) {
        try {
            return Optional.ofNullable(
                    StringCaptor.getMatchingSubstring(line, "to \\[(.*)\\]"))
                    .orElseThrow(() -> new IncorrectWorkingReferencesException("Couldn't find the new path for the line: "+line));
        } catch (IncorrectWorkingReferencesException e) {
            log(e.getMessage());
            return null; //to skip
        }
    }

    private List<String> readAllLinesFromFile(String filebotLogFilePath) throws IOException {
        return Files.readAllLines(getEnvPathFromConfig(filebotLogFilePath),
                isLocal()
                        ? Charset.forName("Cp1252")
                        : StandardCharsets.UTF_8);
    }

    private Path getEnvPathFromConfig(String filebotLogFilePath) {
        return Paths.get(
                isLocal()
                        ? getLocalLogsPathFromConfig(filebotLogFilePath)
                        : filebotLogFilePath);
    }

}
