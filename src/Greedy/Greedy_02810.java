package Greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Greedy_02810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());	// 좌석 수
		int count = 1;	// 컵 홀더 수(제일 오른쪽 좌석만 오른쪽 컵 홀더를 사용한다고 가정하에 미리 +1을 해둠)
		
		String seats = br.readLine();		// 좌석 문자열
		for(int i = 0; i < N; i++) {
			char seat = seats.charAt(i);	// 좌석
			
			if(seat == 'S') {			// 솔로 좌석
				count++;		// 사용 가능한 컵 홀더 개수 증가
			}else if(seat == 'L') {		// 커플 좌석
				i++;		// LL인 경우 첫 L만 보고 다음 나올 L을 패스하기 위해 사용
				count++;		// 사용 가능한 컵 홀더 개수 증가
			}
		}
		
		if(count > N) {		// 사용 가능한 컵 홀더 수 > 좌석 수
			System.out.println(N);
		}else {
			System.out.println(count);
		}
	}
}
