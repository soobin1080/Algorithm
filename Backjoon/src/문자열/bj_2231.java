package 문자열;

import java.util.Scanner;

public class bj_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int answer=Integer.MAX_VALUE;
		for (int i = n; i > n/2; i--) {
			String s=String.valueOf(i);
			int m=i;
			for (int j = 0; j < s.length(); j++) {
				m+=(s.charAt(j)-'0');
			}
			if(m==n) {
				answer=(answer>i)?i:answer;
			}
		}
		
		if(answer==Integer.MAX_VALUE) answer=0;
		
		System.out.println(answer);
		sc.close();
	}

}
