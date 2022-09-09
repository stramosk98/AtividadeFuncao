package Funcao;

public class Exercicio05 {

public static void main(String[] args) {
		
		System.out.println(somaImposto(10, 400));
	}
	
	public static double somaImposto(double imposto, double custo) {
		double taxaImp = (imposto / 100);
		double custoSum = (taxaImp * custo) + custo;
		return custoSum;
}
}