package codingtest_0828;

import java.util.Arrays;

public class solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] bombs= {2,2,2,2};
	    Arrays.sort(bombs);
	    int answer=0;
	    int second=1;
	    for (int i = 0; i < bombs.length; i++) {
			if(second>bombs[i]) {
				break;
			}
			answer++;
			second++;
		}
	    
	    System.out.println(answer);
	}

}
