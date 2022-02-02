package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DataStructure_01935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String str = br.readLine();
		int array[] = new int[n];
		
		for(int i = 65; i < 65 + n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 0; i < str.length(); i++) {
			
		}
	}
}
