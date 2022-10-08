package Implementation;

import java.util.Scanner;

// O(N)
public class Implementation_01475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		String str = sc.nextLine();
		int[] numCountArray = new int[10];
		
		// 번호가 등장시 index에 1추가
		int idx = 0;
		for(int i = 0; i < str.length(); i++) {
			idx = str.charAt(i) - '0';
			numCountArray[idx]++;
		}
		
		// 6, 9 등장시 둘을 합하고 나눈값이 6과 9가 속한 세트 수로
		// 각각 따로 인덱스에 넣어준다.
		int set69 = numCountArray[6] + numCountArray[9];
		if(set69 % 2 == 0) {
			numCountArray[6] = set69 / 2;
			numCountArray[9] = set69 / 2;
		}else {
			numCountArray[6] = set69 / 2 + 1;
			numCountArray[9] = set69 / 2 + 1;
		}
		
		// 등장 횟수가 곧 세트수가 되므로 max를 구한다.
		int max = 0;
		for(int i = 0; i < numCountArray.length; i++) {
			if(max < numCountArray[i]) {
				max = numCountArray[i];
			}
		}
		
		System.out.println(max);
		sc.close();
	}
}
