package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_01673 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		long n = 0;
		long k = 0;
		long sum = 0;
		while((str = br.readLine()) != null && str.length() != 0) {
						
			st = new StringTokenizer(str, " ");
			
			n = Long.parseLong(st.nextToken());
			k = Long.parseLong(st.nextToken());
			sum = n;
			while(n >= k) {
				
				n -= k;

				n++;
				
				sum++;
			}
			
			sb.append(sum + "\n");
		}
		
		System.out.println(sb);
		br.close();
		
	}
}
