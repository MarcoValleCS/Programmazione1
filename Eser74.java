import java.util.Scanner;
public class Eser74
{
    public static int somma(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else 
        {
            return somma(a+1,b-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner tastiera=new Scanner(System.in);
        int a=10;
        int b=9;
        System.out.println(somma(a,b));
    }
}
