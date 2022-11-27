package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

//시간을 분을 기준으로 계산하여 푼 문제.
//오전에 참가한 사람이 없을 경우 map에서 없는 키를 찾으려해
//NullPointException 오류가 발생해서 틀렸다.
public class DataStructure_19583 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String[] startMeeting = st.nextToken().split(":");
		int startMeetingMinuteTime = Integer.parseInt(startMeeting[0]) * 60 + Integer.parseInt(startMeeting[1]);
		
		String[] endMeeting = st.nextToken().split(":");
		int endMeetingMinuteTime = Integer.parseInt(endMeeting[0]) * 60 + Integer.parseInt(endMeeting[1]);
		
		String[] endStreaming = st.nextToken().split(":");
		int endStreamingMinuteTime = Integer.parseInt(endStreaming[0]) * 60 + Integer.parseInt(endStreaming[1]);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String str;
		String[] chattingTime;
		String nickname;
		int count = 0;
		while(true) {
			
			str = br.readLine();
			
			if(str == null || str.equals("")) {
				break;
			}
			
			st = new StringTokenizer(str, " ");
			
			chattingTime = st.nextToken().split(":");
			int chattingMinuteTime = Integer.parseInt(chattingTime[0]) * 60 + Integer.parseInt(chattingTime[1]);

			nickname = st.nextToken();
			
			// 개강총회 시작 전 출석 체크
			if(startMeetingMinuteTime >= chattingMinuteTime) {
				map.put(nickname, 1);
			}
			
			// 개강총회 후 출석 체크
			if((endMeetingMinuteTime <= chattingMinuteTime) && (endStreamingMinuteTime >= chattingMinuteTime)) {
				
				if((map.get(nickname) != null) && (map.get(nickname) == 1) && (map.get(nickname) != 2)) {
					map.put(nickname, 2);
					count++;
				}
			}
		}
		
		System.out.println(count);
		br.close();
	}
}
