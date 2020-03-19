public class Complex {
	
	private final double real;
	private final double imag;
	
	public Complex(double real, double imag) {
		super();
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public double getImag() {
		return imag;
	}
	
	@Override
	public String toString() {
		return real+"+"+imag+"i";
	}
	
	public Complex add(Complex number2) {
		Complex sum = new Complex(this.real + number2.real, this.imag + number2.imag);
		
		return sum;
	}
	
	public Complex mul(Complex number2) {
		double tag1 = this.real * number2.real;
		double tag2 = this.real * number2.imag;
		
		double tag3 = this.imag * number2.real;	
		double tag4 = this.imag * number2.imag * -1;
		
		Complex mul = new Complex(tag1 + tag4, tag2 + tag3);
		
		return mul;
	}
	
}
