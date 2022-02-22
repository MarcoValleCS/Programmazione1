import java.util.Scanner;
public class Programma52
{
    public static void main(String [] arg)
    {
        int n1,n2;
        double d1,d2;
        char cr=' ';
        Scanner tastiera=new Scanner(System.in);
        do{
        System.out.println(("\n Inserisci una lettera per indicare l'operazione da eseguire \n a) Somma di numeri interi \n b) Divisione e resto tra due numeri interi \n c) Media tra due valori double \n d) Valore assoluto di un numero intero \n e) Lunghezza della stringa che rappresenta un numero intero \n t) Termina programma "));
        cr=tastiera.next().charAt(0);
        switch(cr)
        {
            case 'a':
            case 'A':{System.out.println("Inserisci primo numero");
                        n1=tastiera.nextInt();
                        System.out.println("Inserisci secondo numero");
                        n2=tastiera.nextInt();
                        int somma=Metodi52.sommaDueInteri(n1,n2);
                        System.out.println("La somma dei due interi è "+somma);
                    }
            break;

            case 'b':
            case 'B':
            {
                System.out.println("Inserisci divisore");
                        n1=tastiera.nextInt();
                        System.out.println("Inserisci dividendo");
                        n2=tastiera.nextInt();
                        if(n2!=0)
                        {int divisione=Metodi52.divisioneIntera(n1,n2);
                         int resto=Metodi52.restoDivisioneIntera(n1,n2);
                        System.out.println("Il risultato della divisine è "+divisione+" e il resto è "+resto);
                        }
            }break;

            case 'c':
            case 'C':
            {
                System.out.println("Inserisci primo numero ");
                d1=tastiera.nextDouble();
                System.out.println("Inserisci secondo numero ");
                d2=tastiera.nextDouble();
                double media=Metodi52.mediaTraDueDouble(d1,d2);
                System.out.println("La media dei due valori è "+media);
            }
            break;

            case 'd':
            case 'D':
            {
                System.out.println("Inserisci numero intero di cui vuoi sapere il valore assoluto");
                n1=tastiera.nextInt();
                int valoreassoluto=Metodi52.valoreAssoluto(n1);
                System.out.println("Il valore assoluto del numero è "+valoreassoluto);
            }
            break;

            case 'e':
            case 'E':
            {
                System.out.println("Inserisci numero");
                n1=tastiera.nextInt();
                int Lstringa=Metodi52.lunghezzaStringaIntero(n1);
                System.out.println("La lunghezza della stringa del numero intero è "+Lstringa);
            }
            break;

            case 't':
            case 'T':
            break;

            default:System.out.println("ERRORE INPUT NON VALIDO ");
        
        }
    }while(cr!='t'&& cr!='T');
    }
}