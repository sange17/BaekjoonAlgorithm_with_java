package Implementation;

import java.util.HashMap;
import java.util.Scanner;

public class Implementation_02789 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String word = "CAMBRIDGE";
		int wordLength = word.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < wordLength; i++) {
			map.put(word.charAt(i), 1);
		}
		
		String str = sc.next();
		int strLength = str.length();
		
		for(int i = 0; i < strLength; i++) {
			
			if(!map.containsKey(str.charAt(i))) {
				
				sb.append(str.charAt(i));
			}
		}
		
		System.out.println(sb);
		sc.close();
	}
}
