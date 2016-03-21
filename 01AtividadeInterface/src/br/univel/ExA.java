package br.univel;

//public class ExA implements Desenho {
public class ExA extends DesenhoAbstrato{
	
	public static int ALTURA = 8;
	
	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "a";
	}
	@Override
	public void desenhar() {
		
//		System.out.print("a)\n\n");
		identificar();
		
		
		int caracteres = 1;
		for (int linha = 0; linha < 8; linha++){
			for (int coluna = 0; coluna < caracteres; coluna++){
				System.out.print("*");
			}
			caracteres++;
			System.out.print("\n");
		}
	}
}
