package Greedy;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Greedy_02720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int penny = 0;
		int total = 0;
		
		for(int i = 0; i < T; i++) {
			total = Integer.parseInt(br.readLine());
			
			quarter = total / 25;
			total %= 25;
			dime = total / 10;
			total %= 10;
			nickel = total / 5;
			total %= 5;
			penny = total / 1;
			total %= 1;
			
			if(total == 0) {
				sb.append(quarter).append(" ").append(dime).append(" ").append(nickel).append(" ").append(penny).append("\n");
			}
			
		}
		System.out.println(sb);
		br.close();
	}
}
