import java.util.Scanner;
public class EsameA
{
    public static void main(String [] args)
    {
        Scanner tastiera=new Scanner(System.in);
        int numero=1,max=0,min=10000,sum=0;
        while(numero!=0 || numero<0)
        {
            System.out.println("Inserisci nuovo numero, deve essere maggiore di 0 ");
            numero=tastiera.nextInt();
            if(numero>0)
            {
                sum+=numero;  
                if(numero>=max)max=numero;
                if(numero<=min)min=numero;
            }
        }
        System.out.println(" Il massimo è: "+max+"\n Il minimo è: "+min+"\n La somma è: "+sum);
        float media= ((float) max *  (float) min + (float) max *  (float) max + (float) sum *  (float) min + (float) sum *  (float) max)/4;
        System.out.println(media);
    } 
}