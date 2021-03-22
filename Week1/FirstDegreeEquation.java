package week1;

public class FirstDegreeEquation {
	private double a;
	private double b;
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public void setA(double a) {
		this.a = a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public String resolve() {
		if(a == 0 && b == 0) {
			return ("Infinity solution!");
		}
		else if(a != 0) {
			return ("Only solution: "+ -b/a);
		}
		else {
			return ("No sulution!");
		}
	}

}
