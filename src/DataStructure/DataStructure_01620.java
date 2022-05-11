package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class DataStructure_01620 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		
		for(int i = 1; i <= N; i++) {
			String str = br.readLine();
			map1.put(i, str);
			map2.put(str, i);
		}
		
		for(int i = 0; i < M; i++) {
			String m = br.readLine();
			if(m.charAt(0) >= 49 && m.charAt(0) <= 57) {
				sb.append(map1.get(Integer.parseInt(m))).append("\n");
			}else {
				sb.append(map2.get(m)).append("\n");				
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
