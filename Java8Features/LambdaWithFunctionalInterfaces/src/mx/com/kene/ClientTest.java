package mx.com.kene;

public class ClientTest {

	public static void main(String[] args) {
		MyInterface1 myInterface1 = () -> System.out.println("This methods executes using lambda..");
		myInterface1.method1();
		
		
		System.out.println("-------------------------------");
		
		MyInterface2 myInterface2 = (name) ->{
				System.out.println("Your name is " + name);
			};
		
		myInterface2.method2("Kene");
		
		System.out.println("-------------------------------");
		
		
		MyInterface3 myInterface3 = (String name, int age) ->{
			System.out.println("Your name is " + name);
			System.out.println("You are " + age);
		};
		
		myInterface3.method3("Kene", 35);
		
		
		
		
	}

}
