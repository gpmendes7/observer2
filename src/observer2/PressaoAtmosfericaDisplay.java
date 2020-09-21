package observer2;

import java.util.Observable;
import java.util.Observer;

public class PressaoAtmosfericaDisplay implements Observer {
	
	private Observable subject;
	private float temperatura;
	private float pressao;
	
    public PressaoAtmosfericaDisplay(Observable subject) {
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
	public void update(Observable observable,
			           Object data) {
		
		EstacaoMeteorologica estacao = (EstacaoMeteorologica) observable;
		
		this.temperatura = estacao.getTemperatura();
		this.pressao = estacao.getPressao();
		display();
	}

}
