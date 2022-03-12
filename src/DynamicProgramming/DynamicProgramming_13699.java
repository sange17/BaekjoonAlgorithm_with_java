package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class DynamicProgramming_13699 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long[] array = new long[36];
		
		array[0] = 1;
		array[1] = 1;
		
		for(int i = 2; i < array.length; i++) {
			for(int j = 0; j < i; j++) {
				array[i] += (array[j] * array[i-j-1]);				
			}
		}
		
		System.out.println(array[n]);
		br.close();
	}
}
