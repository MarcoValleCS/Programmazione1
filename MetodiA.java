public class MetodiA
{
    public static void modificaArray(int []par,int a)
    {
        int sum=0, prod=0;
        for(int i=0;i<par.length;i++)
        {
            for (int j=0;j<par.length;j++)
            {
            sum=par[i]+par[j];
            prod=par[i]*par[j];  
            }
         if((prod-sum)<a && a<(prod+sum))
         {
             par[i]=prod+sum;
         }
         else par[i]=prod-sum;
        }
    }
    public static int valutaDifferenzeArray(int []par1,int []par2)
    {
        boolean uguale=true;
        if(par1.length==par2.length)
        {
            for(int i=0;i<par1.length;i++)
            {
                if(par1[i]!=par2[i])
                {
                    return 1;
                }
            }
            return 0;
        }
        else return -1;
    }
}