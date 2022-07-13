package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class DataStructure_01822 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nACnt = Integer.parseInt(st.nextToken());
		int nBCnt = Integer.parseInt(st.nextToken());
		
		TreeSet<Integer> nSet = new TreeSet<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < nACnt; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			nSet.add(a);
		}
		
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < nBCnt; i++) {
			int b = Integer.parseInt(st.nextToken());
			
			if(nSet.contains(b)) nSet.remove(b);
		}
		
		
		// 결과 출력
		System.out.println(nSet.size());
		
		StringBuilder sb = new StringBuilder();
		for(Integer integer : nSet) {
			sb.append(integer + " ");
		}
		
		System.out.println(sb);
	}
}
