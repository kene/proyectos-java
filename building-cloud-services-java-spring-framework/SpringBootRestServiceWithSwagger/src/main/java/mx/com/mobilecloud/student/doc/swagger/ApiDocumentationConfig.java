package mx.com.mobilecloud.student.doc.swagger;

import io.swagger.annotations.Contact;
import io.swagger.annotations.ExternalDocs;
import io.swagger.annotations.Info;
import io.swagger.annotations.License;
import io.swagger.annotations.SwaggerDefinition;

@SwaggerDefinition(
		info = @Info(
				description = "Awesome Resources",
				version = "V1",
				title = "Student Resources API",
				contact = @Contact(
						name = "Kene",
						email = "",
						url = ""
						),
				license = @License(
						name = "Apache 2.0",
						url = "http://wwww.apache.org/license/LICENSE-2.0"
						) 
				),
				consumes = {"application/json", "application/xml"},
				produces = {"application/json", "application/xml"},
				schemes = { SwaggerDefinition.Scheme.HTTP, SwaggerDefinition.Scheme.HTTPS},
				externalDocs = @ExternalDocs(value = "Read this for sure", url = "http://education.org")		
		)

public interface ApiDocumentationConfig {

}
