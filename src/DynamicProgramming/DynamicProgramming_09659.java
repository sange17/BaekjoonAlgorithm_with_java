package DynamicProgramming;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DynamicProgramming_09659 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		if(n % 2 == 0) {
			System.out.println("CY");
		}else {
			System.out.println("SK");
		}
		
		br.close();
	}
}
