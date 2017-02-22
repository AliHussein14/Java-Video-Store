import java.io.IOException;
import java.util.Scanner;

public class VideoStoreApp {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		RentalStatement statement = new RentalStatement();
		// users input for the scanner
		System.out.println("Hello, Welcome to the Columbus Video Store.");
		System.out.println("Would you like to rent the movies you have in your Collections?"
				+ "\nPlease enter\n \t1 - Yes\n\t2 - No");
		int userChoice = scanner.nextInt();

		if (userChoice == 1) {

			// This will print to the console
			// it will read and print the text from the mycollectionsapp.md
			try {
				statement.readFromText();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			if (userChoice == 2) {
				System.out.println("Goodbye, have a nice day");
			}
		}
		// asking the user for input
		System.out.println("So now how many days would you like to rent the movies?");
		int days = scanner.nextInt();

		// movies choices

		Movie regular = new RegularMovie("SuperMan");
		Movie childrens = new ChildrensMovie("SpongeBob Squarepants");
		Movie newRelease = new NewReleaseMovie("Suicide Squad");
		// fees/days
		Rental regualarMovie = new Rental(regular, days);
		Rental childrensMovie = new Rental(childrens, days);
		Rental newReleaseMovie = new Rental(newRelease, days);

		statement.add(regualarMovie);
		statement.add(childrensMovie);
		statement.add(newReleaseMovie);
		// will give user updated lists of movies/late fees/price code
		System.out.println("Here is your New list and fees for " + days + "days");
		statement.print();

		System.out.println("Would you now like to update your new list to your collections?"
				+ "\nPlease enter\n \t1 - Yes\n\t2 - No");
		userChoice = scanner.nextInt();

		if (userChoice == 1) {

			try {
				statement.printToText();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("\n\nYou have now updated your new list to your collections, Thank you");

		} else
			System.out.println("Thank you for coming to the Columbus Video Store, You have an amaing day");

		scanner.close();

	}
}