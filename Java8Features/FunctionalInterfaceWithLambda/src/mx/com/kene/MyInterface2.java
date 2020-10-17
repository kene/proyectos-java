package mx.com.kene;


@FunctionalInterface
public interface MyInterface2 extends MyInterface1{
	default public void method3() {
		System.out.println("method2");
	}

}
