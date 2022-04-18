package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class DataStructure_09375 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			HashMap<String, Integer> hm = new HashMap<>();
			
			for(int j = 0; j < n; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				
				String name = st.nextToken();
				String type = st.nextToken();
				
				if(hm.containsKey(type)) {
					int cnt = hm.get(type);
					hm.put(type, cnt + 1);
				}else {
					hm.put(type, 1);
				}
			}
			
			int result = 1;
			for(int val : hm.values()) {
				result = result * (val + 1);
			}
			sb.append(result - 1).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
