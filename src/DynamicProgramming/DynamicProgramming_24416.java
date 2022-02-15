package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DynamicProgramming_24416 {
	static int count_rc = 0;
	static int count_dp = 0;
	static int [] array;
	
	public static int fib_rc(int a) {
		if(a == 1 || a == 2) {
			count_rc++;
			return 1;
		}
		else {
			return fib_rc(a-1) + fib_rc(a-2);
		}
	}
	
	public static int fib_dp(int b) {
		array = new int[b+1];
		array[1] = 1;
		array[2] = 1;
		
		for(int i = 3; i <= b; i++) {
			count_dp++;
			array[i] = array[i-1] + array[i-2];
		}
		return count_dp;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		fib_rc(n);
		fib_dp(n);
		
		System.out.println(count_rc + " " + count_dp);
		br.close();
	}
}
