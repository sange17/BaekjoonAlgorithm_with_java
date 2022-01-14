package DataStructure;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DataStructure_17608 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int array[] = new int[n];
		int count = 0;
		int stick = 0;
		
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = n-1; i >= 0; i--) {
			if(array[i] > stick) {
				stick = array[i];
				count++;
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
