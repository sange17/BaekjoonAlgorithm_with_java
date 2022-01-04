package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicProgramming_10870 {
	public static int fib(int a) {
		if(a == 0) return 0;
		if(a == 1) return 1;
		return (fib(a-1) + fib(a-2));
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(fib(n));
	}
}
