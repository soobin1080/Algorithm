import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pg_K번째수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int array[]= {1, 5, 2, 6, 3, 7, 4};
		int commands[][]= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = new int[commands.length];

		ArrayList<Integer> list=new ArrayList<>();
	
		for (int i = 0; i < commands.length; i++) {
			int f=commands[i][1];
			int s=commands[i][0]-1;
			
			int arr[]=new int[f-s];
			
			for (int j = 0; j < arr.length; j++) {
				arr[j]=array[s++];
			}
			
			Arrays.sort(arr);
			
			answer[i]=arr[commands[i][2]-1];			
			
		}
		
////////////////////////Arrays.copyOfRange///////////////////////////////
		/*
		 * 
		 * int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        */
		sc.close();
	}

}
