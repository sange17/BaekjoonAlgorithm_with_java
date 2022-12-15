package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_11367 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String name = "";
		int score = 0;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			name = st.nextToken();
			score = Integer.parseInt(st.nextToken());
			
			sb.append(name + " ");
			
			if(score >= 97 && score <= 100) {
				sb.append("A+\n");
			}else if(score >= 90 && score <= 96) {
				sb.append("A\n");
			}else if(score >= 87 && score <= 89) {
				sb.append("B+\n");
			}else if(score >= 80 && score <= 86) {
				sb.append("B\n");
			}else if(score >= 77 && score <= 79) {
				sb.append("C+\n");
			}else if(score >= 70 && score <= 76) {
				sb.append("C\n");
			}else if(score >= 67 && score <= 69) {
				sb.append("D+\n");
			}else if(score >= 60 && score <= 66) {
				sb.append("D\n");
			}else {
				sb.append("F\n");
			}
		}
		
		System.out.println(sb);
		br.close();
		
	}
}
