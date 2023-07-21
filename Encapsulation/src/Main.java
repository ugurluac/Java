public class Main {
	public static void main(String[] args) {
//		Abone abone = new Abone();
//		abone.isim = "Cem Uğurlu";
//		abone.bakiye = 200;
//		abone.sehir = "Ankara";
//		abone.dogalgaz_ullan(200);

		GelismisAbone abone = new GelismisAbone("Cem Uğurlu", 50, "Ankara");
		abone.bakiye_ogren();
	}
}