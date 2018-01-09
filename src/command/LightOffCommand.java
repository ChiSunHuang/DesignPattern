package command;

public class LightOffCommand implements Command {

	private Light m_ligth;
	
	LightOffCommand(Light light){
		m_ligth = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		m_ligth.off();
	}

}
