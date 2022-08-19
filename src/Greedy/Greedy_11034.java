package Greedy;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Greedy_11034 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		try {
			while((str = br.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(str, " ");
				
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				int C = Integer.parseInt(st.nextToken());
				int jump = 0;
				
				if(B - A == 1 && C - B == 1) {
					sb.append(jump + "\n");
					continue;
				}
				
				if(B - A < C - B) {
					jump = C - B - 1;
					sb.append(jump + "\n");
					continue;
				}
				
				if(B - A > C - B) {
					jump = B - A - 1;
					sb.append(jump + "\n");
					continue;
				}
				
				if(B - A == C - B) {
					jump = C - B - 1;
					sb.append(jump + "\n");
					continue;
				}
				System.out.println(sb.toString());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(sb.toString());
		br.close();
		
	}
}
