
public class ExperienceFactor {

	private String description;
	private int rating;
	private double wFactor;

	public ExperienceFactor() {
	}

	public ExperienceFactor(String d, double wF) {
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

	public double experienceFactor() {
		return rating * wFactor;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
