import java.util.Scanner;
public class Eser54
{
    public static char menu()
    {
        Scanner tastiera=new Scanner(System.in);
        System.out.println("\n Selezione operazione desiderata \n 1) Conversione Fahrenheit->Celsius \n 2) Conversione Celsius->Fahrenheit \n 3) Termina Programma");
        return tastiera.next().charAt(0);
    }
    public static double convertiFinC(double t)
    {
        return (t-32)/1.8;
    }
    public static double convertiCinF(Double t)
    {
        return 1.8*t+32;
    }
    public static void main(String [] arg)
    {
        char c='0';
        Scanner tastiera=new Scanner(System.in);
        do{
        c=menu();
        switch(c)
        {
        case '1':{System.out.println("Inserisci la temperatura in Fahrenheit"); double t=tastiera.nextDouble();System.out.println("La temperatura in Celsius è"+convertiFinC(t));}break;
        case '2':{System.out.println("Inserisci la temperatura in Celsius"); double t=tastiera.nextDouble();System.out.println("La temperatura in Fahrenheit è"+convertiCinF(t));}break;
        case '3':break;
        default:System.out.println("INPUT NON VALIDO");
        }
        }while(c==3);
    }
}