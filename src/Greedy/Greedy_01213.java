package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy_01213 {
	static String str;
	static char[] arrayA, arrayB;
	static int[] charCountArray;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		str = sc.nextLine();					// 입력받은 문자열
		arrayA = new char[str.length()];		// 문자열을 문자배열로 생성
		arrayB = new char[str.length()];		// 펠린드롬을 담을 배열
		charCountArray = new int[26];			// 알파벳 26자 중 알파벳 등장 횟수를 담을 배열
		
		// O(N)
		for(int i = 0; i < str.length(); i++) {
			arrayA[i] = str.charAt(i);
			charCountArray[arrayA[i] - 65]++;			// 해당 번호 알파벳 개수 증가
		}
		
		int oddCount = 0;		// 등장 횟수가 홀수인 알파벳의 개수
		int oddIndex = 0;		// 등장 횟수가 홀수인 알파벳의 인덱스
		
		for(int i = 0; i < 26; i++) {
			if(charCountArray[i] % 2 != 0) {
				oddCount++;
				oddIndex = i;		// 알파벳 인덱스 0~25 + 아스키 코드 알파벳 65~90, 아스키 코드를 이용한 알파벳 생성을 위해 필요
			}
		}
		
		Arrays.sort(arrayA);
		
		int left = 0;
		int right = str.length() - 1;
		
		// 0이면 홀수 개인 알파벳이 없음, 1이면 홀수 개인 알파벳 하나, 2이상 이면 홀수개인 알파벳 여러 개
		if(oddCount > 1) {
			System.out.println("I'm Sorry Hansoo");
			System.exit(0);
			
		}else if(oddCount == 1) {
			arrayB[str.length() / 2] = (char) (oddIndex + 65);		// 홀수 개인 알파벳 중 하나를 펠린드롬 가운데에 배치
			
			boolean isCheck = false;
			for(int i = 0; i < str.length(); i++) {
				if(left >= right) break;
				
				// 홀수 개인 알파벳인 경우 한번만 무시하고 넘어가기
				if(arrayA[i] == (char) (oddIndex + 65) && !isCheck) {
					isCheck = true;
					continue;
				}
				
				// 펠린드롬 생성
				if(i % 2 == 0) {
					arrayB[left] = arrayA[i];
					left++;
				}else {
					arrayB[right] = arrayA[i];
					right--;
				}
			}
			
		}else {
			for(int i = 1; i <= str.length(); i++) {
				if(left > right) break;
				
				// 펠린드롬 생성
				if(i % 2 == 0) {
					arrayB[right] = arrayA[i-1];
					right--;
				}else {
					arrayB[left] = arrayA[i-1];
					left++;
				}
			}
			
		}
		
		for(int i = 0; i < str.length(); i++) {
			sb.append(arrayB[i]);
		}
		
		System.out.println(sb.toString());
		sc.close();
	}
}
