package cat.hack3.mangrana.utils;

import com.sun.codemodel.JCodeModel;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class ClassGeneratorFromJson {

    public static void main(String[] args) throws IOException {
        ClassGeneratorFromJson me = new ClassGeneratorFromJson();
        me.convertJsonToJavaClass(
                new URL("https://mangrana-radarr.hack3.cat/api/v3/movie?tmdbId=651571&apikey=xxxxxxx"),
                new File("."),
                "cat.hack3.mangrana.radarr.api.schema",
                "MovieResource");
    }

    public void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName)
            throws IOException {
        JCodeModel jcodeModel = new JCodeModel();

        GenerationConfig config = new DefaultGenerationConfig() {
            @Override
            public boolean isGenerateBuilders() {
                return true;
            }

            @Override
            public SourceType getSourceType() {
                return SourceType.JSON;
            }
        };

        SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
        mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

        jcodeModel.build(outputJavaClassDirectory);
    }
}

