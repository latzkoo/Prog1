
public class Teendo {
	
	private String nev;
	private String ido;
	private int prioritas;
	private boolean teljesitettuk;
	
	public Teendo() {
		super();
		this.nev = "";
		this.ido = "";
		this.prioritas = 1;
	}
	
	public Teendo(String nev, String ido, int prioritas) {
		super();
		this.setNev(nev);
		this.setIdo(ido);
		this.setPrioritas(prioritas);
	}
	
	public static Teendo legfontosabb(Teendo[] todos) {
		if (todos.length > 0) {
			Teendo important = todos[0];
			
			for (int i = 0; i < todos.length; i++) {
				if (todos[i].getPrioritas() < important.getPrioritas())
					important = todos[i];
			}
			
			return important;
		}
		
		return null;
	}
	
	public String getNev() {
		return nev;
	}
	
	public void setNev(String nev) {
		this.nev = nev;
	}
	
	public String getIdo() {
		return ido;
	}
	
	public void setIdo(String ido) {
		this.ido = ido;
	}
	
	public int getPrioritas() {
		return prioritas;
	}
	
	public void setPrioritas(int prioritas) {
		if (prioritas < 1 || prioritas > 5) {
			System.err.println("A prioritás csak 1 és 5 közötti szám lehet!");
			prioritas = 5;
		}
		
		this.prioritas = prioritas;
	}
	
	public boolean isTeljesitettuk() {
		return teljesitettuk;
	}
	
	public void atvalt() {
		this.teljesitettuk = !this.teljesitettuk;
	}
	
	@Override
	public String toString() {
		return "Teendo neve: " + this.getNev() + ", ideje: " + this.getIdo() + ", prioritasa: " + 
				this.getPrioritas() + ", teljesitettuk: " + (this.teljesitettuk ? "igen" : "nem");
	}
	
}
