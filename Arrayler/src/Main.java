public class Main {

	public static void arrayi_bastir(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + (i + 1) + ":" + array[i]);
		}
	}

	public static double ortalamabul(int[] array) {
		int toplam = 0;

		for (int i = 0; i < array.length; i++) {
			toplam += array[i];

		}
		return ((double) toplam / array.length);

	}

	public static void main(String[] args) {

//		int[] a = new int[10];

//		a[5] = 32;
//		a[9] = 50;
//		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		System.out.println(a[10]);
		int[] a = new int[5];

		int[] b = { 10, 20, 30, 40, 50 };

		arrayi_bastir(b);
		System.out.println("Ortalama: " + ortalamabul(b));
//		System.out.println("Arrayimizin uzunlugu : " + b.length);

//		Scanner scanner = new Scanner(System.in);
//		for (int i = 0; i < 5; i++) {
//			a[i] = scanner.nextInt();
//
//		}

//		for (int i = 0; i < 5; i++) {
//			a[i] = i * 4 + 2;
//		}
//		for (int i = 0; i < 5; i++) {
//			System.out.println(a[i]);
//		}

	}
}
