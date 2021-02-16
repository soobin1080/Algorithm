package 문자열;

import java.util.Scanner;

public class bj_2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		boolean used[] = new boolean[input.length()];
		int count = 0;

		for (int i = 0; i < input.length(); i++) {

			char now = input.charAt(i);

			if (!used[i]) {

				used[i] = true;
				if (i + 1 < input.length()) {
					switch (now) {
					case 'c':
						if (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-')
							used[i + 1] = true;
						break;
					case 'd':
						if (input.charAt(i + 1) == '-')
							used[i + 1] = true;

						if (i + 2 < input.length() && input.charAt(i + 1) == 'z' && input.charAt(i + 2) == '=') {
							used[i + 1] = true;
							used[i + 2] = true;
						}
						break;
					case 'l':
						if (input.charAt(i + 1) == 'j')
							used[i + 1] = true;
						break;
					case 'n':
						if (input.charAt(i + 1) == 'j')
							used[i + 1] = true;
						break;
					case 's':
						if (input.charAt(i + 1) == '=')
							used[i + 1] = true;

						break;
					case 'z':
						if (input.charAt(i + 1) == '=')
							used[i + 1] = true;
						break;

					default:
						break;
					}
				}
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
