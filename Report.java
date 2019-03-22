
public class Report extends mainPage{

	private String type;
	private int quantity, averageMH;

	public Report() {
	}

	public Report(String t, int aMH) {
		type = t;
		averageMH = aMH;
	}

	public String getType() {
		return type;
	}

	public int getQuantity() {
		return quantity;
	}

	public int getAverageMH() {
		return averageMH;
	}

	public int reportManHours() {
		return quantity * averageMH;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
