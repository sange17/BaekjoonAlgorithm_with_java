package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_10214 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		int yonseiSum = 0;
		int koreaSum = 0;
		for(int i = 0; i < T; i++) {
			
			for(int j = 0; j < 9; j++) {
				
				st = new StringTokenizer(br.readLine(), " ");
				
				yonseiSum += Integer.parseInt(st.nextToken());
				koreaSum += Integer.parseInt(st.nextToken());
			}
			
			if(yonseiSum < koreaSum) {
				sb.append("Korea\n");
			}else if(yonseiSum > koreaSum) {
				sb.append("Yonsei\n");
			}else {
				sb.append("Draw\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
