package Funcao;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercicio12 {

public static void main(String[] args) {
		
	System.out.println(mostrarRandom("python"));
}

public static String mostrarRandom(String s) {
	   List<String> letters = Arrays.asList(s.split(""));
	    Collections.shuffle(letters);
	    StringBuilder saida = new StringBuilder(s.length());
	    for (String k : letters) {
	        saida.append(k);
	    }
	    
	    return saida.toString();
	}
}