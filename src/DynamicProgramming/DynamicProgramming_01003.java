package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DynamicProgramming_01003 {
	public static int count0 = 0;
	public static int count1 = 0;
	
	public static int fib(int a) {
		if(a == 0) {
			count0++;
			return 0;
		}
		if(a == 1) {
			count1++;
			return 1;
		}
		return (fib(a-1) + fib(a-2));
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			
			fib(num);
			
			sb.append(count0).append(" ").append(count1).append("\n");
			count0 = count1 = 0;
		}
		System.out.println(sb);
		br.close();
	}
}
