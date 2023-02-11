package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_10103 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int aScore = 100;
		int bScore = 100;
		int a = 0;
		int b = 0;
		for(int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if(a < b) {
				aScore -= b;
			}else if(a > b) {
				bScore -= a;
			}
		}
		
		System.out.println(aScore + "\n" + bScore);
		br.close();
	}
}
