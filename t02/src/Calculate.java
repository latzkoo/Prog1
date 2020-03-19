
public class Calculate {

	public static void main(String[] args) {
		Complex szam1 = new Complex(5, 2);
		Complex szam2 = new Complex(3, -7);
		Complex sum = szam1.add(szam2);
		Complex mul = szam1.mul(szam2);
		
		System.out.println(sum.toString());
		System.out.println(mul.toString());
	}

}
