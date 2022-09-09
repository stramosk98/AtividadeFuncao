package Funcao;

public class Exercicio09 {

public static void main(String[] args) {
		
	System.out.println(mostrarRev(12345));
}

public static String mostrarRev(int n) {
	StringBuilder saida = new StringBuilder();
	
	String str_n = String.valueOf(n);
	char x[] = new char [str_n.length()+1];
	
	for (int j = 0; j < str_n.length(); j++) {
		x[j] = str_n.charAt(j);
		saida.append(x[j]);
	}
	
	saida.append(" ->");
	
	for(int i = str_n.length(); i >= 0; i--) {
		saida.append(x[i]);
	}
	
	return saida.toString();
}
}