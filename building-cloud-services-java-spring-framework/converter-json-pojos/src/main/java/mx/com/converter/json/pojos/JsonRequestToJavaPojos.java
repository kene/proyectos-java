package mx.com.converter.json.pojos;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.GsonAnnotator;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.sun.codemodel.JCodeModel;

public class JsonRequestToJavaPojos  {

	public static void convertJsonRequestToPojos() {

		File file = new File("src/main/java");
		String basePath = file.getAbsolutePath();

		// convert json to pojos
		String packageName = "mx.com.weather.stack.models";
		File inputJson = new File(basePath + "/weather_request.json");		
		File outputPojoDirectory = new File("src/main/java/mx/com/weather/stack/models");
		outputPojoDirectory.mkdirs();
		
		try {
			convert2JSONWithGsonAnnotator(inputJson.toURI().toURL(), outputPojoDirectory, packageName,
					inputJson.getName().replace(".json", ""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Encountered issue while converting to pojo: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void convert2JSONWithJacksonAnnotator(URL inputJson, File outputPojoDirectory, String packageName, String className)
			throws IOException {
		JCodeModel codeModel = new JCodeModel();
		URL source = inputJson;
		GenerationConfig config = new DefaultGenerationConfig() {
			@Override
			public boolean isGenerateBuilders() { // set config option by overriding method
				return true;
			}

			public SourceType getSourceType() {
				return SourceType.JSON;
			}
		};
		SchemaMapper mapper = new SchemaMapper(
				new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
		mapper.generate(codeModel, "WeatherRequest", packageName, source);
		codeModel.build(outputPojoDirectory);
	}
	
	
	//TODO: Kene check how to fix the problem when write the package with name's written twice
	public static void convert2JSONWithGsonAnnotator(URL inputJson, File outputPojoDirectory, String packageName, String className) {
        JCodeModel codeModel = new JCodeModel();        
        try {
            URL source= inputJson;
            GenerationConfig config = new DefaultGenerationConfig() {
                @Override
                public boolean isGenerateBuilders() {
                return true;
                }
                public SourceType getSourceType(){
                    return SourceType.JSON;
                }
                };
                
                SchemaMapper mapper =new SchemaMapper(new RuleFactory(config, new GsonAnnotator(config), new SchemaStore()), new SchemaGenerator());
                mapper.generate(codeModel, "WeatherRequest", packageName, source);
            File dir = outputPojoDirectory;
            if(dir.exists()){
                System.out.println("Directory is available");
                codeModel.build(dir);
            }else{
                System.out.println("Directory is not available");
            }

        } catch (MalformedURLException e) {
            System.err.println(e.getCause());
        } catch (IOException e) {
        	System.err.println(e.getCause());
        }       
	}

}
