import java.util.Scanner;
public class ProgrammaC
{
    public static void main(String [] args)
    {
        int n=0,a=0,b=0,cont=0;
        Scanner tastiera=new Scanner(System.in);
        do
        {
        System.out.println("Inserisci numero ");
        n=tastiera.nextInt();
        }while(n<1);
        int [] interi=new int [n];
        int [] copiaInteri=new int[n];
        for(int i=0;i<interi.length;i++)
        {
            System.out.println("Inserisci valore di inizializzazzione ");
            interi[i]=tastiera.nextInt();
        }
        do
        {
            System.out.println("Inserisci A");
            a=tastiera.nextInt();
            System.out.println("Inserisci B");
            b=tastiera.nextInt();
        }while(a>=b);
        MetodiC.copiaArray(interi,copiaInteri);
        MetodiC.occorrenzeElementi(interi,a,b);
        MetodiC.stampa(interi);
        MetodiC.stampa(copiaInteri);
        for(int i=0;i<interi.length;i++)
        {
            if(interi[i]!=copiaInteri[i])cont++;

        }
        if(cont>n/2)
        {
            MetodiC.stampa(MetodiC.modificaElementi(interi,copiaInteri));
        }

    }
}