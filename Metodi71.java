public class Metodi71
{
    public static int [] creaArray()
    {
        int array[]=new int[100];
        return array;
    }
    public static boolean aggiungiElemento(int []array,int nElementi,int elemento)
    {
        for(int i=0;i<=nElementi;i++)
        {
            if(array[i]==elemento)return false;
        }
        array[nElementi]=elemento;
        return true;
    }
    public static boolean rimuoviElemento(int []array,int nElementi,int elemento)
    {
        boolean trovato;
        for (int i=0;i<=nElementi;i++)
        {
            if(array[i]==elemento)
            {
                for(int j=i;j<nElementi;j++)
                {
                    array[j]=array[j+1];
                }
                return true;
            }
        }
        return false;
    }
}