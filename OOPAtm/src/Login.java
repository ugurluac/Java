import java.util.Scanner;

public class Login {

	public boolean login(Hesap hesap) {

		Scanner scanner = new Scanner(System.in);
		String kullanici_adi;
		String parola;

		System.out.println("Kullanici Adi :");

		kullanici_adi = scanner.nextLine();
		System.out.println("Parola");

		parola = scanner.nextLine();

		if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getKullanici_parola().equals(parola)) {

			return true;
		}
		return false;

	}
}
