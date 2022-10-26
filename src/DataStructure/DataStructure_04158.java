package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

// N, M은 최대 백만, CD의 번호는 십억을 넘지 않는 양의 정수
public class DataStructure_04158 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int N = 0;
		int M = 0;
		int cdNum = 0;
		int count = 0;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			if(N == 0 && M == 0) break;
			
			// 그냥 배열은 공간을 십억으로 할당하면 OutOfMemoryError 발생!
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			cdNum = 0;
			for(int i = 0; i < N; i++) {
				cdNum = Integer.parseInt(br.readLine());
				
				map.put(cdNum, map.getOrDefault(cdNum, 1));
			}
			
			count = 0;
			for(int i = 0; i < M; i++) {
				cdNum = Integer.parseInt(br.readLine());
				
				if(map.get(cdNum) != null) {
					if(map.get(cdNum) == 1) count++;
				}
			}
			
			sb.append(count + "\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
