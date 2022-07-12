package DataStructure;

import java.util.HashMap;
import java.util.Scanner;

public class DataStructure_11652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		HashMap<Long, Integer> map = new HashMap<>();
		
		int maxNumCnt = 0;
		long smallerOfSame = 0;
		for(int i = 0; i < N; i++) {
			Long n = sc.nextLong();
			
			map.put(n, map.getOrDefault(n, 0) + 1);
			
			if(map.get(n) > maxNumCnt) {
				maxNumCnt = map.get(n);
				smallerOfSame = n;
			}else if(map.get(n) == maxNumCnt) {
				smallerOfSame = Math.min(smallerOfSame, n);
			}
		}
		
		System.out.println(smallerOfSame);
	}
}
