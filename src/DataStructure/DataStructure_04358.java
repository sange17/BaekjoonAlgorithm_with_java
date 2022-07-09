package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class DataStructure_04358 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<String, Integer> trees = new HashMap<String, Integer>();
		int allTreeCount = 0;			// 총 나무의 수
		
		// 나무의 종류를 읽고 map에 존재하는 나무면 +1 아니면 초기값 0 설정하고 나무의 수 세기
		// 반복문 작성 순서를 주의해야한다.
		String treeName = br.readLine();
		while(true) {
			trees.put(treeName, trees.getOrDefault(treeName, 0) + 1);
			allTreeCount++;
			
			treeName = br.readLine();
			
			if(treeName == null || treeName.length() == 0) break;
		}
		
		// HashMap에 있는 키 값(나무이름)만 배열로 따로 빼서 알파벳 오름차순으로 정렬
		Object[] keyArray = trees.keySet().toArray();
		Arrays.sort(keyArray);
		
		// 키 값(나무 이름)이 가진 value로 result 계산하기
		StringBuilder sb = new StringBuilder();
		for(Object key : keyArray) {
			int value = trees.get((String)key);
			double result = (double)value * 100.0 / allTreeCount;
			sb.append(key + " " + String.format("%.4f", result) + "\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
