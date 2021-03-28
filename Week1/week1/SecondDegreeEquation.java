package week1;

public class SecondDegreeEquation {
	private double a;
	private double b;
	private double c;
	
	public double getA() {
		return this.a;
	}
	public double getB() {
		return this.b;
	}
	public double getC() {
		return this.c;
	}
	
	public double setA(double a) {
		return this.a = a;
	}
	public double setB(double a) {
		return this.b = a;
	}
	public double setC(double a) {
		return this.c = a;
	}
	
	public String resolve() {
		// tinh delta
		double d = b*b - 4*a*c;
		if(d > 0) {
			double del = Math.sqrt(d);
			return ("Two distinct roots: x1 =" + (-b+del)/(2*a) + "; x2 =" + (-b-del)/(2*a));
		}
		else if(d == 0) {
			return ("Double root: " + -b/(2*a));
		}
		else {
			return ("No sulution!");
		}
	}
	
}
