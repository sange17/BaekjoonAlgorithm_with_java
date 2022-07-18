package DataStructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// HashMap에 단어가 있는지 판단한 후 개수를 세는 문제
public class DataStructure_14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < N; i++) {
			map.put(br.readLine(), 1);
		}
		
		int count = 0;
		for(int i = 0; i < M; i++) {
			if(map.containsKey(br.readLine())) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
