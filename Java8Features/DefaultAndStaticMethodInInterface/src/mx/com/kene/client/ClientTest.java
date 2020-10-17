package mx.com.kene.client;

import java.util.ArrayList;
import java.util.List;

import mx.com.kene.model.Student;
import mx.com.kene.myinterface.MyInterface;
import mx.com.kene.myinterfaceImpl.MyClass;

public class ClientTest {
	
	public static void main(String[] args) {
		
		
		MyInterface myInterface = new MyClass();
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Josh", 21));
		students.add(new Student("Yess", 23));
		students.add(new Student("Abella", 30));
		students.add(new Student("Sean", 19));
		
		List<Student> sortStudents = myInterface.sortStudents(students);
		
		
		for (Student student : sortStudents) {
			System.out.println(student.getName() + "\t" + student.getAge());
		}
		
		
		System.out.println("------------------------------------------");
		
		MyInterface.greet("Kene");
		
		
		System.out.println("-------------------------------------------");
		
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1000);
		intList.add(15);
		intList.add(140);
		intList.add(120);
		intList.add(90);
		
		Integer maxNum = myInterface.getMaxNum(intList);
		
		System.out.println("Max Num: " + maxNum);
		
	}

}
