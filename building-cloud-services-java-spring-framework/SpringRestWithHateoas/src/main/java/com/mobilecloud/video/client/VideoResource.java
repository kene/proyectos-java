package com.mobilecloud.video.client;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mobilecloud.video.exceptions.VideoNotFoundException;
import com.mobilecloud.video.repository.Video;
import com.mobilecloud.video.repository.VideoRepository;



// class that to use to implement the controllers methods of HTTP request
// Tell spring the class will be annotated with @Controller and @ResponseBody 
// @Controller indicates that is web controller
// @ResponseBody indicate that methods should be bound to the web response body
//@RestController
public class VideoResource {

	// marks field as to be auto wired by Spring's dependency injection 
	@Autowired
	private VideoRepository videoRepository;

	// get all videos 
	// annotation for mapping HTTP GET request onto specific handler method
	@GetMapping(VideoSvcApi.VIDEO_SVC_PATH)
	public List<Video> retrieveAllVideos() {
		return (List<Video>) videoRepository.findAll();
	}

	// get one video by id
	//annotation for mapping HTTP GET request one onto specific handle method
	@GetMapping(VideoSvcApi.VIDEO_SVC_PATH+"/{id}")
	public EntityModel<Video> retrieveVideo(@PathVariable long id) {
		// use Optional object to see if the object contain a non-null value
		// If a value is present, isPresent() method will return true and get() method
		// will return the value
		Optional<Video> video = videoRepository.findById(id);

		if (!video.isPresent())
			throw new VideoNotFoundException("id-" + id);

		EntityModel<Video> resource = new EntityModel<Video>(video.get());

		WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).retrieveAllVideos());

		resource.add(linkTo.withRel("all-videos"));

		return resource;
	}
	
	// delete one video by id
	// annotation for mapping HTTP DELETE requests onto specific handler methods
	@DeleteMapping("/videos/{id}")
	public void deleteVideo(@PathVariable long id) {
		videoRepository.deleteById(id);
	}

	// create video by with passing one Video object for that purpose
	// annotation for mapping HTTP POST requests onto specific handler methods
	@PostMapping("/videos/{id}")
	public ResponseEntity<Video> createVideo(@RequestBody Video video) {
		Video savedVideo = videoRepository.save(video);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedVideo.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	// update video by id with passing the Video object and id for that purpose
	// annotation for mapping HTTP PUT requests onto specific handler methods
	@PutMapping("/videos/{id}")
	public ResponseEntity<Video> updateVideo(@RequestBody Video video, @PathVariable long id) {

		Optional<Video> videoOptional = videoRepository.findById(id);

		if (!videoOptional.isPresent())
			return ResponseEntity.notFound().build();

		video.setId(id);
		
		videoRepository.save(video);

		return ResponseEntity.noContent().build();
	}
	
	
	
}
