package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DataStructure_10815 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb  = new StringBuilder();
		
		// N개의 숫자를 키로 하여 HashMap에 저장
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> nMap = new HashMap<String, Integer>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			
			nMap.put(st.nextToken(), 1);
		}
		
		// M개의 숫자를 HashMap에 포함되어있는지 판단
		int M = Integer.parseInt(br.readLine());
		int[] nArray = new int[M];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			
			if(nMap.containsKey(st.nextToken())) {
				sb.append(1 + " ");
			}else {
				sb.append(0 + " ");
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
