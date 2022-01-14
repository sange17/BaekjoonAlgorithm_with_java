package Implementation;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Implementation_10808 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		char array[] = br.readLine().toCharArray();
		int result[] = new int[26];
		
		for(int i = 0; i < array.length; i++) {
			int n = array[i];
			result[n-97]++;
		}
		
		for(int j = 0; j < result.length; j++) {
			sb.append(result[j]).append(" ");
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb);
		br.close();
	}
}
