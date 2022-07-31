package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DataStructure_13417 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		// TestCase 반복
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			
			st = new StringTokenizer(br.readLine(), " ");
			
			Deque<String> deque = new LinkedList<String>();
			deque.add(st.nextToken());
			for(int j = 0; j < N-1; j++) {
				String stringCard = st.nextToken();
				char charCard = stringCard.charAt(0);		// 뽑은 카드
				
				// 뽑은 카드를 가장 왼쪽 카드의 알파벳과 아스키 코드값으로 비교해서 
				// 같거나 작으면 큐에 addFirst(카드 순서의 왼쪽에 두고)하고 아니면 addLast(카드 순서의 오른쪽에)한다.
				if(deque.peek().charAt(0) >= charCard) {
					deque.addFirst(stringCard);
				}else {
					deque.addLast(stringCard);
				}
			}
			
			for(String resultCard : deque) {
				sb.append(resultCard);
			}
			
			System.out.println(sb.toString());
		}
	}
}
