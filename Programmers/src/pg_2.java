
public class pg_2 {
	static boolean flag = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] drum = { "######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######" };

		char[][] arr = new char[drum.length][drum.length];
		for (int i = 0; i < drum.length; i++) {
			for (int j = 0; j < drum.length; j++) {
				arr[i][j] = drum[i].charAt(j);
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		int count = 0;
		for (int i = 0; i < drum.length; i++) {
			start(0, i, arr, 0);
			if(flag)
			count++;
		}
		System.out.println(count);
	}

	private static void start(int y, int x, char[][] arr, int star) {
		// TODO Auto-generated method stub
		if (star == 2) {
			flag=false;
			return;
		}
		if (y == arr.length) {
			flag=true;
			return;
		}
		switch (arr[y][x]) {
		case '#':
			start(y + 1, x, arr, star);
			break;
		case '>':
			start(y, x + 1, arr, star);
			break;
		case '<':
			start(y, x - 1, arr, star);
			break;
		case '*':
			start(y + 1, x, arr, star + 1);
			break;
		}
	}

}