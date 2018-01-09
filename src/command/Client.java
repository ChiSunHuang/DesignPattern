package command;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Light light = new Light();
		LightOnCommand mLightOnCommand = new LightOnCommand(light);
		LightOffCommand mLightOffCommand = new LightOffCommand(light);
		RemoteController mRemoteController = new RemoteController(mLightOnCommand,mLightOffCommand);
		mRemoteController.onButtonWasPressed();
		mRemoteController.offButtonWasPressed();
	}

}
