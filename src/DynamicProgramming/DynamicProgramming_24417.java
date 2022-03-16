package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class DynamicProgramming_24417 {
	static int n;
	static long[] dpArray;
	static int count_R = 0;
	static int count_D = 0;
	static int mod = 1000000007;
	
	public static int fib_R(int a) {
		if(a == 1 || a == 2) {
			count_R++;
			count_R %= mod;
			return 1;
		}else {
			return (fib_R(a-1) + fib_R(a-2));			
		}
	}
	
	public static long fib_D(int b) {
		dpArray = new long[n+1];
		
		dpArray[1] = dpArray[2] = 1;
		for(int i = 3; i <= b; i++) {
			count_D++;
			count_D %= mod;
			dpArray[i] = dpArray[i-1] + dpArray[i-2];
		}
		
		return dpArray[b];
	}
	
	public static void main(String[] arsg) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		fib_R(n);
		fib_D(n);
		
		System.out.println(count_R + " " + count_D);
		br.close();
	}
}
