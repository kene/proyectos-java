package mx.com.kene;

public class ClientTest {

	public static void main(String[] args) {
		Myinterface myinterface = (n1, n2) -> n1 > n2;
		
		System.out.println(myinterface.test(1, 2));
		System.out.println(myinterface.test(20, 10));

	}

}
