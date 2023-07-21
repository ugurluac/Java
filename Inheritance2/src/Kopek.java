
public class Kopek extends Hayvan {
	private int dissayisi;

	public Kopek(String isim, int kilo, int boy, int bacaksayisi, int dissayisi) {
		super(isim, kilo, boy, bacaksayisi);
		this.dissayisi = dissayisi;
	}

	public void harekete_gec(int hiz) {
		System.out.println("Kopek " + hiz + " ile hereket ediyor...");
	}

	public void kos(int hiz) {
		System.out.println("Kopek Kosuyor...");
		harekete_gec(hiz);
	}

	public int getDissayisi() {
		return dissayisi;
	}

	public void setDissayisi(int dissayisi) {
		this.dissayisi = dissayisi;
	}

}
