package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mathematics_10984 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		double N = 0.0;
		int score = 0;
		int scores = 0;
		double scoreSum = 0.0;
		double avg = 0.0;
		
		
		for(int i = 0; i < T; i++) {
			
			N = Double.parseDouble(br.readLine());
			
			for(int j = 0; j < N; j++) {
				
				st = new StringTokenizer(br.readLine(), " ");
				
				score = Integer.parseInt(st.nextToken());
				scores += score;
				scoreSum += Double.parseDouble(st.nextToken()) * score;
				
			}
						
			avg = scoreSum / scores;
			
			sb.append(scores + " " + String.format("%.1f", avg) + "\n");
			
			scores = 0;
			scoreSum = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
