package observer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class EstacaoMeteorologica extends Observable {
	
	private float temperatura;
	private float umidade;
	private float pressao;
	
	public void setMedicoes(float temperatura, 
			                float umidade,
			                float pressao) {
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
		
		setChanged();
		notifyObservers();
	}
	
	public float getTemperatura() {
		return temperatura;
	}
	
	public float getUmidade() {
		return umidade;
	}
	
	public float getPressao() {
		return pressao;
	}
	 
}

