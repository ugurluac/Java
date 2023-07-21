
public class Yonetici extends Calisan {

	private int sorumlu_kisi; // Ekstra Özellik

	public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {
		super(isim, maas, departman);
		this.sorumlu_kisi = sorumlu_kisi;
		// TODO Auto-generated constructor stub
	} // Subclass

	public void zamyap(int zammiktari) {
		System.out.println("Calisanlara " + zammiktari + " tl zam yapildi.");
	}

	public void bilgilerigoster() {
		super.bilgilerigoster();
//		System.out.println("isim : " + getIsim());
//		System.out.println("maas : " + getMaas());
//		System.out.println("departman : " + getDepartman());
		System.out.println("Sorumlu kisi sayisi: " + this.sorumlu_kisi);
	}
}
