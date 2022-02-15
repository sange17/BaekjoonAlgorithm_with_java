package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicProgramming_09655 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n % 2 == 1) System.out.println("SK");
		else System.out.println("CY");
		
		br.close();
	}
}
