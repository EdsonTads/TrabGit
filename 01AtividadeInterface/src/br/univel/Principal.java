package br.univel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {

	public static void main (String[] args){
		
//		Desenho d = new Quadrado();
//		Desenho d = new QuadradoProfessor();
//		Desenho d = new Zzzzz();
//		Desenho a = new ExA();
//		Desenho b = new ExB();
//		Desenho c = new ExC();
//		a.desenhar();
//		b.desenhar();
//		c.desenhar();

		List<Desenho> lista = new LinkedList<>();
		
		lista.add(new ExA());
		lista.add(new ExB());
		lista.add(new ExC());
//		lista.add(new novoc());
		lista.add(new ExD());
		lista.add(new ExE());
		lista.add(new ExJ());	
		
		for (Desenho d : lista){
			d.desenhar();
		}
	}
}
