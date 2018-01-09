package command;

public class RemoteController {
	
	private Command onCommand;
	private Command offCommand;
	RemoteController(Command onCommand,Command offCommand){
		this.onCommand = onCommand;
		this.offCommand = offCommand;
	}
	
	public void onButtonWasPressed() {
		onCommand.execute();
	}
	
	public void offButtonWasPressed() {
		offCommand.execute();
	}
}
