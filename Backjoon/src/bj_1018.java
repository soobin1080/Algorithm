

import java.util.Scanner;

public class bj_1018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		char arr[][] = new char[M][N];

		for (int i = 0; i < M; i++) {
			arr[i] = sc.next().toCharArray();
		}

		int min = Integer.MAX_VALUE;
		for (int i = 0; i < M - 7; i++) {
			for (int j = 0; j < N - 7; j++) {
				// 검사
				char now = 'W';
				int count = 0;
				for (int k = i; k < i + 8; k++) {
					for (int l = j; l < j + 8; l++) {
						if (now != arr[k][l]) {
							count++;
						}

						if (l != j + 7) {

							if (now == 'W') {
								now = 'B';
							} else {
								now = 'W';
							}
						}
					}
				}
				
				if(min>count) {
					min=count;
				}
				
				// B로 시작하는게 더 적을 수 도 있으니까
				now = 'B';
				count = 0;
				for (int k = i; k < i + 8; k++) {
					for (int l = j; l < j + 8; l++) {
						if (now != arr[k][l]) {
							count++;
						}

						if (l != j + 7) {

							if (now == 'W') {
								now = 'B';
							} else {
								now = 'W';
							}
						}
					}
				}
				
				if(min>count) {
					min=count;
				}
			}
		}
		
		System.out.println(min);
		sc.close();
	}
}
