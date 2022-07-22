package Greedy;

import java.util.Scanner;

//문자열 속 연속되는 0과 1이 있을 경우 첫 문자만 세서 해당 숫자에 count + 1 처리하고
//빈도 수가 작거나 같은 경우만 출력하는 문제
public class Greedy_01439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int oneCount = 0;
		int zeroCount = 0;
		boolean check = false;		// 0이 false 1이 true
		
		if(str.charAt(0) == '0') {
			check = false;
		}else {
			check = true;
		}
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '1') {
				if(check == true) {
					oneCount++;
					check = false;										
				}
				else
					continue;
			}else if(str.charAt(i) == '0') {
				if(check == false) {
					zeroCount++;
					check = true;					
				}
				else
					continue;
			}
			
			System.out.println(oneCount + " " + zeroCount + " " + check);
		}
		
		System.out.println(Math.min(oneCount, zeroCount));
		sc.close();
	}
}
