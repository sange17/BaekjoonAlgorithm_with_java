package DataStructure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.io.IOException;


// LinkedList를 사용하여 풀어보았지만 remove연산시 n의 시간복잡도가 존재하므로
// for문의 n과 remove연산의 n 총 n^2의 시간복잡도를 보였기 때문에 시간 초과가 발생하였다.
public class DataStructure_07785 {
   
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      
      HashSet<String> peopleSet = new HashSet<String>();
      
      StringTokenizer st;
      for(int i = 0; i < N; i++) {
         st = new StringTokenizer(br.readLine(), " ");
         
         String name = st.nextToken();
         String state = st.nextToken();
         
         if(state.equals("enter")) {
        	 peopleSet.add(name);
         }else if(state.equals("leave")){
        	 peopleSet.remove(name);
         }
      }
      
      ArrayList<String> list = new ArrayList<String>(peopleSet);
      Collections.sort(list);

      StringBuilder sb = new StringBuilder();
      for(int i = list.size()-1; i >= 0; i--) {
    	  sb.append(list.get(i) + "\n");
      }
      
      System.out.println(sb);
   }
}
