package observer2;

import java.util.Observable;
import java.util.Observer;

public class MediaDisplay implements Observer {
	
	private Observable subject;
	private float temperaturaMin, temperaturaMax, temperaturaMed;
	private float umidadeMin, umidadeMax, umidadeMed;
	private float pressaoMin, pressaoMax, pressaoMed;
	
	public MediaDisplay(Observable subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	public void display() {
		System.out.println("Temperatura média: " + temperaturaMed);
		System.out.println("Umidade média: " + umidadeMed);
		System.out.println("Pressao média: " + pressaoMed);
	}

	@Override
	public void update(Observable observable,
			           Object data) {
		
		EstacaoMeteorologica estacao = (EstacaoMeteorologica) observable;
		
		mediaTemperatura(estacao.getTemperatura());
		mediaUmidade(estacao.getUmidade());
		mediaPressao(estacao.getPressao());
		display();
	}
	
	public void mediaTemperatura(float temperaturaMed) {
		this.temperaturaMed = temperaturaMed;
	}
	
	public void mediaUmidade(float umidadeMed) {
		this.umidadeMed = umidadeMed;
	}
	
	public void mediaPressao(float pressaoMed) {
		this.pressaoMed = pressaoMed;
	}
	
}
