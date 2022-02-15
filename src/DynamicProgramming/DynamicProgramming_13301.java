package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgramming_13301 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long array[] = new long[n + 1];
		
		array[0] = 4;
		array[1] = 6;
		
		for(int i = 2; i < n; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		
		System.out.println(array[n-1]);
		br.close();
	}
}
