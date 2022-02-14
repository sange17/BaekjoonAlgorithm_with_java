package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming_11727 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int array[] = new int[1001];
		
		array[0] = 0;
		array[1] = 1;
		array[2] = 3;
		
		for(int i = 3; i <= n; i++) {
			array[i] = (array[i-1] + array[i-2] * 2) % 10007;
		}
		
		System.out.println(array[n]);
	}
}
