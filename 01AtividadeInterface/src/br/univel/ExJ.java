package br.univel;

public class ExJ implements Desenho {

	public static int ALTURA = 12;
	
	@Override
	public void desenhar() {

		System.out.print("j)\n\n");

		for (int linha = 0; linha < ALTURA ; linha++) {
			for (int coluna = 0; coluna < ALTURA; coluna++) {
				if (coluna == 0 || coluna > linha) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
