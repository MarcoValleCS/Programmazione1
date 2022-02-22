import java.util.Scanner;
public class Eser24{
     
    public static void main(String [] args)
    {
        int i=0;
        String binario="";
        Scanner tastiera=new Scanner(System.in);
        System.out.println("Inserisci numero");
        int n1=tastiera.nextInt();
        while(n1!=0)
        {
            i++;
            if (n1%2==1)
            {
                binario="1"+binario;
                n1=n1/2;
            }
            else 
            {
                binario="0"+binario;
                n1=n1/2;
            }
        }
        System.out.println(binario);
    }
}