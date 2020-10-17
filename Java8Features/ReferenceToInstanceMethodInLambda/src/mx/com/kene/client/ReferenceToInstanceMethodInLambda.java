package mx.com.kene.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import mx.com.kene.model.Person;

public class ReferenceToInstanceMethodInLambda {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		
		persons.add(new Person("Carls", 34));
		persons.add(new Person("Roger", 20));
		persons.add(new Person("Doyer", 40));
		persons.add(new Person("Alex", 45));
		
		
		List<String> personsName = ReferenceToInstanceMethodInLambda.getPersonsName(persons, Person::getName);
		
		personsName.forEach(System.out::println);
		
	}
	
	
	private static List<String> getPersonsName(List<Person> persons, Function<Person, String> f) {
		List<String> names = new ArrayList<>();
		persons.forEach(n->names.add(f.apply(n)));
		
		return names;
	}

}
