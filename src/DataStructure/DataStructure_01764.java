package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class DataStructure_01764 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		HashSet<String> hs = new HashSet<String>();
		ArrayList<String> list = new ArrayList<String>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for(int i = 0; i < N; i++) {
			hs.add(br.readLine());
		}
		
		for(int i = 0; i < M; i++) {
			String s = br.readLine();
			if(hs.contains(s)) {
				list.add(s);
			}
		}
		
		Collections.sort(list);
		sb.append(list.size()).append("\n");
		for(int i = 0; i < list.size(); i++) {
			sb.append(list.get(i)).append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}
