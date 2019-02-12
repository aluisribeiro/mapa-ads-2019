package mapa;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
	private String nome;
	private List<CidadeVizinha> cidadesVizinhas = new ArrayList<>();
	
	public Cidade(String nome) {	
		this.nome = nome;
	}
	
	public void fazVizinhancaCom(Cidade cidade, Integer distancia) {
		CidadeVizinha vizinha = new CidadeVizinha(cidade, distancia);
		this.cidadesVizinhas.add(vizinha);
	}

}
