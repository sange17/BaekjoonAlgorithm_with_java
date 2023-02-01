package Sorting.copy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

// Arrays.sort 사용. 내부에 DualPivotQuicksort라는 메소드로 구현되어 있다.
// 시간복잡도: 평균-O(nlogn), 최악-O(n^2)
//public class Sorting_15688 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int N = Integer.parseInt(br.readLine());
//		int[] array = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			array[i] = Integer.parseInt(br.readLine());
//		}
//		
//		Arrays.sort(array);
//
//		for(int i : array) {
//			sb.append(i + "\n");
//		}
//		
//		System.out.println(sb);
//	}
//}


// 카운팅 정렬 사용. 시간복잡도 : O(N)
// 단점: 수의 범위가 크다면 메모리 낭비가 커진다.
//public class Sorting_15688 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int N = Integer.parseInt(br.readLine());
//		int[] array = new int[N];
//		int[] counting = new int[2000001];
//		int[] result = new int[N];
//		
//		for(int i = 0; i < N; i++) {
//			array[i] = Integer.parseInt(br.readLine());
//		}
//		
//		for(int i = 0; i < N; i++) {
//			counting[array[i] + 1000000]++;
//		}
//		
//		for(int i = 1; i < counting.length; i++) {
//			counting[i] += counting[i - 1];
//		}
//		
//		for(int i = N - 1; i >= 0; i--) {
//			int value = array[i];
//			counting[value]--;
//			result[counting[value]] = value;
//		}
//		
//		for(int i = 0; i < N; i++) {
//			System.out.println(result[i] + "\t");
//		}
//		System.out.println();
//		br.close();
//	}
//}

public class Sorting_15688 {
    private static final int LIMIT = 1000000;
    public static StringBuilder sb = new StringBuilder();
    
    public static void print(int n, int cnt) { 
    	while(cnt-->0) sb.append(n).append('\n'); 
    }

    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[LIMIT*2+1];
        
        while (N-->0) arr[Integer.parseInt(br.readLine())+LIMIT]++;
        
        for (int i = 0; i <= LIMIT*2; i++) print(i-LIMIT, arr[i]);
        
        System.out.print(sb);
    }
}