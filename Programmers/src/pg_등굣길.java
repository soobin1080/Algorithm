
public class pg_등굣길 {
//dp 문제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 4;
		int n = 3;
		int[][] puddles = { { 2, 2 } };

		int answer = 0;

		int[][] map = new int[n + 1][m + 1];

		for (int i = 0; i < puddles.length; i++) {
			map[puddles[i][1]][puddles[i][0]] = -1;
		}

		map[1][1] = 1;

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < m + 1; j++) {

				if (map[i][j] == -1) {
					continue;
				}
				
				//이 조건들 안해주면 시간 초과난다.
				if (map[i][j - 1] >= 0)	//왼쪽이 웅덩이 아닐 때
					map[i][j] += map[i][j - 1] % 1000000007;
				if (map[i - 1][j] >= 0)   //위쪽이 웅덩이 아닐 때
					map[i][j] += map[i - 1][j] % 1000000007;
			}
		}

		answer = map[n][m] % 1000000007;

		System.out.println(answer);

	}

}
