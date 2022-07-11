package cat.hack3.mangrana.filebot.results;

import cat.hack3.mangrana.exception.IncorrectWorkingReferencesException;
import cat.hack3.mangrana.utils.StringCaptor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static cat.hack3.mangrana.utils.Output.log;

public class FilebotLogsExtractor {

    public List<String> getNewPathsFromFileBotLogFile(String filebotLogFilePath) {
        try  {
            return Files.readAllLines(Paths.get(filebotLogFilePath))
                    .stream()
                    .filter(line -> line.startsWith("[MOVE]"))
                    .map(this::getNewPathFromLine)
                    .filter(Objects::nonNull) //skipping
                    .collect(Collectors.toList());
        } catch (IOException e) {
            log("couldn't get the new paths from the filebot logs file :(");
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

}
