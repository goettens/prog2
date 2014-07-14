import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pratica31 {
    public static void main(String[] args) {
        
        Date inicio = new Date();        
        String meuNome = "José Guilherme da Costa Goetten";   
        GregorianCalendar dataNascimento = new GregorianCalendar(1991, Calendar.MARCH, 12);
        GregorianCalendar dataAtual = new GregorianCalendar();        
        
        System.out.println(meuNome.toUpperCase());        
        System.out.println(meuNome.substring(24,25).toUpperCase() + meuNome.substring(25,31).toLowerCase() + ", " + meuNome.substring(0,1).toUpperCase() + ". " + meuNome.substring(5,6).toUpperCase() + ". " + meuNome.substring(18,19).toUpperCase()+".");        
        System.out.println((dataAtual.getTimeInMillis() - dataNascimento.getTimeInMillis()) / (24*60*60*1000));
        
        Date fim = new Date();
        System.out.println(fim.getTime() - inicio.getTime());
        
    }
}

