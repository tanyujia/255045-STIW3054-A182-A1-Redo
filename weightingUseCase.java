import java.util.Scanner;

public class weightingUseCase {

	Scanner scan=new Scanner(System.in);
	private UseCase a[] = new UseCase[3];
	private int total;

	public int calculation() {
		a[0] = new UseCase("Simple", "3 or fewer transactions", 5);
		a[1] = new UseCase("Average", "4 to 7 transactions", 10);
		a[2] = new UseCase("Complex", "Greater than 7 transactions", 15);

		System.out.println("\n**********Weighting Use Case for Complexity**********");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("Quantity of "+a[i].getType()+" Use Case ("+a[i].getDescription()+"): ");
			a[i].setQuantity(scan.nextInt());
			total += a[i].usecases();
		}
		return total;
	}
	
}
