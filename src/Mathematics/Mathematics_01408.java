package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_01408 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int currentTime = 0;
		int missionTime = 0;
		int resultTime = 0;
		
		st = new StringTokenizer(br.readLine(), ":");
		currentTime += (Integer.parseInt(st.nextToken()) * 3600);
		currentTime += (Integer.parseInt(st.nextToken()) * 60);
		currentTime += Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), ":");
		missionTime += (Integer.parseInt(st.nextToken()) * 3600);
		missionTime += (Integer.parseInt(st.nextToken()) * 60);
		missionTime += Integer.parseInt(st.nextToken());
		
		if(currentTime > missionTime) {
			resultTime = (24 * 3600) - (currentTime - missionTime);
		}else {
			resultTime = missionTime - currentTime;
		}
		
		int temp = 0;
		int hour = resultTime / 3600;
		temp = resultTime % 3600;
		int minute = temp / 60;
		temp = temp % 60;
		int second = temp;
		
		System.out.println(String.format("%02d", hour) 
					+ ":" + String.format("%02d", minute) 
					+ ":" + String.format("%02d", second));
		br.close();
	}
}
