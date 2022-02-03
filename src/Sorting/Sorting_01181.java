package Sorting;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting_01181 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		String array[] = new String[n];
		String tempArray[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = br.readLine();
		}
		
		Arrays.sort(array);
		
		String temp = "";
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(array[i].length() > array[j].length()) {
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
		int m = 0;
		tempArray[0] = array[0];
		for(int i = 0; i < n - 1; i++) {
			if(tempArray[m] == array[i + 1]) {
				continue;
			}else {
				m++;
				tempArray[m] = array[i+1];
			}
		}
		
		br.close();
	}
}
