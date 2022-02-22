import java.util.Scanner;
public class Eser22{
     
    public static void main(String [] args)
    {
        Scanner tastiera=new Scanner(System.in);
        System.out.println("Inserisci dividendo ");
        int n1=tastiera.nextInt();
        System.out.println("Inserisci divisore ");
        int n2=tastiera.nextInt();
        if(n2==0) System.exit(0);
        else System.out.println((float)n1/n2);
    }
}