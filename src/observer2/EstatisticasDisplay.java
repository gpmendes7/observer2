package observer2;

import java.util.Observable;
import java.util.Observer;

public class EstatisticasDisplay implements Observer {
	
	private Observable subject;
	private float temperatura;
	private float umidade;
	private float pressao;
	
	public EstatisticasDisplay(Observable subject) {
		this.subject = subject;
		this.subject.addObserver(this);
	}
	
	private void display() {
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Umidade: " + umidade);
		System.out.println("Pressão: " + pressao);
	}

	@Override
	public void update(Observable observable, 
			           Object data) {
		
		EstacaoMeteorologica estacao = (EstacaoMeteorologica) observable;
		
		this.temperatura = estacao.getTemperatura();
		this.umidade = estacao.getUmidade();
		this.pressao = estacao.getPressao();
		display();
	}
	
}
