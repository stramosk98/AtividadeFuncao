package Funcao;

public class Exercicio01 {

public static void main(String[] args) {
		
		System.out.println(mostrarTop(5));
	}
	
	public static String mostrarTop(int n) {
	
		StringBuilder saida = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
			saida.append(i);
			saida.append(" ");	
		}
			
			saida.append("\n");
		}
		
		return saida.toString();
}
}