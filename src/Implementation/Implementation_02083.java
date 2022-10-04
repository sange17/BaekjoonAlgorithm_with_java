package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_02083 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String name = "";
		int age = 0;
		int weight = 0;
		
		while(true) {
			
			String input = br.readLine();
			
			st = new StringTokenizer(input, " ");
			
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());
			weight = Integer.parseInt(st.nextToken());
			
			if(name.equals("#"))
				break;
			else {
				if(age > 17 || weight >= 80) {
					sb.append(name + " Senior\n");
				}else {
					sb.append(name + " Junior\n");
				}
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
