package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class DataStructure_09933 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] array1 = new String[N];
		String[] array2 = new String[N];
		
		String str = "";
		int strLength = 0;
		for(int i = 0; i < N; i++) {
			StringBuilder sb = new StringBuilder();
			str = br.readLine();
			strLength = str.length();
			
			array1[i] = str;
			
			for(int j = 1; j <= strLength; j++) {
				
				sb.append(str.charAt(strLength - j));
			}
			
			array2[i] = sb.toString();
			
		}
		
		String result = "";
		boolean isCheck = false;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(array2[i].equals(array1[j]) && isCheck == false) {
					
					isCheck = true;
					
					result = array2[i];
					System.out.println(result.length() + " " + result.charAt(result.length() / 2));
					
					br.close();
				}
			}
		}
		
		
	}
}
