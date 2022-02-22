public class Eser75
{
    public static int mcd(int a,int b)
    {
        if(a==b)
        {
            return a;
        }
        else 
        {
            if(a>b)
            {
                return mcd(a-b,b);
            }
            else 
            {
                return mcd(b,a);
            }
        }
    }
       public static void main(String [] args)
    {
        int a=42, b=70;
        System.out.println(mcd(a,b));
    }
}