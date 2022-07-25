package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DataStructure_02605 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		LinkedList<Integer> numList = new LinkedList<Integer>();
		
		for(int i = 1; i <= N; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			numList.add(num, i);
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(numList.pollLast() + " ");
		}
		
		System.out.println(sb.toString());
	}
}
