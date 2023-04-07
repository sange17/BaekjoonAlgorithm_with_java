package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_05026 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		String str = "";
		int sum = 0;
		int a = 0; 
		int b = 0;
		for(int i = 0; i < N; i++) {
			
			str = br.readLine();
			
			if(str.contains("+")) {
				
				st = new StringTokenizer(str, "+");
				
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				
				sum = a + b;	
				
				sb.append(sum + "\n");
			}
			else {
				
				sb.append("skipped\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
