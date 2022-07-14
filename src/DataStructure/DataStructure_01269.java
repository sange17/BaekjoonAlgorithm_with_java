package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

/*
 * 대칭 차집합 백준 01269
 */
public class DataStructure_01269 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int nACnt = Integer.parseInt(st.nextToken());
		int nBCnt = Integer.parseInt(st.nextToken());
		
		TreeSet<Integer> nASet = new TreeSet<Integer>();
		TreeSet<Integer> nBSet = new TreeSet<Integer>();
		TreeSet<Integer> tempSet = new TreeSet<Integer>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < nACnt; i++) {
			int a = Integer.parseInt(st.nextToken());
			
			nASet.add(a);
			tempSet.add(a);
		}

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < nBCnt; i++) {
			int b = Integer.parseInt(st.nextToken());
			
			nBSet.add(b);
		}
		
		Iterator<Integer> iterB = nBSet.iterator();
		while(iterB.hasNext()) {
			int nBCntValue = iterB.next();
			
			if(nASet.contains(nBCntValue)) nASet.remove(nBCntValue);
		}
		
		Iterator<Integer> iterA = tempSet.iterator();
		while(iterA.hasNext()) {
			int nACntValue = iterA.next();
			
			if(nBSet.contains(nACntValue)) nBSet.remove(nACntValue);
		}
		
		// 결과 출력
		System.out.println(nASet.size() + nBSet.size());
		br.close();
	}
}