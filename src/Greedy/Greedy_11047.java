package Greedy;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Greedy_11047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str , " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int [] array = new int [n];
		
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int result = 0;
		
		for(int i = n-1; i >=0; i--) {
			int remain = 0;
			
			if(k / array[i] != 0) {
				result += k / array[i];
				k -= k / array[i] * array[i];
			}
		}
		
		System.out.println(result);
	}
}
