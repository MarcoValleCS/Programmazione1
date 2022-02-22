import java.util.Scanner;
public class Metodi52
{
    public static int sommaDueInteri(int n1,int n2)
    {
        return n1+n2;
    }
    public static int divisioneIntera(int n1,int n2)
    {
        return n1/n2;
    }
    public static int restoDivisioneIntera(int n1,int n2)
    {
        return n1%n2;
    }
    public static double mediaTraDueDouble(double d1,double d2)
    {
        return (d1+d2)/2;
    }
    public static int valoreAssoluto(int n1)
    {
        if(n1>=0)return n1;
        else return -n1;
    }
    public static int lunghezzaStringaIntero (int n1)
    {
        String stringa=""+n1;
        return stringa.length();
    }
}