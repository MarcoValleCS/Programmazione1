import java.util.Scanner;

import javax.management.relation.RelationSupport;
import javax.swing.plaf.synth.SynthScrollBarUI;
public class Eser55
{
    public static String convertiDecInBin(int n1)
    {
        String risultato="";
        while(n1!=0)
        {
            risultato=n1%2+risultato;
            n1=n1/2;
        }
        return risultato;
    }
    public static int convertiBinInDec(int n1)
    {
        String posizione="";
        posizione=posizione+n1;
        n1=0;
        int v;
        for(int i=posizione.length()-1;i>=0;i--)
        {
            if(posizione.charAt(i)=='1'){v=1;}
            else v=0;
            n1=n1+(int)Math.pow(2,i)*v;
        }
        return n1;
    }
    public static char menu()
    {
        Scanner tastiera=new Scanner(System.in);
        System.out.println("Inserisci: \n 1 per convertire da decimale in binario \n 2 per convertire da binario a decimale \n 3 per terminare");
        return tastiera.next().charAt(0);
    }
    public static void main(String [] arg )
    {
        char c=0;
        Scanner tastiera=new Scanner (System.in);
        do
        {
        c=menu();
        switch(c)
        {
            case '1':
            {
                System.out.println("Inserisci numero decimale positivo");
                int n1=tastiera.nextInt();
                if(n1>0){String risultato=convertiDecInBin(n1);System.out.println(risultato);}
                else System.out.println("Il numero non è positivo");
            }break;
            case '2':
            {
                Boolean binario=true;
                System.out.println("Inserisci numero binario ");
                int n1=tastiera.nextInt();
                String risultato=""+n1;
                for(int i=0;i<risultato.length();i++)
                {
                    if(risultato.charAt(i)!='1' && risultato.charAt(i)!='0')binario=false;
                }
                if(binario){n1=convertiBinInDec(n1);System.out.println(n1);}
                else System.out.println("Numero non binario");
            }break;
            case '3':break;

        }
        }while(c!=3);
    }
}