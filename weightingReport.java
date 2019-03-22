import java.util.Scanner;

public class weightingReport {

	Scanner scan=new Scanner(System.in);
	private Report a[] = new Report[3];
	private int total;

	public int calculation() {
		a[0] = new Report("Simple", 12);
		a[1] = new Report("Average", 20);
		a[2] = new Report("Complex", 40);

		System.out.println("\n**********Weighting Report for Complexity**********");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Quantity of "+a[i].getType()+" Report: ");
			a[i].setQuantity(scan.nextInt());
			total += a[i].reportManHours();
		}
		return total;
	}
	
}
