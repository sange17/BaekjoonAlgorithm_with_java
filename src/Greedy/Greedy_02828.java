package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Greedy_02828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int spaces = Integer.parseInt(st.nextToken());			// 칸의 개수
		int basketSize = Integer.parseInt(st.nextToken());		// 바구니 크기
		int apples = Integer.parseInt(br.readLine());			// 사과 개수
		
		int left = 1;				// 바구니 왼쪽 끝의 위치
		int right = basketSize;		// 바구니 오른쪽 끝의 위치
		int move = 0;				// 이동거리
		
		for(int i = 0; i < apples; i++) {
			int whereBasket = Integer.parseInt(br.readLine());
			
			// 바구니를 움직이지 않고 사과를 담는 경우
			if(left <= whereBasket && right >= whereBasket) {
				continue;
			}
			
			// 바구니를 왼쪽으로 움직여서 사과를 담는 경우
			if(left > whereBasket) {
				move += (left - whereBasket);
				right -= (left - whereBasket);
				left = whereBasket;
			}
			// 바구니를 오른쪽으로 움직여서 사과를 담는 경우
			else {
				move += (whereBasket - right);
				left += (whereBasket - right);
				right = whereBasket;
			}
		}
		
		System.out.println(move);
		br.close();
	}
}
