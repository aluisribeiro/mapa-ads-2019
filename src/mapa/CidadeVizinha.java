package mapa;

public class CidadeVizinha{
	private Cidade cidade;
	private Integer distancia;
	
	public CidadeVizinha(Cidade cidade) {
		this.cidade = cidade;
	}	
	
	public void aUmaDistanciaDe(Integer distancia) {
		this.distancia = distancia;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	
	public Integer getDistancia() {
		return distancia;
	}

	
}
