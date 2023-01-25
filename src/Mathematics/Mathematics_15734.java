package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_15734 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int L = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		
		for(int i = A; i > 0; i--) {
			
			if(L > R) {
				R++;
			}else if(L == R) {
				L++;
			}else {
				L++;
			}
		}
		
		System.out.println(Math.min(L, R) * 2);
		br.close();
	}
}
