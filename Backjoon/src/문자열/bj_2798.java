package 문자열;

import java.util.Scanner;

public class bj_2798 {

	static int N;
	static int M;
	static boolean used[];
	static int cards[];
	static int sum;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		cards = new int[N];
		used=new boolean[N];
		
		for (int i = 0; i < N; i++) {
			cards[i] = sc.nextInt();
		}
		
//		combi(0,0);   // 시간초과
//		
//		System.out.println(sum);
		
		for (int i = 0; i < N; i++) {
			int total=0;
			total+=cards[i];
			for (int j = i+1; j < N; j++) {
				total+=cards[j];
				for (int k = j+1; k < N; k++) {
					total+=cards[k];
					if(sum<total && total<=M) {
						sum=total;
					}
					total-=cards[k];
				}
				total-=cards[j];
			}
		}
		
		System.out.println(sum);
	}

//	private static void combi(int total,int i) {
//		
//		if(i==3) {
//			if(sum<total && total<=M) {
//				sum=total;
//			}
//		}
//		
//		for (int j = 0; j < N; j++) {
//			if(!used[j]) {
//				used[j]=true;
//				combi(total+cards[j],i+1);
//				used[j]=false;
//			}
//		}
//	}

}
