package br.edu.insper.desagil.myfood;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyFoodTest {
	private static double DELTA = 0.01;
	
	private Estabelecimento e;
	private List<Integer> codigos;

	@BeforeEach
	private void setUp() {
		e = new Estabelecimento("Bobs");
		codigos = new ArrayList<>();
	}
	
	@Test
	public void tresComumns(){
		e.cadastra(1, new ItemComum("coca-cola", 5.25));
		e.cadastra(2, new ItemComum("guarana", 5.25));
		e.cadastra(5, new ItemComum("hamburguer", 9.00));
		
		codigos.add(1);
		codigos.add(5);
		
		assertEquals(14.25, e.processa(codigos), DELTA);
		
	}

}
