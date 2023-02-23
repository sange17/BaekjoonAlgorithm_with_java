package Implementation;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Implementation_05217 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		int n = 0;
		int m = 0;
		
		for(int i = 0; i < T; i++) {
			
			n = Integer.parseInt(br.readLine());
			
			sb.append("Pairs for " + n + ": ");
			for(int j = 1; j <= n; j++) {
				
				m = n - j;
				if(j < m) {
					
					if(j == 1) {
						
						sb.append(j + " " + (n - j));
					}else {
						
						sb.append(", " + j + " " + (n - j));
					}
				}				
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		br.close();
	}
}

// ??? 제출 기본 양식으로 되어 있었음
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//
//    private static ArrayList<Integer> solveSumPairs(int target) {
//    	
//    	ArrayList<Integer> answer = new ArrayList<Integer>();
//    	
//    	/* ------------------- INSERT CODE HERE ---------------------*/
//
//        
//    	// answer.add(x);		// adds x to ArrayList<Integer> answer
//		int m = 0;
//
//		for(int j = 1; j <= target; j++) {
//		
//    		m = target - j;
//    		if(j < m) {
//
//    			   answer.add(j);
//    			   answer.add(m);
//    		}				
//		}
//
//        /* -------------------- END OF INSERTION --------------------*/
//    	
//    	return answer;
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int numCases = sc.nextInt();
//
//        for(int n = 0; n < numCases; n++)
//        {
//            int target = sc.nextInt();
//            
//            ArrayList<Integer> answer = solveSumPairs(target);
//            
//            System.out.print("Pairs for "+target+": ");
//            
//            for (int i = 0; i<answer.size(); i+=2 ) {
//            	if (i>0) 
//            		System.out.print(", ");
//            	System.out.print(answer.get(i) + " " + answer.get(i+1));
//            }
//            System.out.println();
//        }
//    }
//}

