import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());

		int arr[] = new int[2000000 + 1];

		for (int i = 0; i < t; i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000]++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 1) {
				sb.append(i - 1000000).append('\n');
			}
		}

		System.out.print(sb);
	}

	// scanner와 collections.sort 를 사용해도 시간 초과가 나지 않는다.
	// collections.sort 가 시간 복잡도 O(n) ~ O(nlogn) 을 보장한다

	/*
	 * Scanner in = new Scanner(System.in); StringBuilder sb = new StringBuilder();
	 * 
	 * int N = in.nextInt();
	 * 
	 * // list 계열 중 하나를 쓰면 된다. ArrayList<Integer> list = new ArrayList<>();
	 * 
	 * for(int i = 0; i < N; i++) { list.add(in.nextInt()); }
	 * 
	 * Collections.sort(list);
	 * 
	 * for(int value : list) { sb.append(value).append('\n'); }
	 * System.out.println(sb); }
	 */

}
