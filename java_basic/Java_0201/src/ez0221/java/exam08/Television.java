package ez0221.java.exam08;

public class Television implements RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("Television TurnOn");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Television TurnOff");
		
	}
}
