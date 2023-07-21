public class Abone {
	public String isim;
	public int bakiye;
	public String sehir;

	public void dogalgaz_ullan(int miktar) {
		if ((this.bakiye - miktar) < 0) {
			System.out.println("Yeterli Bakiye Yok");
		} else {
			this.bakiye -= miktar;
			if (this.bakiye <= 0) {
				System.out.println("Bakyeniz bitmiştir. Kredi Yükleyin..." + "Kredi Limiti = 120 TL");
			} else {
				System.out.println("Yeni Bakiye = " + bakiye);
			}
		}

	}

	public void bakiye_ogren() {
		System.out.println("Bakiye =" + bakiye);
	}

}