package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class DataStructure_04575 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		String[] strArray;
		int strLength = 0;
		String[] array = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		boolean flag;
		while(true) {
			
			str = br.readLine();
			strArray = str.split("");
			strLength = str.length();
			flag = false;
			
			if(str.equals("END")) break;
			
			for(int i = 0; i < 26; i++) {
				
				map.put(array[i], 0);
			}
			
			// 각 알파벳을 키로 하는 값에 +1을 더하기
			for(int i = 0; i < strLength; i++) {
				
				if(strArray[i].equals(" ")) {
					continue;
				}else {
					map.put(strArray[i], map.get(strArray[i]) + 1);
				}
			}
			
			// 값이 1 이상이면 flag를 true로 하여 문자열이 출력되지 않게 하기.
			for(int i = 0; i < 26; i++) {
				
				if(map.get(array[i]) > 1) {
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				
				sb.append(str + "\n");
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
