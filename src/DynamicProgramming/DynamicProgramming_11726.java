package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicProgramming_11726 {
	public static int tile(int a) {
		if(a == 1) return 1;
		if(a == 2) return 2;
		return (tile(a-1) + tile(a-2));
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(tile(n) % 10007);
	}
}
