import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class bj_2667 {
	static int map[][];
	static boolean visited[][];
	static int dx[] = { 0, 0, -1, 1 }; // 상 하 좌 우
	static int dy[] = { -1, 1, 0, 0 };
	static int n;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		map = new int[n][n];
		visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			String st = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = st.charAt(j) - '0';
//				System.out.print(map[i][j] + " ");
			}
//			System.out.println();
		}

		int danji = 0;
		ArrayList<Integer> houses = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j] && map[i][j] == 1) {
					visited[i][j] = true;
					int house = bfs(i, j, danji, 1);
					houses.add(house);
					danji++;
				}
			}
		}

		System.out.println(danji);
		Collections.sort(houses);
		for (int i = 0; i < danji; i++) {
			System.out.println(houses.get(i));
		}

	}

	private static int bfs(int y, int x, int danji, int house) {
		// TODO Auto-generated method stub
		Queue<Node> qu = new LinkedList<Node>();
		qu.add(new Node(y, x));

		while (!qu.isEmpty()) {
			Node node = qu.poll();

			for (int i = 0; i < 4; i++) {
				int xi = node.x + dx[i];
				int yi = node.y + dy[i];
				if (xi >= 0 && yi >= 0 && xi < n && yi < n && !visited[yi][xi]) {
					if (map[yi][xi] == 1) {
						qu.add(new Node(yi, xi));
						visited[yi][xi] = true;
						house++;
					}
				}
			}
		}
		return house;
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
