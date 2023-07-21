public class Main {

	public static void selamlama(String isim) {
		System.out.println("Selam" + isim);

	}

	public static void toplam(int a, int b, int c) {

		int toplam = a + b + c;
		System.out.println("Toplamlari = " + (toplam));
	}

	public static void main(String[] args) {
		selamlama(" Cem");

		toplam(3, 4, 5);

	}

}
