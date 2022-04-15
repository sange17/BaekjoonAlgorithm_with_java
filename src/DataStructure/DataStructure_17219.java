package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DataStructure_17219 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, String> map = new HashMap<>();
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			String address = st.nextToken();
			String password = st.nextToken();
			map.put(address, password);
		}
		
		for(int i = 0; i < M; i++) {
			String str = br.readLine();
			sb.append(map.get(str)).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
