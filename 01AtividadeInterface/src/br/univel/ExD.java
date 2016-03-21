package br.univel;

//public class ExD implements Desenho {
public class ExD extends DesenhoAbstrato {
		 	 
	public static int ALTURA = 8;

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "d";
	}
	@Override
	public void desenhar() {

		identificar();
		
//		System.out.print("d)\n\n");

		int brancos = ALTURA;
		for (int linha = 0; linha <= 8; linha++) {
			for (int coluna = 0; coluna <= ALTURA; coluna++) {
				if (coluna > brancos) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			brancos--;
			System.out.print("\n");
		}
	}
}
