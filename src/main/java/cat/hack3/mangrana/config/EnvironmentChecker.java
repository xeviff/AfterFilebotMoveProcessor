package cat.hack3.mangrana.config;

import org.apache.commons.lang.StringUtils;

public class EnvironmentChecker {

    public static boolean isLocal () {
        String envVar = System.getenv("ENV");
        return
                StringUtils.isNotEmpty(envVar)
                && envVar.equals("local");
    }
}
