package Funcao;
import java.util.Scanner;
public class Exercicio07 {

public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double v = 1, sum = 0;
	int cont = 0;
	
		while(v != 0) {
		System.out.print("Digite o valor da prestação: ");
		v = entrada.nextDouble();
		
		if(v == 0) {
			System.out.println("\nRelatorio do dia");
			System.out.println("Quantidade de prestações pagas: " + cont + "\nValor total de prestações pagas: R$ " + sum);
		
		}else {
		System.out.print("Digite o número de dias em atraso: ");
		int d = entrada.nextInt();
		
		cont++;
		sum += v;
		
		System.out.println(valorPagamento(v, d));
	}
	 }
		entrada.close();
}

	public static String valorPagamento(double pag, int parc) {
		if(parc > 0) {
			pag += (pag * 0.03); 
			pag += (pag * ((double)parc / 1000));
		}

		return "R$ " + pag;
}
}

