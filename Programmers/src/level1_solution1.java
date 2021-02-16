import java.util.Scanner;

public class level1_solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int answer = 0;
		boolean arr[] = new boolean[n+1];

		if (n > 2) {

			for (int i = 3; i < n + 1; i++) {
				boolean flag = false;
				if (arr[i] == false) {
					for (int j = 2; j < i; j++) {
						int mod = i % j;
						// 소수가 아니다
						if (mod == 0) {
							flag = true;
							break;
						}
					}
					//소수이다
					if (flag == false) {
						for (int j = i; j < n+1; j+=i) {
							arr[j]=true;							
						}
						answer++;
					}
				}
			}
			// 소수 2 포함
			answer++;
		} else if (n == 2)
			answer = 1;

		System.out.println(answer);
		sc.close();
	}

}
