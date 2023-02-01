package Sorting.copy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting_01427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String array[] = br.readLine().split("");
		
		Arrays.sort(array);
		
		for(int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		
		System.out.print(sb.reverse());
		br.close();
	}
}
