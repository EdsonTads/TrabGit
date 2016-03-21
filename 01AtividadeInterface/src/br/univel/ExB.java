package br.univel;

public class ExB implements Desenho {

	public static int ALTURA = 8;
	@Override
	public void desenhar() {
		
		System.out.print("b)\n\n");
		
		int caracteres = ALTURA;
		for (int linha = 0; linha < 8; linha++){
			for (int coluna = 0; coluna < caracteres; coluna++){
				System.out.print("*");
			}
			caracteres--;
			System.out.print("\n");
		}
	}
}
