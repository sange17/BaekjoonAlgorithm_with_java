package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Greedy_01969 {
	public static void main(String[] arsg) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());	// DNA 개수
		int M = Integer.parseInt(st.nextToken());	// DNA 길이
		int max = 0;
		int HD = 0;		// Hamming Distance
		
		String[] dnaArray = new String[N];
		
		for(int i = 0; i < N; i++) {
			dnaArray[i] = br.readLine();
		}
		
		for(int i = 0; i < M; i++) {
			int a = 0;
			int t = 0;
			int g = 0;
			int c = 0;
			
			for(int j = 0; j < N; j++) {
				switch(dnaArray[j].charAt(i)) {
				case 'A' : a++; break;
				case 'T' : t++; break;
				case 'G' : g++; break;
				case 'C' : c++; break;
				}
			}
			
			max = Math.max(a > c ? a : c, g > c ? g : t);
			HD += (N - max);
			
			if(max == a) sb.append('A');
			else if(max == c) sb.append('C');
			else if(max == g) sb.append('G');
			else sb.append('T');
		}
		
		System.out.println(sb.toString());
		System.out.println(HD);
		br.close();
	}
}
