package DynamicProgramming;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class DynamicProgramming_09657 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n % 7 == 0 || n % 7 == 2) {
			System.out.println("CY");
		}else {
			System.out.println("SK");
		}
		
		br.close();
	}
}
