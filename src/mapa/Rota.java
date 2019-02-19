package mapa;

import java.util.ArrayList;
import java.util.List;

public class Rota {
	List<Cidade> pontosDePassagem = new ArrayList<>();
	
	public Rota partindoDe(Cidade partida) {
		pontosDePassagem.add(partida);
		return this;
	}
	
	public Rota ePassandoPor(Cidade passagem) {
		pontosDePassagem.add(passagem);
		return this;
	}
	
	public Rota comDestinoEm(Cidade destino) {
		pontosDePassagem.add(destino);
		return this;
	}
	
	public Integer temADistanciaDe() {
		Integer distanciaTotal = 0;
		for(int i = 0; i < pontosDePassagem.size() - 1; i ++) {
			Cidade atual = pontosDePassagem.get(i);
			Cidade proxima = pontosDePassagem.get(i + 1);
			distanciaTotal += atual.distanciaDa(proxima);
		}
		return distanciaTotal;
	}
}
