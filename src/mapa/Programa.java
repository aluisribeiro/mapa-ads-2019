package mapa;

public class Programa {

	public static void main(String[] args) {
		Cidade casaBranca = new Cidade("Casa Branca");
		Cidade vargem = new Cidade("Vargem Grande");
		Cidade saoJoao = new Cidade("São João");
		Cidade grama = new Cidade("Grama");
		Cidade prata = new Cidade("Prata");

		casaBranca
		.fazVizinhancaCom(vargem)
		.aUmaDistanciaDe(10);
		
		vargem
		.fazVizinhancaCom(casaBranca)
		.aUmaDistanciaDe(10);
		
		vargem
		.fazVizinhancaCom(saoJoao)
		.aUmaDistanciaDe(20);
		
		vargem
		.fazVizinhancaCom(grama)
		.aUmaDistanciaDe(15);
		
		grama
		.fazVizinhancaCom(vargem)
		.aUmaDistanciaDe(15);
		
		saoJoao
		.fazVizinhancaCom(vargem)
		.aUmaDistanciaDe(20);
		
		saoJoao
		.fazVizinhancaCom(prata)
		.aUmaDistanciaDe(10);
		
		prata
		.fazVizinhancaCom(saoJoao)
		.aUmaDistanciaDe(10);

		Integer distancia = new Rota()
				.partindoDe(casaBranca)
				.ePassandoPor(vargem)
				.ePassandoPor(saoJoao)
				.comDestinoEm(prata)
				.temADistanciaDe();
		
		System.out.println("A distância total é de: " + distancia);

	}

}
