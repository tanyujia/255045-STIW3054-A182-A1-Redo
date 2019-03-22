
public class UseCase extends mainPage {

	private String type, description;
	private int quantity, wFactor;

	public UseCase() {
	}

	public UseCase(String t, String d, int wF) {
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

	public int usecases() {
		return quantity * wFactor;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
