import java.util.Scanner;
public class Eser42
{
    public static void main(String [] arg)
    {
        Boolean trovato=false;
        Scanner tastiera=new Scanner(System.in);
        System.out.println("Inserisci prima stringa ");
        String str1=tastiera.nextLine();
        System.out.println("Inserisci seconda stringa ");
        String str2=tastiera.nextLine();
        int i=str1.length();
        for(;i>=0 && trovato==false;i--)
        {
            if (str1.substring(0, i).equalsIgnoreCase(str2.substring(0, i)))
            { 
                trovato=true;
                System.out.println("Il massimo prefisso comune tra le stringhe " +str1+" e "+str2+" ha lunghezza "+i);
            }
        }
    }
}