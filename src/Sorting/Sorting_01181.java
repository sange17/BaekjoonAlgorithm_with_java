package Sorting;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Sorting_01181 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		String array[] = new String[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = br.readLine();
		}
		
		Arrays.sort(array, new Comparator<String>(){
			public int compare(String str1, String str2) {
				if(str1.length() == str2.length()) {
					return str1.compareTo(str2);
				}else {
					return str1.length() - str2.length();
				}
			}
		});
		
		sb.append(array[0]).append('\n');
		for(int i = 1; i < n; i++) {
			if(!array[i].equals(array[i - 1])){
				sb.append(array[i]).append("\n");
			}
		}
		
		System.out.print(sb);
		br.close();
	}
}
