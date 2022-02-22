import java.util.Scanner;
public class Eser21{
     
    public static void main(String [] args)
    {
        Scanner tastiera=new Scanner(System.in);
        System.out.println("Inserisci numero ");
        int n=tastiera.nextInt();
        if (n<0)
        {
            n=-n;
        }
        System.out.println(n);
    }
}