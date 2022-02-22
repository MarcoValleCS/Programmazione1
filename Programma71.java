import java.util.Scanner;
public class Programma71
{
    public static void main(String [] args)
    {
        Scanner tastiera=new Scanner(System.in);
        int nElementi=0;
        int n1=0;
        int scelta=0;
        int [] array=Metodi71.creaArray();
        do{
        System.out.println("Scegli una delle seguenti opzioni: \n -1 Aggiungi elemento \n -2 Rimuovi elemento \n -3 Termina programma");
        scelta=tastiera.nextInt();
        switch(scelta)
        {
            case 1:
            {
                System.out.println("Inserisci numero da inserire ");
                n1=tastiera.nextInt();
                if(Metodi71.aggiungiElemento(array,nElementi,n1))
                {
                    nElementi++;
                    System.out.println("Il numero è stato aggiunto con successo");
                }
                else System.out.println("Il numero non è stato inserito ");
            }break;
            case 2:
            {
                System.out.println("Inserisci numero da rimuovere ");
                n1=tastiera.nextInt();
                if(Metodi71.rimuoviElemento(array,nElementi,n1))
                {
                    nElementi--;
                    System.out.println("Il numero è stato rimosso con successo");
                }
                else System.out.println("Il numero non è stato rimosso");
            }break;
            case 3:break;
        }
        for(int i=0;i<nElementi;i++)
        {
            System.out.print(array[i]+"\t");
        }
        }while(scelta!=3);

    }
}