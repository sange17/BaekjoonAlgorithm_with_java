package Implementation;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import java.util.StringTokenizer;
//
//public class Implementation_05218 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		StringBuilder sb = new StringBuilder();
//		
//		int T = Integer.parseInt(br.readLine());
//		
//		int length = 0;
//		String strA = "";
//		String strB = "";
//		for(int i = 0; i < T; i++) {
//			
//			st = new StringTokenizer(br.readLine(), " ");
//			
//			strA = st.nextToken();
//			strB = st.nextToken();
//			length = strA.length();
//			
//			sb.append("Distances: ");
//			for(int j = 0; j < length; j++) {
//				
//				if(strA.charAt(j) <= strB.charAt(j)) {
//					
//					sb.append(strB.charAt(j) - strA.charAt(j) + " ");
//				}else {
//					
//					sb.append((strB.charAt(j) + 26 - strA.charAt(j)) + " ");
//				}
//			}
//			
//			sb.append("\n");
//		}
//		
//		System.out.println(sb);
//		br.close();
//	}
//}

import java.util.ArrayList;
import java.util.Scanner;

public class Implementation_05218 {

	private static ArrayList<Integer> solveAlphabetDistance(String s1, String s2) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		/* ------------------- INSERT CODE HERE ---------------------*/


		// answer.add(x);	// add x to ArrayList<Integer> answer

		
		for(int j = 0; j < s1.length(); j++) {
			
			if(s1.charAt(j) <= s2.charAt(j)) {
				
				answer.add(s2.charAt(j) - s1.charAt(j));
			}else {
				
				answer.add(s2.charAt(j) + 26 - s1.charAt(j));
			}
		}
		
		
		
		
		
		

		/* -------------------- END OF INSERTION --------------------*/

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for(int i = 0; i < numCases; i++)
		{
			String s1 = sc.next();
			String s2 = sc.next();

			ArrayList<Integer> answer = solveAlphabetDistance(s1, s2);
			System.out.print("Distances: ");

			for(Integer d : answer) {
				System.out.print(d+" ");
			}
			System.out.println();

		}
	}
}
