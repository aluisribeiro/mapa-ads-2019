package mapa;

public class Programa {

	public static void main(String[] args) {
		Cidade casaBranca = new Cidade("Casa Branca");
		Cidade vargem = new Cidade("Vargem Grande");
		Cidade saoJoao = new Cidade("São João");
		Cidade grama = new Cidade("Grama");
		Cidade prata = new Cidade("Prata");
		
		casaBranca.fazVizinhancaCom(vargem, 10);
		vargem.fazVizinhancaCom(casaBranca, 10);
		vargem.fazVizinhancaCom(saoJoao, 20);
		
		
	}

}
