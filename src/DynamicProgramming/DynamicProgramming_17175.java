package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class DynamicProgramming_17175 {
	static int mod = 1000000007;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[51];
		array[0] = array[1] =  1;
		
		for(int i = 2; i <= n; i++) {
			array[i] = (array[i-1] + array[i-2] + 1) % 1000000007;
		}
		
		System.out.println(array[n] % 1000000007);
		br.close();
	}
	
}
