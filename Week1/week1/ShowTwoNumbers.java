package week1;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {

	public static void main(String[] args) {
		String str1, str2;
		String Notification = "You've just entered: ";
		
		str1 = JOptionPane.showInputDialog(null,
				"Please input the first number: ", "Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		
		Notification += str1 + " and ";
		
		str2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		
		Notification += str2;
		
		JOptionPane.showMessageDialog(null, Notification,
				"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);

	}

}
