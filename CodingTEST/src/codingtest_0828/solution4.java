package codingtest_0828;

import java.util.LinkedList;
import java.util.Queue;

public class solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] maps = { { 0, 0, 1, 0, 0 }, { 0, 1, 1, 0, 1 }, { 0, 0, 1, 0, 1 }, { 1, 1, 1, 0, 1 } };
		// int[][] maps = { { 1, 0, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0
		// } };
		int n = maps.length, m = maps[0].length;
		boolean[][] visited = new boolean[n][m];
		int dy[] = { -1, 1, 0, 0 };// 상하좌우
		int dx[] = { 0, 0, -1, 1 };

		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				int length = 0;

				if (maps[i][j] == 1 && !visited[i][j]) {
					Queue<Node> qu = new LinkedList<Node>();
					qu.add(new Node(i, j));
					visited[i][j] = true;

					while (!qu.isEmpty()) {
						Node node = qu.poll();
						
						if (node.y == 0)
							length++;
						if (node.y == n - 1)
							length++;
						if (node.x == 0)
							length++;
						if (node.x == m - 1)
							length++;
						
						for (int k = 0; k < 4; k++) {
							int yy = node.y + dy[k];
							int xx = node.x + dx[k];

							if (yy >= 0 && yy < n && xx >= 0 && xx < m && !visited[yy][xx]) {
								if (maps[yy][xx] == 1) {
									visited[yy][xx] = true;
									qu.add(new Node(yy, xx));
								} else {
									length++;

								}
							}
						}
					}
				}
				answer = (answer < length) ? length : answer;
			}
		}
		System.out.println(answer);
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
