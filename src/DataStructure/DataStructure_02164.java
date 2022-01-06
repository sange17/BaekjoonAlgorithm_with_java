package DataStructure;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DataStructure_02164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int array[] = new int[n];
		int size = array.length;
		
		for(int i = n-1; i >= 0; i--) {
			array[i] = i+1;
			System.out.println(i+1);
		}
		
		for(int j = 0; j < n; j++) {
			
		}
	}
}
