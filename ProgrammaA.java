import java.util.Scanner;
public class ProgrammaA
{
    public static void main(String [] args)
    {
        int [] interi=new int [5];
        int [] copiaInteri=new int[5];
        for (int i=0;i<5;i++)
        {
            interi[i]=Integer.parseInt(args[i]);
        }
        int n=Integer.parseInt(args[5]);
        for(int i=0;i<interi.length;i++)
        {
            copiaInteri[i]=interi[i];
        }
        MetodiA.modificaArray(copiaInteri,n);
        switch(MetodiA.valutaDifferenzeArray(interi,copiaInteri))
        {
            case -1:System.out.println("ERRORE");break;
            case 0:
            {
                for(int i=0;i<copiaInteri.length;i++)
                    {
                        System.out.print(copiaInteri[i]+"\t");
                    }
            }break;
            case 1:
            {
                for(int i=0;i<interi.length;i++)
                    {
                        System.out.print(interi[i]+"\t");
                    }
            }break;

        }
    }
}