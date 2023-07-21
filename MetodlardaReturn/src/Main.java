
public class Main {
	public static int ikiilecarp(int a) {
		return a * 2;

	}

	public static int ikiiletopla(int a) {

		return a + 2;
	}

	public static int dortilecarp(int a) {

		return a * 4;

	}

	public static int deneme(int a) {
		System.out.println("Cikti Veriliyor...");

		return a * 2;

	}

	public static void main(String[] args) {

		System.out.println("Sonuc " + dortilecarp(ikiiletopla(dortilecarp(4))) + "\n");
		System.out.println(deneme(4));

	}
}
