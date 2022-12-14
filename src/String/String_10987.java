package String;

import java.util.HashMap;
import java.util.Scanner;

public class String_10987 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int strLength = str.length();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		map.put('a', 1);
		map.put('e', 1);
		map.put('i', 1);
		map.put('o', 1);
		map.put('u', 1);
		
		int count = 0;
		for(int i = 0; i < strLength; i++) {
			
			if(map.get(str.charAt(i)) != null) {
				
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
	}
}
