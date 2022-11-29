package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_02711 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		int missPlace;
		String missString;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			missPlace = Integer.parseInt(st.nextToken());
			missString = st.nextToken();
			
			sb.append(missString);
			
			sb.deleteCharAt(missPlace - 1);
			
			System.out.println(sb);
			
			sb.setLength(0); 		// StringBuilder 값 초기화
		}
	}
}
