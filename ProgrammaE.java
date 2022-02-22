import java.util.Scanner;
public class ProgrammaE
{
    public static void main(String [] args)
    {
        Scanner tastiera=new Scanner(System.in);
        int n=0;
        do{
            System.out.println("Inserisci numero ");
            n=tastiera.nextInt();
        }while(n<=0);
        char [] caratteri=new char[n];
        char [] copiaCaratteri=new char[n];
        for (int i = 0; i < caratteri.length; i++){ // input tramite Scanner
            System.out.print("\ncaratteri [" + i + "] = ");
            caratteri[i] = tastiera.next().charAt(0);
        }
        System.out.println("Inserisci carattere a ");
        char a=tastiera.next().charAt(0);
        System.out.println("Inserisci carattere b ");
        char b=tastiera.next().charAt(0);
        MetodiE.copiaArray(caratteri, copiaCaratteri);
        MetodiE.occorrenzeContenuto(caratteri,a,b);
        MetodiE.stampa(copiaCaratteri);
        MetodiE.stampa(caratteri);
        if(MetodiE.confronta(caratteri, copiaCaratteri))
        {
            MetodiE.stampa(MetodiE.uniformaContenuto(copiaCaratteri,caratteri));

        }

    }
}