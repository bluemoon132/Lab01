package week1;

public class Test {
	public static void main(String args[]) {
//		FirstDegreeEquationTwoVariable eq = new FirstDegreeEquationTwoVariable();
//		eq.setA11(4);
//		eq.setA12(3);
//		eq.setB1(2);
//		eq.setA21(8);
//		eq.setA22(6);
//		eq.setB2(5);
//		System.out.println(eq.resolve());
		SecondDegreeEquation eq2 = new SecondDegreeEquation();
		eq2.setA(1);
		eq2.setB(2);
		eq2.setC(6);
		System.out.println(eq2.resolve());
	}
}
