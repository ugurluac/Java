import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Idman Programina Hosgeldiniz...");
		String idmanlar = "Gecerli Hareketler...\n" + "Burpee\n" + "Pushup\n" + "Situp\n" + "Squat";
		System.out.println(idmanlar);

		System.out.println("Bir idman oluştrun...");

		System.out.println("burpee Sayisi : ");
		int burpee = scanner.nextInt();
		System.out.println("pushup Sayisi : ");
		int pushup = scanner.nextInt();
		System.out.println("situp Sayisi : ");
		int situp = scanner.nextInt();
		System.out.println("squat Sayisi : ");
		int squat = scanner.nextInt();
		scanner.nextLine();

		Idman idman = new Idman(burpee, pushup, situp, squat);

		System.out.println("Idmaniniz basliyor....");

		while (idman.idmanBittiMi() == false) {

			System.out.println("Hareket Seciniz: Burpee, Pushup, Situp, Squat");
			String tur = scanner.nextLine();
			System.out.println(tur + " Bu hareketten kactane yapacaksiniz?");
			int sayi = scanner.nextInt();
			scanner.nextLine();

			idman.hareketYap(tur, sayi);
		}
		System.out.println("Idman basari ile bitti. Tebrikler.");
	}
}