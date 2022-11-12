package Implementation;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Implementation_04101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int firstNum = Integer.parseInt(st.nextToken());
			int secondNum = Integer.parseInt(st.nextToken());
			
			if(firstNum == 0 && secondNum == 0) break;
			
			if(firstNum > secondNum) {
				sb.append("Yes\n");
			}else {
				sb.append("No\n");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
