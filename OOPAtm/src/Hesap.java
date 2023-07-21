
public class Hesap {

	private String kullanici_adi;

	private String kullanici_parola;

	private int bakiye;

	public Hesap(String kullanici_adi, String kullanici_parola, int bakiye) {
		super();
		this.kullanici_adi = kullanici_adi;
		this.kullanici_parola = kullanici_parola;
		this.bakiye = bakiye;
	}

	public String getKullanici_adi() {
		return kullanici_adi;
	}

	public void setKullanici_adi(String kullanici_adi) {
		this.kullanici_adi = kullanici_adi;
	}

	public String getKullanici_parola() {
		return kullanici_parola;
	}

	public void setKullanici_parola(String kullanici_parola) {
		this.kullanici_parola = kullanici_parola;
	}

	public int getBakiye() {
		return bakiye;
	}

	public void setBakiye(int bakiye) {
		this.bakiye = bakiye;
	}

	public void paraYatir(int tutar) {
		this.bakiye += tutar;
		System.out.println("Yeni Bakiyeniz: " + bakiye);
	}

	public void paraCek(int tutar) {
		if ((bakiye - tutar) < 0) {
			System.out.println("Yeterli Bakiyeniz Yok...");
		} else {
			bakiye -= tutar;
			System.out.println("Yeni Bakiyeniz : " + bakiye);
		}
	}

}
