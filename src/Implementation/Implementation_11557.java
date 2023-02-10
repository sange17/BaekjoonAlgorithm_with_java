package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_11557 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int N = 0;
		
		int max;
		int alcoholic;
		String university;
		String alcoholUniv;
		for(int i = 0; i < T; i++) {
			
			N = Integer.parseInt(br.readLine());
			
			max = 0;
			alcoholic = 0;
			university = "";
			alcoholUniv = "";
			
			for(int j = 0; j < N; j++) {
				
				st = new StringTokenizer(br.readLine(), " ");
				
				university = st.nextToken();
				alcoholic = Integer.parseInt(st.nextToken());
				
				if(alcoholic > max) {
					
					alcoholUniv = university;
					max = alcoholic;
				}
			}
			
			sb.append(alcoholUniv + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
