package week1;

public class FirstDegreeEquationTwoVariable {
	private int a11;
	private int a12;
	private int a21;
	private int a22;
	private int b1;
	private int b2;
	// Lay he so
	public int getA11() {
		return this.a11;
	}
	public int getA12() {
		return this.a12;
	}
	public int getA21() {
		return this.a21;
	}
	public int getA22() {
		return this.a22;
	}
	public int getB1() {
		return this.b1;
	}
	public int getB2() {
		return this.b2;
	}
	// Dat he so
	public int setA11(int a11) {
		return this.a11 = a11;
	}
	public int setA12(int a12) {
		return this.a12 = a12;
	}
	public int setA21(int a21) {
		return this.a21 = a21;
	}
	public int setA22(int a22) {
		return this.a22 = a22;
	}
	public int setB1(int b1) {
		return this.b1 = b1;
	}
	public int setB2(int b2) {
		return this.b2 = b2;
	}
	
	// Giai phuong trinh
	public String resolve() {
		// tinh cac dinh thuc
		int d = a11*a22 - a21*a12;
		int d1 = b1*a22 - b2*a12;
		int d2 = a11*b2 - a21*b1;
		
		if(d != 0) {
			return ("Only solution: (x1, x2) = (" + (double)d1/d + ";" + (double)d2/d + ")");
		}
		else if(d1 == d2 && d1 == 0) {
			return ("Infinity solution!");
		}
		else {
			return ("No sulution!");
		}
	}

}
