
public class Bitcoin implements DigitalCoin {
	private String name;
	private double count;
	
	public Bitcoin(String nama, double count) {
		this.name = nama;
		this.count = count;
	}
	
	public double toRupiah() {
		return count*1000;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCount() {
		return count;
	}
}
