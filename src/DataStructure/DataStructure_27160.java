package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DataStructure_27160 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		
		StringTokenizer st;
		
		String S = "";
		int X = 0;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			S = st.nextToken();
			X = Integer.parseInt(st.nextToken());
			
			map.put(S, map.getOrDefault(S, 0) + X);
		}
		
		if(map.containsValue(5)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		
		br.close();
	}
}
