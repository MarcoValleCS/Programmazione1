import java.util.Scanner;
public class EsameB
{
    public static void main(String [] args)
    {
        Scanner tastiera=new Scanner (System.in);
        int numero1=1;
        int numero2=1;
        int prod=1;
        int max=1;
        int min=-1;
        while(numero1==0 && numero1<0)
        {
        System.out.println("Inserisci numero strettamente maggiore di 0 ");
        numero1=tastiera.nextInt();
        }
        while(numero2<=0 && numero2!=numero1)
        {
        if(numero2>max)max=numero2;
        if(numero2<min)min=numero1;
        prod=prod*numero2;
        System.out.println("Inserisci numero, strettamente maggiore, il numero inserito precedentemente per terminare ");
        numero2=tastiera.nextInt();
        
        }
        System.out.println("fino a qui funzia");
    }
}