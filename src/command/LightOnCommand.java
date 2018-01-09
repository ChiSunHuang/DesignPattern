package command;

public class LightOnCommand implements Command {

	private Light m_ligth;
	
	LightOnCommand(Light light){
		m_ligth = light;
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		m_ligth.on();
	}
}
