package mx.com.kene;

public class Welcome implements I1, I2 {

	@Override
	public void display() {
		I1.super.display();
	}
	
	public static void main(String[] args) {
		Welcome welcome = new Welcome();
		
		welcome.display();
	}

}
