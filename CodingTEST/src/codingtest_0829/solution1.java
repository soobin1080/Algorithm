package codingtest_0829;


public class solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 1;
//		int N = 1;
//		int[][] simulation_data = { { 0, 3 }, { 2, 5 }, { 4, 2 }, { 5, 3 } };
		int[][] simulation_data = { { 0, 1 }, { 1, 1 }, { 1, 2 }, { 2, 1 } };
//		int[][] simulation_data = { { 2, 3 }, { 5, 4 }, { 6, 3 }, { 7, 4 } };
		int answer = 0; // 대기시간

		int time[] = new int[20];

		for (int i = 0; i < simulation_data.length; i++) {
			if (time[simulation_data[i][0]] < N) {
				for (int j = simulation_data[i][0]; j < simulation_data[i][0] + simulation_data[i][1]; j++) {
					time[j]++;
				}
			}

			else {
				while (time[simulation_data[i][0]] == N) {
					simulation_data[i][0]++;
					answer++;
				}

				for (int j = simulation_data[i][0]; j < simulation_data[i][0] + simulation_data[i][1]; j++) {
					time[j]++;

				}
			}
		}

		System.out.println(answer);
	}

}
