package mapa;

import java.util.ArrayList;
import java.util.List;

public class Cidade {
	private String nome;
	private List<CidadeVizinha> cidadesVizinhas = new ArrayList<>();
	
	public Cidade(String nome) {	
		this.nome = nome;
	}
	
	public CidadeVizinha fazVizinhancaCom(Cidade cidade) {
		CidadeVizinha vizinha = new CidadeVizinha(cidade);
		this.cidadesVizinhas.add(vizinha);
		return vizinha;
	}
	
	public Integer distanciaDa(Cidade cidade) {
		for(CidadeVizinha vizinha : cidadesVizinhas) {
			if(vizinha.getCidade().equals(cidade)) {
				return vizinha.getDistancia();
			}
		}
		return 0;
	}

}
