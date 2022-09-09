package Funcao;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercicio11 {
	public static void main(String[] args) throws ParseException  {
		
		System.out.println(mostrarData("28/05/1998"));
	}
		public static String mostrarData(String data) throws ParseException  {
			  StringBuilder saida = new StringBuilder();
		
			DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
			Date dt = df.parse (data);
			DateFormat df2 = new SimpleDateFormat ("MMMMM", new Locale ("pt", "BR"));
	
			saida.append(data.substring(0,2) + " de ");
			saida.append(df2.format (dt) + " de ");
			saida.append(data.substring(6,10));
	
		return saida.toString();
	}
	}