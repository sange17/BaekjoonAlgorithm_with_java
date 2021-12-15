package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy_02839 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int result = 0;

		if(n%3 < 3 && n%3 > 0) {
			result = -1;
		}
		
		for(int i = n/5; i >= 0; i--) {
			if(n % 5 == 0) {			// 5의 배수 처리
				result = n/5;
				break;
			}
			
			if((n-5*i)%3==0) {
				result = i + (n-5*i)/3;
				break;
			}
		}
		
		System.out.println(result);
	}
}
