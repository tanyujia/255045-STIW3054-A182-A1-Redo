import java.util.InputMismatchException;
import java.util.Scanner;

public class weightingTF extends Thread {

	Scanner scan = new Scanner(System.in);
	private TechnicalFactor a[] = new TechnicalFactor[13];
	private double total;

	public double calculation() throws Exception {
		int x = 0;

		a[0] = new TechnicalFactor("Must have a distributed solution", 2);
		a[1] = new TechnicalFactor("Must respond to specific performance objectiveds", 1);
		a[2] = new TechnicalFactor("Must meet end-user efficiency desires", 1);
		a[3] = new TechnicalFactor("Complex internal processing", 1);
		a[4] = new TechnicalFactor("code nust be reusable", 1);
		a[5] = new TechnicalFactor("Must be easy to install", 0.5);
		a[6] = new TechnicalFactor("Must be easy to use", 0.5);
		a[7] = new TechnicalFactor("Must be portable", 2);
		a[8] = new TechnicalFactor("Must be easy to change", 1);
		a[9] = new TechnicalFactor("Must allow concurrent users", 1);
		a[10] = new TechnicalFactor("Includes special security features", 1);
		a[11] = new TechnicalFactor("Must provide direct access for 3rd parties", 1);
		a[12] = new TechnicalFactor("Requires special user training facilities", 1);

		System.out.println("\n**********Weighting Technical Factors for Complexity**********");

		do {
			try {
				System.out.println("Please rate from 0 to 5!!!");
				for (int i = 0; i < a.length; i++) {
					System.out.print("Project Rating of T" + (i + 1) + " (" + a[i].getDescription() + "): ");
					a[i].setRating(scan.nextInt());
					if ((a[i].getRating() > 5) || (a[i].getRating() < 0)) {
						throw new Exception("Wrong input");
					}
					x = 1;
				}
			} catch (InputMismatchException e) {
				System.out.println("-------------------------------------");
				System.out.println("Wrong input, please input again.\n");
				Thread.sleep(2000);
				scan.next();
				x = 2;

			} catch (Exception e) {
				System.out.println("-------------------------------------");
				System.out.println("Wrong input, please rate it from 0 to 5.\n");
				Thread.sleep(2000);
				x = 2;
			}
		} while (x == 2);

		for (int i = 0; i < a.length; i++) {
			total += a[i].technicalFactor();
		}

		return total;
	}

}
