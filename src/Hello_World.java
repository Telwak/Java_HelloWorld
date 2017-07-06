import java.util.Scanner;

public class Hello_World {
	

	public static void main(String[] args) {
        
        System.out.println("Hello, World");
        Scanner Czytaj_imie = new Scanner(System.in);
        System.out.println("Jak masz na imie?");
        String Podaj_imie_metoda = Czytaj_imie.nextLine();
        	String Jak_Masz = Podaj_imie(Podaj_imie_metoda);
        	System.out.println("Witaj " + Jak_Masz + "!");

}
	public static String Podaj_imie(String imie)
	{
		if(imie.isEmpty())
		{
			return "Nie poda³eœ imienia!";
		}
		return imie;
	}
}
