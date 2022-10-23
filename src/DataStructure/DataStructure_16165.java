package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class DataStructure_16165 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());		// 걸그룹 수
		int M = Integer.parseInt(st.nextToken());		// 퀴즈 수
		
		HashMap<String, List<String>> girlGroupList = new HashMap<String, List<String>>();
		HashMap<String, String> girls = new HashMap<String, String>();
		
		for(int i = 0; i < N; i++) {
			String groupName = br.readLine();
			int number = Integer.parseInt(br.readLine());
			
			List<String> members = new ArrayList<String>();
			
			for(int j = 0; j < number; j++) {
				String memberName = br.readLine();
				
				members.add(memberName);
				girls.put(memberName, groupName);
			}
			
			Collections.sort(members);
			
			girlGroupList.put(groupName, members);
		}
		
		for(int i = 0; i < M; i++) {
			String quizStr = br.readLine();
			int quizType = Integer.parseInt(br.readLine());
			
			if(quizType == 1) {
				sb.append(girls.get(quizStr) + "\n");
			}
			
			if(quizType == 0) {
				
				for(String groupMember : girlGroupList.get(quizStr)) {
					sb.append(groupMember + "\n");
				}
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
