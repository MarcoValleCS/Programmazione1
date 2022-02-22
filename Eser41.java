import java.util.Scanner;
public class Eser41
{
    public static void main(String [] arg)
    {
        Scanner tastiera= new Scanner(System.in);
        System.out.println("Inserisci numero");
        int n=tastiera.nextInt();
        int x=2;
        for(int i=0;x<n;i++)
        {
            x=x*2;
        }
        System.out.println(x);
        
    }
}