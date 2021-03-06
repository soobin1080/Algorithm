
public class pg_체육복 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };
		
		int answer = 0;

		int student = n - lost.length;

		boolean attend[] = new boolean[lost.length];

		for (int i = 0; i < reserve.length; i++) {
			for (int j = 0; j < lost.length; j++) {
				if (reserve[i] == lost[j]) { // reserve={2}, lost={1,2,3} 인 경우를 위해서 따로 빼서 처리해준 후 빌려줘야함.
					attend[j] = true;
					reserve[i] = -1;
					student++;
				}
			}
		}

		for (int i = 0; i < reserve.length; i++) {
			for (int j = 0; j < lost.length; j++) {
				if (!attend[j]) {
					if (reserve[i] - 1 == lost[j] || reserve[i] + 1 == lost[j]) {
						attend[j] = true;
						student++;
						break;
					}
				}
			}
		}

		answer = student;

		System.out.println(answer);

	}

}
