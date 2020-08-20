import java.util.Arrays;
import java.util.Comparator;

public class pg_가장큰수 {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 6, 10, 2 };
		
		String answer="";
		
		String[] arr=new String[numbers.length];
		
		for (int i = 0; i < arr.length; i++) {
			// string a=""; a+"b"; 보다 valueOf 사용하는게 더 빠르고 효율적이다.
			arr[i]=String.valueOf(numbers[i]);
		}
		
		Arrays.sort(arr,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return (o2+o1).compareTo(o1+o2);
			}
		});
		return arr[0].equals("0")?arr[0]:String.join("", arr);

	}

}
