package Implementation;

import java.util.HashMap;
import java.util.Scanner;

public class Implementation_01331 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 한번 들린 곳인지 체크하기 위해 HashMap에 저장
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// 첫 위치 저장
		String route = sc.next();
		map.put(route, 1);
		
		char startColumn = route.charAt(0);		// 마지막 위치와 비교할 첫 위치 열 
		char startRow = route.charAt(1);		// 마지막 위치와 비교할 첫 위치 행
		char column = route.charAt(0);			// 첫 위치 열
		char row = route.charAt(1);				// 행 위치 행
		char curColumn;			// 현재 열
		char curRow;			// 현재 행
		int columnCheck = 0;	// 마지막 위치 확인
		int rowCheck = 0;		// 마지막 위치 확인
		int i = 0;
		for(i = 0; i < 35; i++) {
			
			// 첫 위치 다음 위치 값 저장
			route = sc.next();
			curColumn = route.charAt(0);
			curRow = route.charAt(1);
			
			// map에 저장된 위치가 있다면 반복문 종료
			if(map.get(route) == null) {
				map.put(route, 1);
			}else {
				break;
			}
			
			// 위치를 확인하여 마지막 위치가 첫 위치로 갈 수 있는지 확인
			columnCheck = Math.abs(startColumn - curColumn);
			rowCheck = Math.abs(startRow - curRow);
			if(i == 34) {
				if((columnCheck == 1 && rowCheck == 2) || (columnCheck == 2 && rowCheck == 1)) {
					column = curColumn;
					row = curRow;
					continue;
				}else {
					break;
				}
			}
			
			// 갈 수 있는 위치만 확인
			if(Math.abs(column - curColumn) == 1 && Math.abs(row - curRow) == 2) {
				column = curColumn;
				row = curRow;
				continue;
			}else if(Math.abs(column - curColumn) == 2 && Math.abs(row - curRow) == 1) {
				column = curColumn;
				row = curRow;
				continue;
			}else {
				break;
			}
		}
		
		if(i == 35) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		
		sc.close();
	}
}
