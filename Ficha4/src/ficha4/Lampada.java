package ficha4;

public class Lampada {
	
	//atributos
	private int potencia;
	private boolean acesa;
	private boolean fundida;
	
	//getters e setters
	public boolean isAcesa () {
		return acesa;
	}

	public int getPotencia() {
		return potencia;
	}

	//construtores
	Lampada (int potencia) {
		this.potencia = potencia;
		acesa = false;
		fundida = false;
	}
	
	//construtor por defeito (para motivos de testes)
	Lampada () {
		potencia = 50;
		acesa = false;
		fundida = false;
	}
	
	//comportamentos
	
	//alternativa mudar estado 1
	//inicio alternatica 1
/*	public void mudaEstado () {
*		if (fundida == true) {
*			acesa = false;
*		} else {
*			podeFundir();
*			if (fundida == true) {
*				//reportar que fundiu?
*				acesa = false;
*			} else	acesa = !acesa;
*		}
*	}
*/
	//fim alternativa1
	
	//alternativa mudar estado 2
	//inicio alternativa 1
	public void mudaEstado() {
		if (acesa == false) {
			podeFundir();
			if(fundida == false) {
				podeMudarDeEstado();
			} 
		} else podeMudarDeEstado();
	}
	
	private void podeMudarDeEstado () {
		acesa = !acesa;
	}
	//fim alternativa 1
	
	private void podeFundir () {
		if (Math.random() <= 0.01) {
			System.out.println("Uma lampada fundiu.");
			fundida = true;
		}
		else
			fundida = false;
	}
}
