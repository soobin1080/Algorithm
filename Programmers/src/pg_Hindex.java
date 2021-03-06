import java.util.Arrays;

public class pg_Hindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] citations = { 3, 0, 6, 1, 5 };

		Arrays.sort(citations);

		int max = citations[citations.length - 1];

		Node h[] = new Node[max + 1];

		for (int i = 0; i < h.length; i++) {
			int citation = i;
			int paper = 0;
			int no = 0;
			for (int j = 0; j < citations.length; j++) {
				if (citations[j] >= citation) { // i번 이상 인용된 논문 개수세기
					paper++;
				} else
					no++;

			}
			h[i] = new Node(paper, no);

		}

		int answer = 0;
		for (int i = 0; i < h.length; i++) {
			if (h[i].yes >= i && h[i].no < i) {
				if(answer<i)
					answer=i;
			}
		}

		System.out.println(answer);

	}

	static class Node {
		int yes;
		int no;

		Node(int y, int n) {
			this.yes = y;
			this.no = n;
		}
	}

}
