package br.edu.insper.desagil.myfood;

public abstract class Item {
	private String nome;

	public Item(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public abstract double getPreco();
	
	

}
