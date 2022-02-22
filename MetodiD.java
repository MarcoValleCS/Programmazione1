public class MetodiD
{
    public static void stampa(char [] array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    public static void inizializzaArray(String stringa,char []pari, char [] dispari)
    {
        for(int i=1;i<=stringa.length();i++)
        {
            if(i%2==0)
            {
                pari[i-1]=stringa.charAt(i-1);
            }
            else dispari[i-1]=stringa.charAt(i-1);
        }
    }
    public static void modificaArray(char [] pari, char [] dispari)
    {
        if(pari.length<dispari.length)
        {
            for (int i=0;i<pari.length;i++)
            {
                pari[i]+=('A'-'a');
            }
        }
        if(dispari.length<pari.length)
        {
            for (int i=0;i<dispari.length;i++)
            {
                dispari[i]+=('A'-'a');
            }
        }
    }
}