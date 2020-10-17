package mx.com.kene;

@FunctionalInterface
public interface MyInterface1 {

	void method1();
	
	default public void method2() {
		System.out.println("method2");
	}
}
