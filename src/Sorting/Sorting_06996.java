package Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sorting_06996 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		char[] array1;
		char[] array2;
		for(int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			array1 = st.nextToken().toCharArray();
			array2 = st.nextToken().toCharArray();
			
			Arrays.sort(array1);
			Arrays.sort(array2);
		}
	}
}
