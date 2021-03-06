package SkillCheck;
//방금그곡
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

public class solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "CC#BCC#BCC#BCC#B";
		// String[] musicinfos = { "12:00", "12:14", "HELLO", "CDEFGAB", "13:00",
		// "13:05", "WORLD", "ABCDEF" };
		String[] musicinfos = { "03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B" };
		String answer = "";
		int maxPlayTime = 0;

		for (int i = 0; i < musicinfos.length; i++) {

			StringTokenizer st = new StringTokenizer(musicinfos[i], ",");
			LocalTime start = LocalTime.parse(st.nextToken());
			LocalTime finish = LocalTime.parse(st.nextToken());

			String title = st.nextToken();

			int play = (int) start.until(finish, ChronoUnit.MINUTES);

			char[] music = new char[play];
			
			char[] code = st.nextToken().toCharArray();

			int count = 0, idx = 0;
			while (count != play) {
				if (idx == code.length)
					idx = 0;

				music[count] = code[idx];
				count++;
				idx++;
			}

			String mm = "";
			for (int j = 0; j < music.length; j++) {
				mm += music[j];
			}
			
			System.out.println(mm);

			if (mm.contains(m) && !mm.contains(m + "#")) {

				if (play > maxPlayTime) {
					maxPlayTime = play;
					answer = title;
				}
				System.out.println(maxPlayTime);

			} 
		}
		
		if(maxPlayTime==0) {
			answer="\'(None)\'";
		}
		
		System.out.println(answer);

	}

}
