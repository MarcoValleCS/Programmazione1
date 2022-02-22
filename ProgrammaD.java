import java.util.Scanner;
public class ProgrammaD
{
    public static void main(String [] args)
    {
        String stringa=args[0];

        char [] pari=new char[stringa.length()/2];
        char [] dispari=new char[stringa.length()-pari.length];
        MetodiD.inizializzaArray(stringa, pari, dispari);
        MetodiD.stampa(pari);
        MetodiD.stampa(dispari);
        MetodiD.modificaArray(pari,dispari);
        MetodiD.stampa(pari);
        MetodiD.stampa(dispari);
    }
}