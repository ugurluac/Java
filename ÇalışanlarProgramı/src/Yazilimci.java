
public class Yazilimci extends Calisan {
	private String diller;

	public Yazilimci(String ad, String soyad, int id, String diller) {
		super(ad, soyad, id);
		this.diller = diller;

	}

	public void formatAt(String isletim_sistemi) {

		System.out.println(getAd() + " " + isletim_sistemi + "ni yüklüyor...");
	}

	@Override
	public void bilgileriGoster() {
		// TODO Auto-generated method stub
		super.bilgileriGoster();
	}

}
