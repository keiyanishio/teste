package br.edu.insper.desagil.myfood;

import java.util.List;

public class ItemCombo extends Item{
	private double desconto;
	private List<ItemComum> itens; 

	public ItemCombo(String nome, double desconto, List<ItemComum> itens) {
		super(nome);
		this.desconto = desconto;
		this.itens = itens;
	}

	@Override
	public double getPreco() {
		double preco = 0;
		for (ItemComum item: this.itens) {
			preco+=preco+item.getPreco();
		}
		return preco*this.desconto;
	}

	
	

	
	

}
