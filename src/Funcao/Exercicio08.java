package Funcao;

public class Exercicio08 {

public static void main(String[] args) {
		
	System.out.println(mostrarDigi(500));
}

public static int mostrarDigi(int n) {
	
	 String str_n = String.valueOf(n);			
	 
	 return str_n.length();
}
}