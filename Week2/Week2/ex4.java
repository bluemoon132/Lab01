package Week2;
import java.util.Scanner;
/*Write a Java program to sort a numeric array, 
and calculate the sum and average value of array elements.*/
public class ex4 {
	public static int[] setArray(int soPhanTu) {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[soPhanTu];
		for(int i = 0; i < soPhanTu ; i++) {
			System.out.println("Nhap vao gia tri phan tu " + (i + 1) + ": ");
			arr[i] = input.nextInt();
		}
//		for(int i = 0; i < soPhanTu ; i++){
//			System.out.print(arr[i] + " ");
//		}
		return arr;
	}
	
	public static int[] sort(int[] arr) {
		int temp;
		for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
		}
//		for(int i = 0; i < arr.length ; i++){
//			System.out.print(arr[i] + " ");
//		}
		return arr;
	}
	
	public static int sumArray(int[] arr) {
		int sum = 0;
		for(int i= 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static double averArray(int[] arr) {
		return (double)sumArray(arr)/arr.length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu: ");
		int soPhanTu = input.nextInt();
		int[] arr = setArray(soPhanTu);
		arr = sort(arr);
		System.out.println(sumArray(arr));
		System.out.println(averArray(arr));
		
	}

}
