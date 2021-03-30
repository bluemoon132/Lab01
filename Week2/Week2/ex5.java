package Week2;
import java.util.Scanner;

public class ex5 {
	public static int[][] setMatrix(int x, int y){
		Scanner input = new Scanner(System.in);
		int arr[][] = new int[x][y];
		for(int  i = 0; i < x; i++) {
			for(int j = 0 ; j< y; j++) {
				System.out.println("Nhap vao phan tu ["+(i+1)+"]["+(j+1)+"]: " );
				arr[i][j] = input.nextInt();
			}
		}
		return arr;
	}
	
	public static void printMatrix(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println("");
		}
	}
	
	public static int[][] addMatrix(int[][] arr1, int[][] arr2) {
		int[][] arr = new int[arr1.length][arr1[0].length];
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao kich thuoc cua ma tran: ");
		int x = input.nextInt();
		int y = input.nextInt();
		int arr1[][]= setMatrix(x,y);
		int arr2[][] = setMatrix(x,y);
		printMatrix(addMatrix(arr1, arr2));
	}

}
