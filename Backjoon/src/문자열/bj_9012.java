package 문자열;

import java.util.Scanner;
import java.util.Stack;

public class bj_9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int tc = 0; tc < T; tc++) {
			String vps = sc.next();

			Stack<Character> open = new Stack<>();

			for (int i = 0; i < vps.length(); i++) {
				if (vps.charAt(i) == '(') {
					open.add(vps.charAt(i));

				}
				if (vps.charAt(i) == ')') {
					if (open.size() > 0) {
						if (open.peek() == '(')
							open.pop();
					} else
						open.add(vps.charAt(i));
				}
			}

			if (open.size() > 0)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		sc.close();
	}

}
