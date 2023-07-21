
public class Main {
	public static void main(String[] args) {

		ATM atm = new ATM();
		Hesap hesap = new Hesap("Cem Ugurlu", "123", 35000000);
		atm.calis(hesap);
		System.out.println("Programdan Cikiliyor...");
	}
}
