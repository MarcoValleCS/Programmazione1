import java.util.Scanner;
public class Eser53
{
    public static boolean cercaCarattere(String str, char c )
    {
        boolean trovato=false;
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==c)trovato=true;
        }
        return trovato;
    }
    public static String rimuoviCarattere(String str, char c)
    {
        String nuova="";
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)!=c)nuova+=str.charAt(i);
        }
        return nuova;
    }
    public static void main(String [] arg)
    {
        String nuova="";
        boolean trovato=false;
        Scanner tastiera=new Scanner(System.in);
        System.out.println("Inserisci stringa ");
        String str=tastiera.nextLine();
        System.out.println("Inserisci carattere ");
        char c=tastiera.next().charAt(0);
        trovato=cercaCarattere(str,c);
        System.out.println(trovato);
        if(trovato)
        {nuova=rimuoviCarattere(str,c);
            System.out.println(nuova);}
    }
}