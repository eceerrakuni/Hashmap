import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
	
	public static void main(String[] args) {
		
		Map<String, Integer> phoneBook = new HashMap<String, Integer>();
		
		phoneBook.put("Reece", 4721264);
		phoneBook.put("Mike", 4867381);
		phoneBook.put("Lauren", 2742842);
		phoneBook.put("Jessica", 8003321);
		phoneBook.put("Jason", 8649293);
		phoneBook.put("Rachel", 8401135);
		
		phoneBook.forEach( (name, number) -> System.out.println(name + "      " + number));
		
		Scanner n = new Scanner(System.in);
		boolean quit = false;
		while (quit != true) {
		System.out.println("" + "Who would you like to search for?");
		String searchName = n.nextLine();
			if (phoneBook.get(searchName) == null) {
				System.out.println("Sorry, that name is not in our books");
			} else {
				System.out.println(searchName + "'s phone number is " + phoneBook.get(searchName));
				System.out.println("Would you like to search another name? Y or N.");
				if (n.nextLine().equals("N")) {
					System.out.println("Goodbye!");
					quit = true;
				}
			}
		}
	}
	
}
