package Mathematics;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mathematics_02455 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int out = 0;
		int in = 0;
		int count = 0;
		int max = 0;
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			out = Integer.parseInt(st.nextToken());
			in = Integer.parseInt(st.nextToken());
			count -= (out - in);
			
			max = Math.max(max, count);
		}
		
		System.out.println(max);
		br.close();
	}
}
