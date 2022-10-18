package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.StringTokenizer;

// HashMap을 이용해서 푼 문제
public class DataStructure_13414 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int K = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		// O(N)
		for(int i = 0; i < L; i++) {
			
			String studentNum = br.readLine(); 
			
			if(map.get(studentNum) == null) {
				map.put(studentNum, 1);
			}else {
				map.remove(studentNum);
				map.put(studentNum, 1);
			}
		}
		
		int i = 0;
        // 키 값들로 구성된 set을 만들어서 k만큼 출력
		Set<String> keySet = map.keySet();
		// O(N)
		for(String key : keySet) {			
			
			sb.append(key + "\n");
			
			i++;
			if(i == K) break;
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
