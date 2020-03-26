
public class Bevasarlas extends Teendo {

	private String miket;
	private int maxOsszeg;
	
	public Bevasarlas(String ideje, String miket, int maxOsszeg) {
		super("Bevasarlas", ideje, 3);
		this.setMiket(miket);
		this.setMaxOsszeg(maxOsszeg);
		this.setPrioritas(3);
	}
	
	public String getMiket() {
		return miket;
	}
	public void setMiket(String miket) {
		this.miket = miket;
	}
	public int getMaxOsszeg() {
		return maxOsszeg;
	}
	public void setMaxOsszeg(int maxOsszeg) {
		this.maxOsszeg = maxOsszeg;
	}
	
	public void frissit(String item) {
		if (item.equals("<torol>")) {
			this.setMiket("");
			this.setMaxOsszeg(0);
		}
		else {
			this.setMiket(this.getMiket() + ", " + item);
			this.setMaxOsszeg(this.maxOsszeg += 1000);
		}
	}
	
	@Override
	public void setPrioritas(int prioritas) {
		super.setPrioritas(3);
	}
	
	@Override
	public String toString() {
		return "Bevasarlas. Termekek: " + this.getMiket() + ", tervezett osszeg: " + this.getMaxOsszeg() + " Ft";
	}
	
}
