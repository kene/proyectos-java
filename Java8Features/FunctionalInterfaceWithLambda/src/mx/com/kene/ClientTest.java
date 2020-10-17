package mx.com.kene;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
//		createThreadUsingAnonymousClass();
//		createThreadUsingLambdaExpression();

		List<String> nameList = new ArrayList<>();

		nameList.add("Sean");
		nameList.add("Adel");
		nameList.add("Paul");

//		nameList.forEach((name) -> System.out.println(name)); // lamda expression short
		nameList.forEach(System.out::println);  // method reference

	}

	private static void createThreadUsingLambdaExpression() {
		Runnable r = () -> {
			System.out.println("My Task is executing..");

		};

		Thread thread = new Thread(r);
		thread.start();
	}

	private static void createThreadUsingAnonymousClass() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("My Task is executing..");

			}
		};

		Thread thread = new Thread(r);
		thread.start();
	}
}
