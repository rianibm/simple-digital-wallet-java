
public class DigitalWallet {
	private String owner;
	private double saldo;
	
	public DigitalWallet(String owner) {
		this.owner = owner;
	}
	
	public void insertCoin(DigitalCoin dc) {
		this.saldo += dc.toRupiah();
	}
	
	public String getOwner() {
		return owner;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
}