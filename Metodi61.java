import java.util.Random;

public class Metodi61
{
    public static int estraiNumeroCasuale()
    {
        return (int)(Math.random()*100)+1;
    }
    public static int confrontaNumeri(int n1,int n2)
    {
        if(n1>n2)return 1;
        if(n1==n2)return 0;
        else return -1;
    }
}