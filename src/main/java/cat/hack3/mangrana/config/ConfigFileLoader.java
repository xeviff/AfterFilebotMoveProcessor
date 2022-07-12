package cat.hack3.mangrana.config;

import cat.hack3.mangrana.exception.IncorrectWorkingReferencesException;
import com.amihaiemil.eoyaml.Yaml;
import com.amihaiemil.eoyaml.YamlMapping;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static cat.hack3.mangrana.config.LocalEnvironmentManager.LOCAL_PROJECT_PATH;
import static cat.hack3.mangrana.config.LocalEnvironmentManager.isLocal;
import static cat.hack3.mangrana.utils.Output.log;

public class ConfigFileLoader {

    private static final String CONFIG_FOLDER = "/config";
    private static final String CONFIG_FILE = "RadarrFixerConfig.yml";
    private static final String RADARR_API_KEY = "radarr_api_key";
    private static final String RADARR_HOST_KEY = "radarr_api_host";
    private static final String LOGS_FILES_KEY = "logs_files";
    private static final String CURRENT_PATHS_KEY = "current_possible_paths";

    private final String apiKey;
    private final String host;
    private final List<String> possibleCurrentLocations;
    private final List<LogsFilesInfo> logsFilesInfoList;

    public ConfigFileLoader() throws IncorrectWorkingReferencesException {
        log("Loading values from the config file...");
        try {
            YamlMapping config = Yaml.createYamlInput(
                    new File(getConfigFolder().concat("/").concat(CONFIG_FILE)))
                    .readYamlMapping();

            apiKey = Optional.ofNullable(
                     config.string(RADARR_API_KEY))
                     .orElseThrow(() -> new IncorrectWorkingReferencesException("Couldn't retrieve the API key :(") );
            host = Optional.ofNullable(
                     config.string(RADARR_HOST_KEY))
                     .orElseThrow(() -> new IncorrectWorkingReferencesException("Couldn't retrieve the HOST :(") );
            possibleCurrentLocations = Optional.ofNullable( (List<String>)
                     config.literalBlockScalar(CURRENT_PATHS_KEY))
                     .orElseThrow(() -> new IncorrectWorkingReferencesException("Couldn't retrieve the current possible paths :(") );
            List<String> logsFiles = Optional.ofNullable( (List<String>)
                     config.literalBlockScalar(LOGS_FILES_KEY))
                    .orElseThrow(() -> new IncorrectWorkingReferencesException("Couldn't retrieve the logs files list :(") );
            logsFilesInfoList = generateLogsFilesInfo(logsFiles);
        } catch (IOException e) {
            throw new IncorrectWorkingReferencesException("couldn't find the config file :(");
        }
    }

    private String getConfigFolder(){
        return (isLocal() ? LOCAL_PROJECT_PATH : "")
                + CONFIG_FOLDER;
    }

    private List<LogsFilesInfo> generateLogsFilesInfo(List<String> logsFilesConfig) {
       return logsFilesConfig
                .stream()
                .map(this::mapInfoTextToBean)
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private LogsFilesInfo mapInfoTextToBean(String logsFileInfo) {
        try {
            String[] splitInfo = logsFileInfo.split(":", 2);
            return new LogsFilesInfo(splitInfo[0], splitInfo[1].toUpperCase());
        } catch (IllegalArgumentException e) {
            log("The action was not well defined in the config file. Skipping...");
            e.printStackTrace();
            return null;
        }
    }

    public String getApiKey() {
        return apiKey;
    }
    public String getHost() {
        return host;
    }
    public List<LogsFilesInfo> getLogsFilesInfoList() {
        return logsFilesInfoList;
    }
    public List<String> getPossibleCurrentLocations() {
        return possibleCurrentLocations;
    }
}
