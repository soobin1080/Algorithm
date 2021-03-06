

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_1012 {

	static int r;
	static int c;
	static int cabbage;

	static int arr[][];
	static boolean visited[][];

	static int dy[] = { 1, -1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		for (int tc = 0; tc < TC; tc++) {
			// 입력받기
			r = sc.nextInt();
			c = sc.nextInt();
			cabbage = sc.nextInt();

			arr = new int[r][c];
			visited = new boolean[r][c];

			for (int i = 0; i < cabbage; i++) {
				int y = sc.nextInt();
				int x = sc.nextInt();

				arr[y][x] = 1;
			}

			int count = 0;

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (arr[i][j] == 1 && !visited[i][j]) {
						visited[i][j] = true;
						bfs(i, j);
						count++;
					}
				}
			}

			System.out.println(count);
		}
		sc.close();
	}

	private static void bfs(int i, int j) {
		// TODO Auto-generated method stub
		Queue<Node> qu = new LinkedList<Node>();
		qu.add(new Node(i, j));

		while (!qu.isEmpty()) {
			Node node = qu.poll();
			int y = node.y;
			int x = node.x;

			for (int k = 0; k < 4; k++) {
				int iy = dy[k] + y;
				int ix = dx[k] + x;
				if (ix >= 0 && ix < c && iy >= 0 && iy < r) {
					if (arr[iy][ix] == 1 && !visited[iy][ix]) {
						visited[iy][ix] = true;
						qu.add(new Node(iy, ix));
					}
				}
			}
		}
	}

	static class Node {
		int y;
		int x;

		Node(int y, int x) {
			this.y = y;
			this.x = x;
		}

	}

}
