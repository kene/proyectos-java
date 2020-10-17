package com.mobilecloud.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.MediaType;

import com.mobilecloud.video.repository.VideoRepository;

@EnableJpaRepositories(basePackageClasses = VideoRepository.class)
@SpringBootApplication
public class Application implements RepositoryRestConfigurer{

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

        config.setDefaultMediaType(MediaType.APPLICATION_JSON);
        config.useHalAsDefaultJsonMediaType(false);
    }

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
//	@Override
//	public ObjectMapper halObjectMapper() {
//		return new ResourcesMapper();
//	}

}
