import java.util.Scanner;
public class Programma61
{
    public static void main(String [] arg)
    {
    int [] numeriDaIndovinare=new int [5];
    boolean [] indovinati=new boolean[5];
    int [] numerotentativi=new int[5];
    boolean indovinato=false;
    Scanner tastiera=new Scanner(System.in);
    int risultatoConfronto=0,inserito=0;
    int NumeroDaIndovinare=Metodi61.estraiNumeroCasuale();
    for(int i=0;i<=10 && indovinato==false;i++)
    {
        System.out.println("Inserisci numero compreso tra 1 e 100");
        inserito=tastiera.nextInt();
        risultatoConfronto=Metodi61.confrontaNumeri(inserito,NumeroDaIndovinare);
        switch(risultatoConfronto)
        {
            case 1:System.out.println("Il numero "+inserito+" è più grande del numero da indovinare ");break;
            case -1:System.out.println("Il numero "+inserito+" è più piccolo del numero da indovinare ");break;
            case 0:System.out.println("Complimenti numero indovinato");indovinato=true;break;
        }
    }
    }
}