package codingtest_0828;

public class solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abacde";
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {// 시작점
			for (int j = 1; j < s.length() + 1; j++) {// 몇개
				if (i + j < s.length() + 1) {
					// 검사하기
					int length = j;
					int n = j / 2;
					for (int k = 0; k < n; k++) {
						if (s.charAt(i + k) != s.charAt(i + j - k - 1)) {
							length = 0;
							break;
						}
					}
					answer = (answer < length) ? length : answer;
				}
			}

			if (answer == s.length())
				break;
		}

		System.out.println(answer);

	}

}
