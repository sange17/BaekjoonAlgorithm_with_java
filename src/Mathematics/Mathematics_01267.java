package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_01267 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int time = 0;
		int ySum = 0;
		int mSum = 0;
		for(int i = 0; i < N; i++) {
			
			time = Integer.parseInt(st.nextToken());
			
			// 영식 요금제
			if(time / 30 == 0) {
				ySum += 10;
			}else if(time % 30 >= 0) {
				ySum += (time / 30 * 10) + 10;
			}
			
			// 민식 요금제
			if(time / 60 == 0) {
				mSum += 15;
			}else if(time % 60 >= 0) {
				mSum += (time / 60 * 15) + 15;
			}
		}
		
		if(ySum == mSum) {
			System.out.println("Y M " + ySum);
		}else if(ySum > mSum) {
			System.out.println("M " + mSum);
		}else if(ySum < mSum) {
			System.out.println("Y " + ySum);
		}
		
		br.close();
	}
}
