public class MetodiC
{
    public static void occorrenzeElementi(int [] par,int a,int b)
    {
        for(int i=0;i<par.length;i++)
        {
            if(a>par[i])par[i]=b;
            else if (par[i]>b)par[i]=a;
        }
    }
    public static void copiaArray(int [] interi, int [] copiaInteri)
    {
        for(int i=0;i<interi.length;i++)
         {
             copiaInteri[i]=interi[i];
         }

    }
    public static void stampa(int [] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }
    public static int [] modificaElementi(int [] par1, int []par2)
    {
        int cont1=0,cont2=0;
        int [] nuovo=new int[par1.length+par2.length];
        for (int i=0;i<nuovo.length;i++)
        {
            if(i%2==0)
            {
            nuovo[i]=par1[cont1];
            cont1++;
            }
            else 
            {
                nuovo[i]=par2[cont2];
                cont2++;
            }
        }
        return nuovo;
    }
}