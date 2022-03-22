package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_02525 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		
		hour += (minute + time) / 60;
		minute = (minute + time) % 60;
		
		if(hour >= 24) {
			hour %= 24;
		}
		
		System.out.println(hour + " " + minute);
		br.close();
	}
}
