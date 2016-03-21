package br.univel;

/**
 * 		Desenhe a figura abaixo com largura = SIZE 10;
 * 
 * 		****
 *  	*  *
 *  	*  *
 *  	****  
 *
 */

public class Quadrado implements Desenho {

	public static int SIZE = 10;
	
	@Override
	public void desenhar() {
		// TODO Auto-generated method stub
		System.out.println("Desenhando Quadrado");
		System.out.println("**********");
		System.out.println("*        *");
		System.out.println("*        *");
		System.out.println("*        *");
		System.out.println("**********");

	}

}
