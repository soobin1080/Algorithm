import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class bj_1427 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		Integer arr[]=new Integer[s.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.charAt(i)-'0';
		}
		
		Arrays.sort(arr, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}
		});
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		sc.close();
	}

}
