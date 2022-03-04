package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DynamicProgramming_09658 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n % 7 == 1 || n % 7 == 3) {
			System.out.println("CY");
		}else {
			System.out.println("SK");
		}
		
		br.close();
	}
}
