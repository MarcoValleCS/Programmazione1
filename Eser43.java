import java.util.Scanner;
public class Eser43
{
    public static void main(String [] arg)
    {
        Scanner tastiera=new Scanner(System.in);
        System.out.println("Inserisci numero ");
        int n=tastiera.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                n=n/i;
                System.out.println("Fattore primo "+i);
                i=1;
            }
        }
    }
}