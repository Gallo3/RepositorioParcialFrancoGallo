package EjercicioParcialFrancoGallo;

public class Motor {
	private boolean enciendeMotor;
	public Motor() {
		this.enciendeMotor=false;
	}
	public boolean getEnciendeMotor() {
		return enciendeMotor;
	}
	public void apagarMotor() {
		this.enciendeMotor=false;
	}
	public void encenderMotor() {
		this.enciendeMotor=true;
	}	
}
