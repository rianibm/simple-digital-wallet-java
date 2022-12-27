
public class Main {

	public static void main(String[] args) {
		//buat dua coin
		Bitcoin coin1 = new Bitcoin("Bitcoin", 10);   //10000
		Bitcoin coin2 = new Bitcoin("Bitcoin", 0.25); //250
		
		//buat digital wallet
		DigitalWallet ukdwPay = new DigitalWallet("Yuan Lukito");
		
		//tampilkan nama pemilik dan saldo sekarang
		System.out.println(ukdwPay.getOwner());  //Yuan Lukito
		System.out.println(ukdwPay.getSaldo());  //0
		
		//masukkan coin 1 ke digitalwallet dan tampilkan saldonya
		ukdwPay.insertCoin(coin1); //10000
		System.out.println(ukdwPay.getSaldo());  //seharusnya 10000
		
		//masukkan coin 2 ke digital wallet dan tampilkan saldonya
		ukdwPay.insertCoin(coin2);		//tambah 250
		System.out.println(ukdwPay.getSaldo());  //seharusnya 10250
	}
}