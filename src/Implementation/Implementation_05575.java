//package Implementation;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Implementation_05575 {
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = 0; i < 3; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			
//			int h1 = Integer.parseInt(st.nextToken());
//			int m1 = Integer.parseInt(st.nextToken());
//			int s1 = Integer.parseInt(st.nextToken());
//			int h2 = Integer.parseInt(st.nextToken());
//			int m2 = Integer.parseInt(st.nextToken());
//			int s2 = Integer.parseInt(st.nextToken());
//			
//			if(s1 > s2) {
//				s1 = 60 + s2 - s1;
//				m2 -= 1;
//			}else {
//				s1 = s2 - s1;
//			}
//			
//			if(m1 > m2) {
//				m1 = 60 + m2 - m1;
//				h2 -= 1;
//			}else {
//				m1 = m2 - m1;
//			}
//			
//			h1 = h2 - h1;
//			
//			sb.append(h1 + " " + m1 + " " + s1).append("\n");
//		}
//		System.out.println(sb);
//		br.close();
//	}
//}

package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implementation_05575 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 3; i++) {
			String[] str = br.readLine().split(" ");
			
			int h1 = Integer.parseInt(str[0]);
			int m1 = Integer.parseInt(str[1]);
			int s1 = Integer.parseInt(str[2]);
			int h2 = Integer.parseInt(str[3]);
			int m2 = Integer.parseInt(str[4]);
			int s2 = Integer.parseInt(str[5]);
						
			if(s1 > s2) {
				s1 = 60 + s2 - s1;
				m2 -= 1;
			}else {
				s1 = s2 - s1;
			}
			
			if(m1 > m2) {
				m1 = 60 + m2 - m1;
				h2 -= 1;
			}else {
				m1 = m2 - m1;
			}
			
			h1 = h2 - h1;
			
			sb.append(h1 + " " + m1 + " " + s1).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}

