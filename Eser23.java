import java.io.Flushable;
import java.util.Scanner;
public class Eser23{
         public static void main(String [] args)
    {
        Scanner tastiera=new Scanner(System.in);
        System.out.println("Inserisci messaggio ");
        String messaggio=tastiera.nextLine();
        System.out.println("Inserisci posizione ");
        int posizione=tastiera.nextInt();
        System.out.println("Inserisci stringa ");
        String stringa=tastiera.nextLine();
        stringa=tastiera.nextLine();
        messaggio.substring(0, posizione);
        System.out.println(messaggio.substring(0, posizione)+stringa+messaggio.substring(posizione));
    }
}