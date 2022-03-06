package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_02845 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int L = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int LP = L * P;
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < 5; i++) {
			sb.append(Integer.parseInt(st.nextToken()) - LP).append(" ");
		}
		
		System.out.println(sb);
		br.close();
	}
}
