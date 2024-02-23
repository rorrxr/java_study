package ez0221.java.exam08;

public class Radio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Radio TurnOn");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Radio TurnOff");
		
	}

}
