package Funcao;

public class Exercicio06 {

public static void main(String[] args) {
		
		System.out.println(hora(11, 20));
	}
	
	public static String hora(int hr, int min) {
		String m = "";
		if(hr > 12) {
			hr -= 12;
			 m = "P.M";
		}else {
			m = "A.M";
		}
		
		return hr + ":" + min + " " + m;
}
}