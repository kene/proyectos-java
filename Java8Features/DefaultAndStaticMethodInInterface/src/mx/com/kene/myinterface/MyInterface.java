package mx.com.kene.myinterface;

import java.util.Collections;
import java.util.List;

import mx.com.kene.model.Student;

public interface MyInterface {
	
	default public List<Student> sortStudents(List<Student> students){
		Collections.sort(students);
		return students;
	}
	
	public static void greet(String name) {
		System.out.println("Welcome " + name);
	}
	
	
	public abstract Integer getMaxNum(List<Integer> intList);

}
