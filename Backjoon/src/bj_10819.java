import java.util.Arrays;
import java.util.Scanner;

public class bj_10819 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;

		search(arr);

		for (int i = 1; i < arr.length; i++) {
			sum = Math.abs(arr[i] - arr[i + 1]);
		}

		System.out.println();
	}

	private static void search(int[] arr) {
		// TODO Auto-generated method stub
		int array[] = new int[arr.length];
		
		

	}

}
