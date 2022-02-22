import java.util.Scanner;
public class EsameC
{
    public static void main(String [] args)
    {
        int i=0;
        int contavocali=0,sommaunicode=0,maiuscola;
        String stringa,nStringa="";
        Scanner tastiera =new Scanner (System.in);
        System.out.println("Inserisci stringa formata da soli caratteri maiuscoli ");
        stringa=tastiera.nextLine();
        while(i<stringa.length())
        {
            if (stringa.charAt(i)<'a' || stringa.charAt(i)>'z')
            {
                System.exit(0);
            }
            if(stringa.charAt(i)=='a' || stringa.charAt(i)=='e' || stringa.charAt(i)=='i' || stringa.charAt(i)=='o' || stringa.charAt(i)=='u')
            {
                contavocali++;
                nStringa=nStringa+stringa.charAt(i);
            }
            else 
            {
            maiuscola=stringa.charAt(i)-'a'+'A';
            nStringa=nStringa+(char)maiuscola;
            }
            sommaunicode+=(int) stringa.charAt(i);
        i++;
        }
        System.out.println("La somma UNICODE è :"+sommaunicode);
        System.out.println("Le vocali sono: "+contavocali);
        System.out.println(nStringa);
    }
}