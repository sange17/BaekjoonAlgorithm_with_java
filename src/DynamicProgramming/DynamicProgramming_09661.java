package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DynamicProgramming_09661 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		if(n % 5 == 1 || n % 5 == 3 || n % 5 == 4) {
			System.out.println("SK");
		}else {
			System.out.println("CY");
		}
		
		br.close();
	}
}
