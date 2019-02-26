
public class App {
	 
	public static void main(String[] args) {
		
		Camera camera1 = new Camera();
		camera1.setId(1);
		
		Car car1 = new Car();
		car1.setId(2);
		
		/*
		Cannot instantiate the Abstract type of Class Machine    
		Machine machine1 = new Machine();
		*/
		
		camera1.run();
		car1.run();
	}
}

 