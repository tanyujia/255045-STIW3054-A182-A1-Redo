
public class Actor extends mainPage{

	private String type, description;
	private int quantity, wFactor;

	public Actor() {
	}

	public Actor(String t, String d, int wF) {
		type = t;
		description = d;
		wFactor = wF;
	}

	public String getType() {
		return type;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getWFactor() {
		return wFactor;
	}

	public int actorPoints() {
		return quantity * wFactor;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
