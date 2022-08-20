package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Greedy_04796 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int caseCnt = 0;
		
		String str = br.readLine();
		
		while(!str.equals("0 0 0")) {
			caseCnt++;
			
			String[] array = str.split(" ");
			
			int L = Integer.parseInt(array[0]);
			int P = Integer.parseInt(array[1]);
			int V = Integer.parseInt(array[2]);
			
			int result = (V / P) * L + Math.min((V % P), L);
			
			sb.append("Case " + caseCnt + ": " + result + "\n");
			
			str = br.readLine();
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
