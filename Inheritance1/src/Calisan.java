
public class Calisan { // Superclass veya baseclass

	private String isim;
	private int maas;
	private String departman;

	public Calisan(String isim, int maas, String departman) {
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;

	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getMaas() {
		return maas;
	}

	public void setMaas(int maas) {
		this.maas = maas;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public void calis() {
		System.out.println("Calisan Calisiyor...");
	}

	public void bilgilerigoster() {
		System.out.println("isim : " + isim);
		System.out.println("maas : " + maas);
		System.out.println("departman : " + departman);
	}

	public void departman_degistir(String yeni_departman) {
		System.out.println("Departman degistiriliyor");
		this.departman = yeni_departman;
		System.out.println("Yeni departman: " + this.departman);
	}

}