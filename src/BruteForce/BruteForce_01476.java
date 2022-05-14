package BruteForce;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BruteForce_01476 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year, E, S, M, e, s, m;
		e = s = m = 1;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		E = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		year = 1;
		while(true) {
			if(e == E && s == S && m == M) break;
			
			e++;
			s++;
			m++;
			
			if(e == 16) e = 1;
			if(s == 29) s = 1;
			if(m == 20) m = 1;
			year++;
		}
		System.out.println(year);
		br.close();
	}
}
