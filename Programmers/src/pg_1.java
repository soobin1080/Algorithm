import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

public class pg_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] bakery= {"12:00 10"};
		
		String current_time="12:00";
		int K=10;
		
		int sell=0;
		LocalTime current = LocalTime.parse(current_time);
		
		int answer=0;
		for (int i = 0; i < bakery.length; i++) {
			StringTokenizer st=new StringTokenizer(bakery[i]);
			LocalTime t=LocalTime.parse(st.nextToken());
			int bread=Integer.parseInt(st.nextToken());
			//System.out.println(t+"  "+ bread);
			
			if(!t.isBefore(current)) {
				sell+=bread;
			}
			if(sell>=K) {
			answer=(int) current.until(t,ChronoUnit.MINUTES);
			break;
			}
			
		}
		
		
		System.out.println(answer);

	}

}
