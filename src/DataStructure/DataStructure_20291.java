package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.io.IOException;
import java.util.StringTokenizer;

public class DataStructure_20291 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), ".");
			
			String fileName = st.nextToken();
			String fileType = st.nextToken();
			
			map.put(fileType, map.getOrDefault(fileType, 0) + 1);
		}
		
		List<String> keyList = new ArrayList<>(map.keySet());
        keyList.sort((s1, s2) -> s1.compareTo(s2));
        for (String key : keyList) {
            System.out.println(key + " " + map.get(key));
        }
		
	}
}

