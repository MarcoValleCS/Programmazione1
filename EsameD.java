import java.util.Scanner;
public class EsameD {
    public static void main(String [] args)
    {
        String stringa="",nStringa="";
        int i=0,j=1,k=0;
        int contaa=0,contae=0,contai=0,contao=0,contau=0,lStringa=0;
        Scanner tastiera =new Scanner(System.in);
        System.out.println("Inserisci una stringa formata da soli caratteri maiuscoli ");
        stringa=tastiera.nextLine();
        lStringa=stringa.length()-1;
        while(j<=lStringa)
        {
        i=j;
        nStringa="";
        while(i<=lStringa || stringa.length()>nStringa.length()-1 )
        {
            if(stringa.charAt(i)<'A' || stringa.charAt(i)>'Z')
            {
                System.exit(0);
            }
            nStringa=nStringa+stringa.charAt(i);
            System.out.println(nStringa.length());
            i++;
        }
        System.out.println(nStringa);
        j++;
    }
    }
}
