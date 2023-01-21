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
		
		String result = "";
		if(map.containsKey("STRAWBERRY")){
			
			if(map.get("STRAWBERRY") == 5) {
				result = "YES";
			}else {
				result = "NO";
			}
		}else if(map.containsKey("BANANA")) {
			
			if(map.get("BANANA") == 5) {
				result = "YES";
			}else {
				result = "NO";
			}
		}else if(map.containsKey("LIME")) {
			
			if(map.get("LIME") == 5) {
				result = "YES";
			}else {
				result = "NO";
			}
		}else if(map.containsKey("PLUM")){
			
			if(map.get("PLUM") == 5) {
				result = "YES";
			}else {
				result = "NO";
			}
		}
		
		
		br.close();
	}
}
