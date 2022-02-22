public class MetodiE
{
    public static char [] uniformaContenuto(char []array1, char [] array2)
    {
        int cont1=0,cont2=0;
        char [] nuovo=new char[array1.length+array2.length];
        for(int i=0;i<nuovo.length;i++)
        {
            if(i%2==0)
            {
                nuovo[i]=array1[cont1];
                cont1++;
            }
            else 
            {
            nuovo[i]=array2[cont2];
            cont2++;
            }
        }
        return nuovo;
    }
    public static boolean confronta(char [] array1, char array2[])
    {
        boolean trovato=false;

        for(int i=0;i<array1.length;i++)
        {
            if(array1[i]!=array2[i])trovato=true;

        }
        return trovato;
    }
    public static void copiaArray(char [] array1, char [] array2)
    {
        for(int i=0;i<array1.length;i++)
        {
            array2[i]=array1[i];
        }
    }
    public static void stampa(char []array)
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
    }

    public static void  occorrenzeContenuto(char [] caratteri ,char a ,char b)
    {
        int contA=0,contB=0;
        for(int i=0;i<caratteri.length;i++)
        {
            if(caratteri[i]==a)
            {
                contA++;
            }
            else if(caratteri[i]==b)
            {
                contB++;
            }
        }
        if(contA>contB)
        {
            for(int i=0;i<caratteri.length;i++)
            {
                if(caratteri[i]==a)caratteri[i]=b;

            }
        }
        else if(contB>contA)
        {
            for(int i=0;i<caratteri.length;i++)
            {
                if(caratteri[i]==b)caratteri[i]=a;

            }
        }
    }
}