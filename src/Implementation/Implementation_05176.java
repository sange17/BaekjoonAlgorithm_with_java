package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_05176 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int K = Integer.parseInt(br.readLine());
		int P = 0;
		int M = 0;
		int seat = 0;
		
		for(int i = 0; i < K; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			P = Integer.parseInt(st.nextToken());		// 참가자의 수
			M = Integer.parseInt(st.nextToken());		// 자리의 수
			
			int[] array = new int[M + 1];
			int count = 0;
			for(int j = 0; j < P; j++) {
				
				seat = Integer.parseInt(br.readLine());
				
				if(array[seat] == 0) {
					array[seat]++;
				}else if(array[seat] == 1) {
					count++;
				}
			}
			
			sb.append(count + "\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
