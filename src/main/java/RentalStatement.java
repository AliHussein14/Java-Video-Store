import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

// array list method 
public class RentalStatement {
	Collection<Rental> rentals = new ArrayList<Rental>();

	public void add(Rental toAdd) {
		rentals.add(toAdd);
	}

	public void print() {
		for (Rental rental : rentals) {
			System.out.println("\nPrice code: " + rental.getPriceCode() + "\nTitle name - " + rental.getTitle()
					+ "\nFees - $" + rental.calculateFees() + "\n");
		}

	}

	public void printToText() throws Exception {
		// users updated lists of movies/price code and late fees
		FileOutputStream fileOutput = new FileOutputStream("YourCollectionsApp.md");
		PrintStream printOutput = new PrintStream(fileOutput);

		for (Rental rental : rentals) {

			printOutput.println("\nPrice code: " + rental.getPriceCode() + "\nTitle name - " + rental.getTitle()
					+ "\nFees - $" + rental.calculateFees() + "\n");

		}

		fileOutput.close();
		printOutput.close();

	}
}