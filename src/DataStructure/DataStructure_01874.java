package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DataStructure_01874 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int numArray[] = new int[n];
		int stack[] = new int[n];
		int size = 0;
		
		for(int i = 0; i < n; i++) {
			numArray[i] = Integer.parseInt(br.readLine());
			sb.append(numArray[i]).append("\n");
		}
		
		for(int i = 0; i < n; i++) {
			
		}
		
		sb.setLength(sb.length()-1);
		System.out.println(sb.reverse());
	}
}
