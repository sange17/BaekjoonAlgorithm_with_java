package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DataStructure_02776 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < testCase; i++) {
			int N = Integer.parseInt(br.readLine());
			
			HashMap<String, Integer> book = new HashMap<String, Integer>();
			
			String num = "";
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				num = st.nextToken();
				
				book.put(num, book.getOrDefault(num, 0) + 1);
			}
			
			
			int M = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			for(int k = 0; k < M; k++) {
				num = st.nextToken();
				
				if(book.containsKey(num)) sb.append(1 + "\n");
				else sb.append(0 + "\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}
