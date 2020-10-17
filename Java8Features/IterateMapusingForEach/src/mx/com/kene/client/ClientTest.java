package mx.com.kene.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import mx.com.kene.model.Employee;

public class ClientTest {

	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<>();
		map.put(1922, new Employee("Sean", "sean@mail.com", 9000.00));
		map.put(1923, new Employee("Andrew", "andrew@mail.com", 7000.00));
		map.put(1944, new Employee("Martin", "martin@mail.com", 10000.00));

		Set<Entry<Integer, Employee>> entrySet = map.entrySet();

		for (Entry<Integer, Employee> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		System.out.println("-----------------------------------------------");

		Set<Integer> keySet = map.keySet();

		for (Integer key : keySet) {
			System.out.println(key);
			System.out.println(map.get(key));
		}

		System.out.println("-----------------------------------------------");

		map.forEach((k, v) -> {
			System.out.println(k + "\t" + v);
		});

	}

}
