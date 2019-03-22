
public class mainPage {

	public static void main(String[] args) throws Exception {
		int actorPoint, useCase, uucp, rManHours;
		double szUC, tFactor, er, eFactor, ef, ucp, mHours, adjMHours, tmHours;
		weightingEF d = new weightingEF();
		
		do {
			weightingActors a = new weightingActors();
			actorPoint = a.calculation();
			System.out.println("==============================================");
			System.out.println("Total Actor Points: " + actorPoint);
			Thread.sleep(2000);

			weightingUseCase b = new weightingUseCase();
			useCase = b.calculation();
			System.out.println("==============================================");
			System.out.println("Total Use Case: " + useCase);
			Thread.sleep(2000);

			uucp = actorPoint + useCase;
			System.out.println("Unadjusted Use Case Points: " + uucp);
			Thread.sleep(2000);

			weightingTF c = new weightingTF();
			tFactor = c.calculation();
			System.out.println("==============================================");
			System.out.println("Total Technical Factors: " + tFactor);
			Thread.sleep(2000);

			szUC = uucp * tFactor;
			System.out.println("Size of software (use case) project: " + szUC);
			Thread.sleep(2000);

			eFactor = d.calculation();
			ef = (-0.03 * eFactor) + 1.4;
			ucp = szUC * ef;
			System.out.println("==============================================");
			System.out.println("Total Experience Factors: " + eFactor);
			System.out.println("Use Case Points: " + ucp);
			Thread.sleep(2000);

			er = d.calculateManHours();
		} while (er == 0);

		mHours = er * ucp;
		System.out.println("==============================================");
		System.out.printf("Total man-hours: %.2f\n", mHours);
		Thread.sleep(2000);

		
		adjMHours = (1.0 + (d.getPercentage() / 100)) * mHours;
		System.out.println("==============================================");
		System.out.printf("Total adjusted man-hours: %.2f\n", adjMHours);
		Thread.sleep(2000);

		weightingReport f = new weightingReport();
		rManHours = f.calculation();
		System.out.println("==============================================");
		System.out.println("Total Report Man-hour Estimate: " + rManHours);
		Thread.sleep(2000);

		tmHours = adjMHours + rManHours;
		System.out.printf("Total man-hours: %.2f\n", tmHours);
	}
}
