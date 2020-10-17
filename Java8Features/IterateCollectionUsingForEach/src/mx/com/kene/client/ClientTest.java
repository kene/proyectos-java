package mx.com.kene.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import mx.com.kene.model.Student;

public class ClientTest {
	
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Leo", 39));
		students.add(new Student("Karls", 23));
		students.add(new Student("Robert", 43));
		students.add(new Student("Roger", 34));
		
		
		students.forEach(System.out::println);
		
		
	}	

}

