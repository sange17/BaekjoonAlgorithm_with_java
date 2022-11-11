package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class DataStructure_20920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String str = "";
		int strLength = 0;
		for(int i = 0; i < N; i++) {
			str = br.readLine();
			strLength = str.length();
			
			if(strLength < M) continue;
			
			map.put(str, map.getOrDefault(str, 0) + 1);
		}
		
		System.out.println(map);
	}
}
