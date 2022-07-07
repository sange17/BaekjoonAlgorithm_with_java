package DataStructure;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DataStructure_01302 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int N = sc.nextInt();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String str = new String();
		for(int i = 0; i < N; i++) {
			str = sc.next();
			if(map.containsKey(str)) {
				map.replace(str, map.get(str) + 1);
			}else {
				map.put(str, 1);
			}
		}
		
		int max = 0;
		for(String s : map.keySet()) {
			max = Math.max(max, map.get(s));
		}
		
		ArrayList<String> al = new ArrayList<String>(map.keySet());
		Collections.sort(al);
		for(String s : al) {
			if(map.get(s) == max) {
				System.out.println(s);
				break;
			}
		}
	}
}
