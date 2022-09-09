package Funcao;
import java.util.Random;

public class Exercicio10 {

public static void main(String[] args) {
	
		System.out.println(jogarDado());
}

public static String jogarDado() {
	int cont = 0, ponto = 0;
	StringBuilder saida = new StringBuilder();
	Random gerador = new Random();
		 while(true) {
       int sumDado = (gerador.nextInt(11)+2); 
       saida.append("Rolagem n° " + (cont+1) + " Soma dos dados: " + sumDado);
       saida.append("\n");
       
      if(cont == 0 && (sumDado == 11 || sumDado == 7)) {
    	  saida.append(" Você ganhou!");
    	  break;
    	  
      }else if(cont == 0 && (sumDado == 2 || sumDado == 3 || sumDado == 12)) {
    	  saida.append(" Você Perdeu!");
    	  break;
    	  
      }else {
    	  cont++;
    	  if(ponto == 0) {
    	   ponto = sumDado;
    	   
    	  }else	if(sumDado == 7) {
    		  saida.append(" Você Perdeu!");
    		  break;
    		  
    	  }else if(ponto == sumDado) {
    		  saida.append(" Você ganhou!");
    		  break;
    	  }
    	  }
      }
   	
	return saida.toString();
		
}
}