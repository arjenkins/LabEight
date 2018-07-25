

import java.util.Scanner;

public class EighthLab {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userInput;
		String nextInput;
		int input = -1;

		String[] name = { "Sammie Jones", "Pilot Smith", "Hunter Morgan", "Riley Thomas", "Taylor Morgan",
				"Becka Charger", "Jonah Shore", "Ryan Staton" };
		String[] firstName = { "Sammie", "Pilot", "Hunter", "Riley", "Taylor", "Becka", "Jonah", "Ryan" };
		String[] hometown = { "Detroit, Mi", "Detroit, Mi", "Farmington, Mi", "Redford, Mi", "Farmington, Mi",
				"Southfield, Mi", "Redford, Mi", "Southfield, Mi" };
		String[] food = { "spaghetti", "corn on the cob", "fried chicken", "pizza", "sushi and BBQ chips", "ice cream cake",
				"loaded baked potato", "anything with cheese" };
		do {
			

			System.out.println("What student would you like to know more about? (Enter a number from 1-8): ");
			input = scnr.nextInt();
			
			if (input >= 9 || input < 1 ) {
				System.out.println("That student does not exist. Please try again. Enter a number from 1-8:");
		
			} else {
					System.out.println("Student " + input + " is " + name[input - 1] + ".");
				
		            }
					
			scnr.nextLine();

			System.out.println("What would you like to know about " + firstName[input - 1] + "? "
					+ "(You can enter \"hometown\" or \"favorite food\"):");
			nextInput = scnr.nextLine().trim().toLowerCase();
			if (nextInput.equals("hometown")) {
				System.out.println(firstName[input - 1] + " is from " + hometown[input - 1] + ".");
			}

			else if (nextInput.equals("favorite food")) {
				System.out.println(firstName[input - 1] + "'s favorite food is " + food[input - 1] + ".");
			}

			else {
				System.out.println("That data does not exist. Please try again. Enter \"hometown\" or \"favorite food\". ");
			}
			System.out.println("\nWould you like to know more? Enter \"yes\" or \"no\")?");
			userInput = scnr.nextLine().trim().toLowerCase();
			
			
			} while (userInput.equals("yes")); 
			
		{
		System.out.println("Thanks!");
			}
			 scnr.close();
			}
}
