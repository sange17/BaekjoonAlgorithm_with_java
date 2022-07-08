package DataStructure;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;

public class DataStructure_01417 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());		// 후보 수를 담을 변수
		int dasom = Integer.parseInt(br.readLine());	// 다솜이 찍으려는 투표 수를 담을 변수
		int[] array = new int[N-1];						// 다솜이를 제외한 각 후보를 찍는 투표 수를 담을 배열
		
		// 다솜이를 제외한 나머지 후보를 찍는 표 수를 배열에 저장
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		int count = 0;		// 매수해야하는 사람의 최솟값이 담길 변수
		
		// 후보가 다솜이 자신 혼자인 경우
		if(N == 1) {
			System.out.println("0");
			return;
		}
		
		while(true) {
			// 오름차순 정렬하여 가장 투표가 많은 후보를 가장 큰 수의 인덱스로 보내기 위함
			Arrays.sort(array); 
			boolean flag = true;				// 다솜이보다 높은 투표수가 있는지 판단
			int last = array.length - 1;		// 가장 투표가 많은 후보의 인덱스
			
			// 후보중 가장 높은 투표를 받은 후보가 다솜이의 투표수 이상인 경우
			if(dasom <= array[array.length - 1]) {
				dasom++;			// 다솜이 투표 +1
				array[last]--;		// 가장 높은 투표를 받는 후보 -1
				count++;				// 한명 매수
				flag = false;		// 다솜이가 당선이 되지 못했으므로 false로 설정
			}
			
			// 다솜이보다 높은 투표수가 없는 경우
			if(flag)
				break;
		}
		System.out.println(count);
		br.close();
	}
}
