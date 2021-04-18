package br.edu.insper.desagil.myfood;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estabelecimento {
	private String nome;
	private Map<Integer, Item> itens;
	
	
	public Estabelecimento(String nome) {
		super();
		this.nome = nome;
		this.itens = new HashMap<>();
	}
	
	
	public String getNome() {
		return nome;
	}

	public void cadastra (int codigo, Item item) {
		this.itens.put(codigo, item);
	}
	
	public double processa (List<Integer> codigo) {
		double total = 0;
		for (int codigos: codigo) {
			total+=total+this.itens.get(codigos).getPreco();
		}
		return total;
	}
	
}
