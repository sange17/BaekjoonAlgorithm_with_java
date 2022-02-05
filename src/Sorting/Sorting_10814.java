package Sorting;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sorting_10814 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder[] sbArray = new StringBuilder[201];
		
		for(int i = 0; i < sbArray.length; i++) {
			sbArray[i] = new StringBuilder();
		}
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			sbArray[age].append(age).append(' ').append(name).append("\n");
		}
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder val : sbArray) {
			sb.append(val);
		}
		
		System.out.print(sb);
		br.close();
	}
}
