package mx.com.kene.test;

public class Test {

	public static void main(String[] args) {
		
		MyComparator myComparator = (int n1, int n2)-> { return n1>n2; };
		boolean compare = myComparator.compare(40, 30);
		
		System.out.println(compare);
	}

}
