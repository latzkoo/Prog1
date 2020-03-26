
public class Megbeszeles extends Teendo {

	private String kivel;
	private String hol;
	private final int prioritas = 1;
	public static int MEGBESZELES_DARAB = 0;
	
	public Megbeszeles(String ideje, String kivel, String hol) {
		super("Megbeszeles", ideje, 1);
		this.kivel = kivel;
		this.hol = hol;
		this.setPrioritas(1);
		this.MEGBESZELES_DARAB++;
	}

	public String getKivel() {
		return kivel;
	}

	public void setKivel(String kivel) {
		this.kivel = kivel;
	}

	public String getHol() {
		return hol;
	}

	public void setHol(String hol) {
		this.hol = hol;
	}
	
	@Override
	public void setPrioritas(int prioritas) {
		super.setPrioritas(1);
	}

	@Override
	public String toString() {
		return "Megbeszeles, partner: " + this.getKivel() + ". Idopont: " + this.getIdo() +
				". Helyszin: " + this.getHol();
	}
	
}
