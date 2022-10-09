package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_08979 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());		// 국가의 수
		int K = Integer.parseInt(st.nextToken());		// 등수를 알고 싶은 국가
		
		int no = 0;		// 국가  번호
		int[] gold = new int[N + 1];
		int[] silver = new int[N + 1];
		int[] bronze = new int[N + 1];
		int rank = 1;		// 등수
		
		// 메달을 배열에 국가 번호에 맞게 넣기
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			no = Integer.parseInt(st.nextToken());
			gold[no] = Integer.parseInt(st.nextToken());
			silver[no] = Integer.parseInt(st.nextToken());
			bronze[no] = Integer.parseInt(st.nextToken());
		}
		
		// 등수를 알고 싶은 국가보다 더 잘한 국가가 있다면 rank++
		for(int i = 1; i <= N; i++) {
			
			if(gold[i] > gold[K]) {
				rank++;
				continue;
			}
			else if(gold[i] == gold[K]){
				if(silver[i] > silver[K]) {
					rank++;
					continue;
				}
				else if(silver[i] == silver[K]){
					if(bronze[i] > bronze[K]) {
						rank++;
						continue;
					}
					else {
						continue;
					}
				}
			}
		}
		
		System.out.println(rank);
		br.close();
		
	}
}
