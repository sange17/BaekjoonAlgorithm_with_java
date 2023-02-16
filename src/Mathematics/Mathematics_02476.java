package Mathematics;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Mathematics_02476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int dice1 = 0;
		int dice2 = 0;
		int dice3 = 0;
		int diceMax = 0;
		int rewardMax = 0;
		int reward = 0;
		
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			dice1 = Integer.parseInt(st.nextToken());
			dice2 = Integer.parseInt(st.nextToken());
			dice3 = Integer.parseInt(st.nextToken());
			
			diceMax = Math.max(dice1, Math.max(dice2, dice3));
			
			if(dice1 == dice2 && dice1 == dice3) {
				reward = 10000 + dice1 * 1000;
			}else if(dice1 == dice2 && dice1 != dice3) {
				reward = 1000 + dice1 * 100;
			}else if(dice2 == dice3 && dice1 != dice2) {
				reward = 1000 + dice2 * 100;
			}else if(dice1 == dice3 && dice2 != dice3) {
				reward = 1000 + dice3 * 100;
			}else {
				reward = diceMax * 100;
			}
			
			if(rewardMax < reward) {
				rewardMax = reward;
			}
			
			reward = 0;
		}
		System.out.println(rewardMax);
		br.close();
	}
}
