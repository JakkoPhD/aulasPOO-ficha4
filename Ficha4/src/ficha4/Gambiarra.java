package ficha4;

import java.util.Map;
import java.util.TreeMap;

public class Gambiarra {

	// atributos
	private int numLampadas;
	private boolean temEnergia;

	// acessores
	public int getNumLampadas() {
		return numLampadas;
	}

	public void setNumLampadas(int numLampadas) {
		this.numLampadas = numLampadas;
		instalarLampadas();
	}

	public boolean isTemEnergia() {
		return temEnergia;
	}

	public void setTemEnergia(boolean temEnergia) {
		this.temEnergia = temEnergia;
	}

	// construtores
	Gambiarra(int numLampadas) {
		this.numLampadas = numLampadas;
		instalarLampadas();
		temEnergia = false;
	}

	Gambiarra() {
		temEnergia = false;
	}

	// comportamentos

	/*
	 * Solução para criar vários objetos com um ciclo tirado de:
	 * http://stackoverflow.com/questions/19590265
	 * 		/how-to-define-a-java-object-name-with-a-variable
	 * 
	 * You seem to want to store and access objects using strings as a key. The
	 * way to do this is using a Map.
	 * 
	 * Map<String,Cell> myMap = new TreeMap<String,Cell>();
	 * 
	 * myMap.put("AA", new Cell(...)); 
	 * myMap.put("AB", new Cell(...));
	 * 
	 * ...
	 * 
	 * Cell currentCell = myMap.get("AA");
	 * 
	 * Map is an interface. TreeMap is just one class that provides an 
	 * implementation of the Map interface. Read up on the various 
	 * implementations of Map provided by the standard JRE.
	 * 
	 * The key doesn't have to be a String. Anything that implements equals()
	 * can be used as a key.
	 * 
	 * Using this:
	 * 
	 * for(char c = 'A'; c <= 'L'; c++) {
	 *    for(char d = 'A'; d<= 'L'; d++) {
	 *       myMap.put("" + c + d, new Cell(...)); 
	 *   } 
	 * }
	 * 
	 * Minha interpretação:
	 * Generalização do comando: Map<String,Cell> myMap = new TreeMap<String,Cell>();
	 * Map<TipoDeDadoDeIdentificação,TipoDeDadoDeIdentificado(Objeto)> 
	 * 		nomeDaVariavelDoMap = 
	 * 		new TreeMap<TipoDeDadoDeIdentificação,Objeto>;
	 * 
	 * Generalização do comando: myMap.put("" + c + d, new Cell(...));
	 * nomeDaVariavelDoMap.put(dadoDeIdentificação, new Objeto());
	 * 
	 * Aqui queria usar um vetor do objeto Lampada, no entanto não o posso fazer
	 * diretamente. Ao usar Map posso criar o numero de lampadas que quizer e 
	 * dar-lhes a referencia lampadaNumero1, lampadaNumero2, etc...
	 */
	
	//usa construtor por defeito (para testes)
	private void instalarLampadas() {
		Map<String, Lampada> lampadas = new TreeMap<String, Lampada>();
		for (int i = 1; i <= numLampadas; i++) {
			lampadas.put("lampadaNumero" + i, new Lampada());
		}
	}
	
	private void instalarLampadas(int potencia) {
		Map<String, Lampada> lampadas = new TreeMap<String, Lampada>();
		for (int i = 1; i <= numLampadas; i++) {
			lampadas.put("lampadaNumero" + i, new Lampada(potencia));
		}
	}
	
}
