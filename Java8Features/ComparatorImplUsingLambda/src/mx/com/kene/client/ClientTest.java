package mx.com.kene.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import mx.com.kene.model.Employee;
import mx.com.kene.model.EmployeeNameSorter;

public class ClientTest {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sean", "sean@mail.com", 9000.00));
		empList.add(new Employee("Andrew", "andrew@mail.com", 7000.00));
		empList.add(new Employee("Martin", "martin@mail.com", 10000.00));
		
		System.out.println("List employees before sorting ...");
		empList.forEach(System.out::println);
		
		System.out.println("------------------------------------------------");
		
//		Collections.sort(empList, new EmployeeNameSorter());
		
	/*	Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
	*/	
		
		Collections.sort(empList, (e1, e2)-> e1.getName().compareTo(e2.getName()));
		
		System.out.println("List employees after sorting...");
		empList.forEach(System.out::println);
		
	}

}
