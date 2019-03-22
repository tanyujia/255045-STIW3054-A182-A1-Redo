import java.util.InputMismatchException;
import java.util.Scanner;

public class weightingEF extends Thread {

	Scanner scan = new Scanner(System.in);
	private ExperienceFactor a[] = new ExperienceFactor[8];
	private double total,percentage;
	private int er, numberFR;

	public double calculation() throws Exception {
		int x = 0;

		a[0] = new ExperienceFactor("Familiar with FPT software process", 1);
		a[1] = new ExperienceFactor("Application experience", 0.5);
		a[2] = new ExperienceFactor("Paradigm experience (OO)", 1);
		a[3] = new ExperienceFactor("Lead analyst capability", 0.5);
		a[4] = new ExperienceFactor("Motivation", 0);
		a[5] = new ExperienceFactor("Stable Requirements", 2);
		a[6] = new ExperienceFactor("Part-time workers", -1);
		a[7] = new ExperienceFactor("Difficulty of programming language", -1);

		System.out.println("\n**********Weighting Experience Factors for Complexity**********");

		do {
			try {
				System.out.println("Please rate from 0 to 5!!!");
				for (int i = 0; i < a.length; i++) {
					System.out.print("Project Rating of E" + (i + 1) + " (" + a[i].getDescription() + "): ");
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
			total += a[i].experienceFactor();
		}

		return total;
	}

	public int calculateManHours() {

		for (int i = 0; i <= 5; i++) {
			if (a[i].getRating() <= 2) {
				numberFR++;
			}
		}
		for (int i = 6; i <= 7; i++) {
			if (a[i].getRating() >= 4) {
				numberFR++;
			}
		}
		if (numberFR <= 2) {
			er = 20;
		} else if ((numberFR == 3) || (numberFR == 4)) {
			er = 28;
		} else {
			System.out.println("-----------------------------------------------");
			System.out.println("Sorry, please restructure the project team\n");
			er = 0;
		}
		return er;
	}

	public double getPercentage() {
		System.out.print("\nIdentify the assumptions and apply a coefficient as a percentage: ");
		percentage = scan.nextDouble();
		return percentage;
	}
}
