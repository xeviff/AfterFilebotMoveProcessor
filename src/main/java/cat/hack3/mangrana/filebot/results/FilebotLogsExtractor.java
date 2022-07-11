package cat.hack3.mangrana.filebot.results;

import cat.hack3.mangrana.exception.IncorrectWorkingReferencesException;
import cat.hack3.mangrana.utils.StringCaptor;
import com.amihaiemil.eoyaml.Yaml;
import com.amihaiemil.eoyaml.YamlMapping;
import com.amihaiemil.eoyaml.YamlSequence;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static cat.hack3.mangrana.utils.Output.log;

public class FilebotLogsExtractor {

    public List<String> getNewPathsFromFileBotLogFile(String filebotLogFilePath) throws IncorrectWorkingReferencesException {
        try  {
            return Files.readAllLines(Paths.get(filebotLogFilePath))
                    .stream()
                    .filter(line -> line.startsWith("[MOVE]"))
                    .collect(Collectors.toList())
                    .stream()
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
