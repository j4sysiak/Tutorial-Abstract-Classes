
public class Camera extends Machine {

	@Override
	public void start(){
		System.out.println("Camera started ...");
	}

	@Override
	public void stop() {
		System.out.println("Camera stop.");
		
	}

	@Override
	public void doSomeStuff() {
		System.out.println("Camera do Some Stuff");
		
	}

}
