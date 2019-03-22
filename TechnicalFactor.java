
public class TechnicalFactor extends mainPage{

	private String description;
	private int rating; 
	private double wFactor;
	
	public TechnicalFactor() {
	}

	public TechnicalFactor(String d, double wF) {
		description = d;
		wFactor = wF;
	}

	public String getDescription() {
		return description;
	}

	public int getRating() {
		return rating;
	}

	public double getWFactor() {
		return wFactor;
	}

	public double technicalFactor() {
		return rating * wFactor;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
