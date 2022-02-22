import java.util.Scanner;
public class Eser51
{
    public static void main(String [] arg)
    {
        String str="";
        int cont=1;
        int inserito=1;
        Scanner tastiera=new Scanner(System.in);
        do{
        System.out.println("Inserisci numero positivo");
        inserito=tastiera.nextInt();
        if(cont%2==0 && inserito>0){str=aggiornaStringa(inserito, str);
        System.out.println(str);}
        cont++;
        }while(inserito!=0);
    }
    public static String aggiornaStringa(int inserito,String str)
    {
        str=str+inserito;
        return str;
    }
}