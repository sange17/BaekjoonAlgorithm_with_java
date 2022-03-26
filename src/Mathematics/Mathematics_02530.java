package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_02530 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int second = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		
		second += time % 60;
		if(second >= 60) {
			minute += second / 60;
			second = second % 60;
		}
		
		minute += time / 60;
		if(minute >= 60) {
			hour += minute / 60;
			minute %= 60;
		}
		
		hour += minute / 60;
		if(hour % 24 == 0) {
			hour = 0;
		}else if(hour % 24 > 0) {
			hour %= 24;
		}
		
		System.out.println(hour + " " + minute + " " + second);
		br.close();
	}
}
