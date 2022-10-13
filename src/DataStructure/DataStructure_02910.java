import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// HashMap과 LinkedHashMap의 차이점을 몰라서 헤맨 문제
// HashMap은 put연산 후 출력하면 순서가 입력 순서와 다르게 뒤바뀌어 나오고
// LinkedHashMap은 put연수 후 출력하면 순서가 입력한 순서대로 나온다.
public class DataStructure_02910 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			
			int num = Integer.parseInt(st.nextToken());
			
            // map에 수를 담는데 default값이면 0으로 초기화하고 +1
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
        // 키 리스트 생성
		List<Integer> keySet = new ArrayList<Integer>(map.keySet());
		
		// value 값으로 내림차순 정렬
		keySet.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return map.get(o2).compareTo(map.get(o1));
			}
		});
		
        // 내림차순 정렬된 keySet의 key로 map에서 value를 불러와서 반복하며 key를 출력한다.
		for(Integer key : keySet) {
			for(int i = 0; i < map.get(key); i++) {
				sb.append(key + " ");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
