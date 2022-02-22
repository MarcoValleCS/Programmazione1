import java.util.Scanner;
public class Eser45
{
 public static void main(String [] arg)
 {
     Scanner tastiera=new Scanner(System.in);
    System.out.println("Inserisci n");
    int n=tastiera.nextInt();
    while(n!=1)
    {
        if(n%2==0)n=n/2;
        else n=3*n+1;
        System.out.println(n);
    }

 }
}