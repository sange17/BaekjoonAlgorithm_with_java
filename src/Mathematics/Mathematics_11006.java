package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_11006 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int N = 0;
		int M = 0;
		
		int chickenU = 0;
		int chickenT = 0;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			chickenU = M * 2 - N;
			chickenT = M - chickenU;
			
			sb.append(chickenU + " " + chickenT + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
