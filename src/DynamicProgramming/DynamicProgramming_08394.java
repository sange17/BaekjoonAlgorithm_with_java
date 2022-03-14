package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class DynamicProgramming_08394 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[10000001];
		
		array[1] = 1;
		array[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			array[i] = array[i-1] % 10 + array[i-2] % 10;
		}
		
		System.out.println(array[n] % 10);
		br.close();
	}
}
