package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicProgramming_02748 {
	static long[] array;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		array = new long[n+1];
		
		for(int i = 0; i < n + 1; i++) {
			array[i] = -1;
		}
		
		array[0] = 0;
		array[1] = 1;
		System.out.println(fib(n));
		br.close();
	}
	
	public static long fib(int a) {
		if(array[a] == -1) {
			array[a] = fib(a-1) + fib(a-2);
		}
		return array[a];
	}
}
