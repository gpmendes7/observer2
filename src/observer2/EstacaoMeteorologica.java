package observer2;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica  implements Subject {
	
	private List<Observer> observers;
	private float temperatura;
	private float umidade;
	private float pressao;
	
	public EstacaoMeteorologica() {
		observers = new ArrayList<>();
	}
	
	public void setMedicoes(float temperatura, 
			                float umidade,
			                float pressao) {
		this.temperatura = temperatura;
		this.umidade = umidade;
		this.pressao = pressao;
		
		notifyObservers();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeOberserver(Observer observer) {
		int index = observers.indexOf(observer);
		
		if(index > -1) {
			observers.remove(observer);
		}
		
	}

	@Override
	public void notifyObservers() {
		for(Observer o: observers) {
			o.update(temperatura, umidade, pressao);
		}
	}
	 
	
}
