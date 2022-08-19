package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Greedy_14720 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		boolean[] isCheck = new boolean[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = 0;
		int next = 0;
		for(int i = 0; i < N; i++) {
			int milkNum = Integer.parseInt(st.nextToken());
			
			if(milkNum == next && next == 0) {
				count++;
				next = 1;
				continue;
			}
			if(milkNum == next && next == 1) {
				count++;
				next = 2;
				continue;
			}
			if(milkNum == next && next == 2) {
				count++;
				next = 0;
				continue;
			}
		}
		System.out.println(count);
		br.close();
	}
}
