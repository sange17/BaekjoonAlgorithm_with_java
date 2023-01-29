package Implementation;

import java.util.Scanner;

public class Implementation_01371 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		String str = "";
		int strLength = 0;
		int[] array = new int[26];
		int max = 0;
		int indexNum = 0;
		
		while(sc.hasNextLine()) {
			
			str = sc.nextLine();
			strLength = str.length();
			
			for(int i = 0; i < strLength; i++) {
				
				if(str.charAt(i) == ' ') {
					continue;
				}
				
				indexNum = str.charAt(i) - 97;
				array[indexNum]++;
				
				if(max < array[indexNum]) {
					
					max = array[indexNum];
				}
			}
		}
		for(int i = 0; i < 26; i++) {
			
			if(max == 0) continue;
			
			if(array[i] == max) {
				
				sb.append((char)('a' + i));
			}
		}			
		
		System.out.println(sb);
		sc.close();
	}
}
