package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Greedy_19939 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int balls = Integer.parseInt(st.nextToken());	
		int gourds = Integer.parseInt(st.nextToken());
		
		/*
		 *  박에 공을 등차수열 형태로 분배
		 *      0
		 *     00
		 *    000
		 *   0000
		 *  00000
		 */
		
		for(int i = 1; i <= gourds; i++) {
			balls -= i;
			if(balls < 0) break;
		}
		
		// 분배하고 난 후에 남는 공들 처리
		if(balls >= 0) {
			/*
			 *  등차수열 분배 후 공이 남을 때 큰 수부터 채우는 경우(예 3개 남는 경우)
			 *  작은 수 부터 채우면 같은 개수가 담긴 박 존재함
			 *      0
			 *     00
			 *    000
			 *    000
			 *   0000
			 *  00000
			 *  
			 *  공이 가장 많은 박 6 - 공이 가장 적은 박 1개 = 5개(공 18, 박 5인 경우)
			 */
			if(balls % gourds > 0) {
				System.out.println(gourds);
			}
			/*
			 *  공이 등차수열 형태로 알맞게 분배된 경우
			 *      0
			 *     00
			 *    000
			 *   0000
			 *  00000
			 *  
			 *  공이 가장 많은 박 5 - 공이 가장 적은 박 1개 = 4개(공 15, 박 5인 경우)
			 */
			
			else {
				System.out.println(gourds - 1); 
			}
		}else {		// 등차수열 분배 중 공이 부족할 경우
			System.out.println(-1);
		}
		br.close();
	}
}
