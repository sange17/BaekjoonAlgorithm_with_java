package Sorting;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting_01181 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String array[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = br.readLine();
		}
		
		Arrays.sort(array);
		
		for(int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
		br.close();
	}
}
