
public class Sarkany {

	private int eletero;
	private boolean ehes;
	
	public Sarkany() {
		super();
		this.eletero = 100;
		this.ehes = true;
	}

	public Sarkany(int eletero, boolean ehes) {
		super();
		
		if (eletero < 0)
			eletero = 0;
		
		this.eletero = eletero;
	
		if (this.eletero < 50)
			this.ehes = true;
		else
			this.ehes = ehes;
	}


	public int getEletero() {
		return eletero;
	}
	
	public void setEletero(int eletero) {
		if (eletero < 0)
			eletero = 0;
		
		this.eletero = eletero;

		System.err.println("megolted a sarkanyt");
	}
	
	public boolean isEhes() {
		return ehes;
	}
	
	public void setEhes(boolean ehes) {
		if (this.eletero < 50)
			this.ehes = true;
		else
			this.ehes = ehes;
	}
	
	@Override
	public String toString() {
		return "A sarkany eletereje " + this.eletero + ", és jelenleg " +
				(this.ehes ? "rettenetesen" : "veletlenul nem") + " éhes.";
	}
	
	public boolean vajonElMeg() {
		if (this.eletero > 0)
			return true;
		
		return false;
	}
	
	public void eszik(int value) {
		if (value >= 0)
			this.eletero += value;
		else
			System.err.println("en a helyedben nem eheztetnek egy sarkanyt");
	}
	
}
