package week1;

import javax.swing.JOptionPane;

public class Caculate {

	public static void main(String[] args) {
		String str1, str2;
		
		str1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		
		str2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
			
		Double num1 = Double.parseDouble(str1);
		Double num2 = Double.parseDouble(str2);
		Double sum = num1 + num2;
		Double difference = num1 - num2;
		Double product = num1 * num2;
		Double quotient = num1 / num2;
		JOptionPane.showMessageDialog(null, "Sum of "+ num1 + " and " + num2 + " is : " + sum +
				"\nDifference of "+ num1 + " and " + num2 + " is : " + difference +
				"\nProduct of "+ num1 + " and " + num2 + " is : " + product +
				"\nQuotient of "+ num1 + " and " + num2 + " is : " + quotient,
				"Sum, difference, product and quotient of two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}

}
