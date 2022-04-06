/*
2022 ICPC Sinchon Winter Algorithm Camp Contest Open


 A번 문제
package Test;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Test_ex {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			for(int j = 0; j < str.length() - 2; j++) {
				if(str.charAt(j) == 'f') {
					if(str.charAt(j+1) == 'o' && str.charAt(j+2) == 'r') {
						count++;
						j+=2;
					}
				}
			}
			
			for(int j = 0; j < str.length() - 4; j++) {
				if(str.charAt(j) == 'w') {
					if(str.charAt(j+1) == 'h'&& str.charAt(j+2) == 'i'&& str.charAt(j+3) == 'l' && str.charAt(j+4) == 'e') {
						count++;
						j+=4;
					}
				}
			}
			
			if(max < count) {
				max = count;
			}
			count = 0;
		}
		System.out.println(max);
		br.close();
	}
}

 B번 문제
package Test;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Test_ex {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] array = new int[n+1][4];
		boolean[] isChecked = new boolean[n+1]; 
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int num = Integer.parseInt(st.nextToken());
			int kor = Integer.parseInt(st.nextToken());
			int eng = Integer.parseInt(st.nextToken());
			int mth = Integer.parseInt(st.nextToken());
			int sci = Integer.parseInt(st.nextToken());
			
			array[num][0] = kor;
			array[num][1] = eng;
			array[num][2] = mth;
			array[num][3] = sci;
		}
		
		for(int i = 0; i < n + 1; i++) {
			isChecked[i] = false;
		}
		
		int max = -1;
		int idx = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < n; j++) {
				if(isChecked[j+1] == true) {
					continue;
				}else {
					if(max < array[j+1][i]) {
						idx = j + 1;
						max = array[j+1][i];
					}
					// 점수가 0일 때 처리해야함
				}
			}
			
			isChecked[idx] = true;
			sb.append(idx).append(" ");
			max = 0;
			idx = 0;
		}
		System.out.println(sb);
		br.close();
	}
}
*/

// 제1회 블롭컵
// B번
//package Test;
//
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.io.BufferedReader;
//import java.util.StringTokenizer;
//
//public class Test_ex {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int N = Integer.parseInt(st.nextToken());
//		int K = Integer.parseInt(st.nextToken());
//		int[] array = new int[N*2];
//		
//		
//		st = new StringTokenizer(br.readLine(), " ");
//		for(int i = 0; i < N; i++) {
//			String str = st.nextToken();
//			array[i] = Integer.parseInt(str);
//			array[i + N] = Integer.parseInt(str);
//		}
//		
//		int sum = 0;
//		for(int i = 0; i < K; i++) {
//			sum += array[i];
//		}
//		int max = sum;
//		
//		for(int i = 1; i <= N ; i++) {
//			
//			sum = sum - array[i-1] + array[i + K - 1];
//			
//			if(max < sum) {
//				max = sum;
//			}
//			
//		}
//		System.out.println(max);
//		br.close();
//	}
//}
//

// 2022 연세대학교 신학기맞이 프로그래밍 경진대회 Open Contest
// B번
//package Test;
//
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
//
//public class Test_ex{
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        
//        int T = Integer.parseInt(br.readLine());
//        int N, A, B, size, weight;
//        boolean check = false;
//        
//        StringTokenizer st;
//        
//        for(int i = 1; i <= T; i++) {
//        	sb.append("Material Management ").append(i).append("\n");
//        	
//        	N = Integer.parseInt(br.readLine());
//        	
//        	st = new StringTokenizer(br.readLine(), " ");
//        	
//        	A = Integer.parseInt(st.nextToken());
//        	B = Integer.parseInt(st.nextToken());
//        	
//        	for(int j = 0; j < N; j++) {
//        		st = new StringTokenizer(br.readLine(), " ");
//        		
//        		size = Integer.parseInt(st.nextToken());
//        		weight = Integer.parseInt(st.nextToken());
//        		
//        		if(size > A || weight > B) {
//        			check = true;
//        		}else {
//        			continue;
//        		}
//        	}
//        	
//        	if(check != true) {
//        		sb.append("Classification ---- End!").append("\n");
//        	}
//        }
//        
//        System.out.println(sb);
//        br.close();
//    }
//}

// 22 구데기 컵 2
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        StringBuilder sb = new StringBuilder();
//        
//        int n = sc.nextInt();
//        String[] array = {"0", "1", "10", "11", "100", "101", "110", "111", "1000", "1001"};
//        
//        for(int i = 0; i <= n; i++){
//            sb.append(array[i]);
//        }
//        
//        System.out.println(sb);
//    }
//}
package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test_ex{
  public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      String[] array = new String[16963];
      
      for(int i = 0; i < 16963; i++) {
    	  array[i] = br.readLine();
      }
      
      for(int i = 0; i < 16963; i++) {
    	  if(array[i].contains("CO")) {
    		  if(array[i].contains("W")
    			||array[i].contains("E")
    			||array[i].contains("R")
    			||array[i].contains("T")
    			||array[i].contains("U")
    			||array[i].contains("Y")
    			||array[i].contains("S")
    			||array[i].contains("G")
    			||array[i].contains("H")
    			||array[i].contains("N")
    			||array[i].contains("L")) {
    			  continue;
    		  }
    		  if(array[i].indexOf("C") == 0 && array[i].indexOf("O") == 1 && array[i].indexOf("A") == 4) {
    			  sb.append(array[i]).append("\n");
    		  }
    	  }
      }
      
      System.out.println(sb);
      br.close();
  }
}


// Test_ex