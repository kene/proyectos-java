package mx.com.mobilecloud.student.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import mx.com.mobilecloud.course.model.Course;
import mx.com.mobilecloud.student.service.StudentService;

@RestController
public class StudentController {

	
	
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students/{studentId}/courses")
	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId){
		return studentService.retrieveCourses(studentId);
	}
	
	
	@PostMapping("/students/{studentId}/courses/{coursesId}")
	public Course retrieveDetailsForCourse(@PathVariable String studentId, @PathVariable String courseId) {
		return studentService.retrieveCourse(studentId, courseId);
	}
	
	
	@PostMapping("/students/{studentId}/courses")
	public ResponseEntity<Void> registerStudentForCourse(
			@PathVariable String studentId, @RequestBody Course newCourse){
		Course course = studentService.addCourse(studentId, newCourse);
		
		if(course == null) {
			return ResponseEntity.noContent().build();
		}
			
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}")
				.buildAndExpand(course.getId()).toUri();
			
		return ResponseEntity.created(location).build();	
		
	}
	
	
	
	
	
}
