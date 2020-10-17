package mx.com.kene;

public class Test {

	public static void main(String[] args) {

		int x = 30;
		int y = 40;

		Test.doOperate(x, n -> System.out.println(n + y));

	}

	private static void doOperate(int i, Operation o) {
		o.operate(i);
	}

}
