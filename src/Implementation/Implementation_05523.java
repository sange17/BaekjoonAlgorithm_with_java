package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_05523 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		int A = 0;
		int B = 0;
		int ACount = 0;
		int BCount = 0;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			if(A < B) {
				BCount++;
			}else if(A > B) {
				ACount++;
			}else {
				continue;
			}
		}
		
		System.out.println(ACount + " " + BCount);
		br.close();
	}
}
