class Hayvan {
	private String isim;

	public Hayvan(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String konus() {
		return "Hayvan konuşuyor...";
	}

	static class Kedi extends Hayvan {

		public Kedi(String isim) {
			super(isim);

		}

		@Override
		public String konus() {
			return this.getIsim() + " Miyavlıyor...";
		}

	}

	static class Kopek extends Hayvan {
		public Kopek(String isim) {
			super(isim);

		}

		@Override
		public String konus() {
			return this.getIsim() + " Havlıyor...";
		}

	}

	static class At extends Hayvan {
		public At(String isim) {
			super(isim);

		}

		@Override
		public String konus() {
			return this.getIsim() + " Kişniyor...";
		}

	}

	public class Main {
		public static void konustur(Hayvan hayvan) {
			System.out.println(hayvan.konus());
		}

		public static void main(String[] args) {
//			Hayvan hayvan1 = new Kedi("Limon");
//			Hayvan hayvan2 = new Kopek("Boncuk");
//			Hayvan hayvan3 = new At("Tanyeli");
//			System.out.println(hayvan1.konus());
//			System.out.println(hayvan2.konus());
//			System.out.println(hayvan3.konus());

			konustur(new Kedi("Tekir"));
			konustur(new Kopek("Karabaş"));
			konustur(new At("Şahbatur"));

		}
	}

}