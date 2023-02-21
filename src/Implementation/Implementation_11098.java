package Implementation;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Implementation_11098 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int p = 0;
		int max = 0;
		String maxName = "";
		int price = 0;
		String name = "";
		
		for(int i = 0; i < n; i++) {
			
			p = Integer.parseInt(br.readLine());
			
			for(int j = 0; j < p; j++) {
				
				st = new StringTokenizer(br.readLine(), " ");
				
				price = Integer.parseInt(st.nextToken());
				name = st.nextToken();
				
				if(price > max) {
					max = price;
					maxName = name;
				}
			}
			
			sb.append(maxName + "\n");
			max = 0;
		}
		
		System.out.println(sb);
		br.close();
	}
}
