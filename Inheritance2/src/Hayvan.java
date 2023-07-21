
public class Hayvan {

	private String isim;
	private int kilo;
	private int boy;
	private int bacaksayisi;

	public Hayvan(String isim, int kilo, int boy, int bacaksayisi) {
		this.isim = isim;
		this.kilo = kilo;
		this.boy = boy;
		this.bacaksayisi = bacaksayisi;
	}

	public void yemek_ye() {
		System.out.println("Hayvan su anda yemek yiyor...");
	}

	public void harekete_gec(int hiz) {
		System.out.println("Hayvan " + hiz + " ile hareket ediyor...");
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getKilo() {
		return kilo;
	}

	public void setKilo(int kilo) {
		this.kilo = kilo;
	}

	public int getBoy() {
		return boy;
	}

	public void setBoy(int boy) {
		this.boy = boy;
	}

	public int getBacaksayisi() {
		return bacaksayisi;
	}

	public void setBacaksayisi(int bacaksayisi) {
		this.bacaksayisi = bacaksayisi;
	}
}
