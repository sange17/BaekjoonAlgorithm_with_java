package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_03062 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		StringBuilder resultSb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		String numStr = "";
		int num = 0;
		int sum = 0;
		int length = 0;
		String result;
		
		for(int i = 0; i < T; i++) {
			sum = 0;
			
			sb = new StringBuilder();	
			
			numStr = br.readLine();
			sb.append(numStr);
			num = Integer.parseInt(numStr);
			
			numStr = sb.reverse().toString();
			
			sum = num + Integer.parseInt(numStr);
			numStr = String.format("%s", sum);
			
			// 펠린드롬 알고리즘
			length = numStr.length();
			result = "YES";
			for(int j = 0; j < length / 2; j++) {
				
				if(numStr.charAt(j) != numStr.charAt(length - 1 - j)) {
					result = "NO";
					break;
				}
			}
			
			resultSb.append(result + "\n");
		}
		
		System.out.println(resultSb);
		br.close();
	}
}
