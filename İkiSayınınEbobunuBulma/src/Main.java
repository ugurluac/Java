import java.util.Scanner;

public class Main {

	public static int ebobBulma(int sayi1, int sayi2) {
		int ebob = 1;

		for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
			if ((sayi1 % i == 0) && (sayi2 % i == 0)) {
				ebob = i;
			}
		}
		return ebob;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci Sayi : ");
		int birincisayi = scanner.nextInt();
		System.out.println("Ikinci Sayi : ");
		int ikincisayi = scanner.nextInt();

		System.out.println("Iki Sayinin Ebobu : " + ebobBulma(birincisayi, ikincisayi));

	}
}