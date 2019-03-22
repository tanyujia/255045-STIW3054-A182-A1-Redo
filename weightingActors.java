import java.util.Scanner;

public class weightingActors {

	Scanner scan=new Scanner(System.in);
	private Actor a[] = new Actor[3];
	private int total;

	public int calculation() {
		a[0] = new Actor("Simple", "Defined API", 1);
		a[1] = new Actor("Average", "Interactive or Protocol driven interface", 2);
		a[2] = new Actor("Complex", "Graphical User Interface", 3);

		System.out.println("\n**********Weighting Actors for Complexity**********");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Quantity of "+a[i].getType()+" Actor ("+a[i].getDescription()+"): ");
			a[i].setQuantity(scan.nextInt());
			total += a[i].actorPoints();
		}
		return total;
	}
	
}
