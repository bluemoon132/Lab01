package week2;
import java.util.*;

public class ex2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Number of lines: ");
		int iLine = keyboard.nextInt();
		
		for(int j = 0; j < iLine; j++) {
			for(int k1 = 0; k1 < iLine - j; k1++) {
				System.out.print(" ");
			}
			for(int k2 = 0; k2 < 2*j + 1; k2++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
	
}
