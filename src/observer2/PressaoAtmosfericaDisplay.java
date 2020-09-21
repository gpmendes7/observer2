package observer2;

public class PressaoAtmosfericaDisplay implements Observer {
	
	private Subject subject;
	private float temperatura;
	private float pressao;
	
    public PressaoAtmosfericaDisplay(Subject subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
    
    public float calcPressaoAtmosferica() {
    	return pressao;
    }
	
	public void display() {
		System.out.println("Pressão atmosférica: " + calcPressaoAtmosferica());
	}

	@Override
	public void update(float temperatura, 
			           float umidade, 
			           float pressao) {
		this.temperatura = temperatura;
		this.pressao = pressao;
		display();
	}

}
