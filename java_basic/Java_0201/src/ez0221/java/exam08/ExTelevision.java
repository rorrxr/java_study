package ez0221.java.exam08;

public class ExTelevision {

	public static void main(String[] args) {
		// Television television = new Television();
		RemoteControl television = new Television();
		// RemoteControl remoteConrol = new Radio();
		RemoteControl remoteConrol = new Television();

		
		television.turnOn();
		television.turnOff();
		remoteConrol.turnOn();
		remoteConrol.turnOff();
		

		
	}

}
