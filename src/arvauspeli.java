import java.util.Scanner;
public class arvauspeli {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name = "Teppo";
		String guess;
		int attemps = 0;
		boolean correctGuess = false;
		
		while (!correctGuess) 
		{
			System.out.println("Arvaa nimi (loppu = exit)");
			guess = in.nextLine();
			attemps++;
			
		if (guess.equalsIgnoreCase(name))
		{
			System.out.println("Onnea!");
			correctGuess = true;
		}
			
			
		}
		
 
		
		
		
	}

}
