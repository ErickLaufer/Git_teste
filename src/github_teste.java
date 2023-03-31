
import java.util.Calendar;

public class github_teste{

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int mes = hoje.get(Calendar.MONTH);
		int ano = hoje.get(Calendar.YEAR);
		mes ++; 	
		
		func(dia, mes, ano , hoje);
	}
		
		
		public static void func(int day, int mon, int year , Calendar hoje_hoje) {
			
		String data = day + "/" + mon + "/" + year;
		System.out.println("A data de hoje é : " + data);


		int hora = hoje_hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje_hoje.get(Calendar.MINUTE);
		
		String agora = hora + ":" + minutos;
		System.out.println("Agora: " + agora);
		System.out.printf("Hoje é dia %d/%d/%d, são %d horas e %d minutos", day, mon , year, hora, minutos );
	}
	
}