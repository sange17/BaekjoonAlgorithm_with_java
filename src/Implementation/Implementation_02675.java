package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_02675 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		String arrayR [] = new String [2];
		String arrayS [];
		String str;
		String result [] = new String [n];
		
		for(int i = 0; i < n; i++) {
			String str1 = br.readLine();
			arrayR = str1.split(" ");
			arrayS = arrayR[1].split("");
			for(int j = 0; j < arrayR[1].length(); j++) {
				for(int k = 0; k < Integer.parseInt(arrayR[0]); k++) {
					sb = sb.append(arrayS[j]);
				}
			}
			str = sb.toString();
			result[i] = str;
			sb.delete(0, sb.length());
		}
		
		for(int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
	}
}
