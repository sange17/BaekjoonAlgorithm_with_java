package DataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DataStructure_10546 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int N = Integer.parseInt(sc.nextLine());
      
      Map<String, Integer> map = new HashMap<String, Integer>();
      
      for(int i = 0; i < N; i++) {
         String name = sc.nextLine();
         if(map.get(name) == null) {
        	 map.put(name, 1);
         }else {
        	 map.put(name, map.get(name) + 1);
         }
      }
      
      // 완주하지 못한 사람과 동명이인의 이름은 1이 된다.
      for(int i = 0; i < N - 1; i++) {
         String finish = sc.nextLine();
         
         map.put(finish, map.get(finish) - 1);
      }
      
      for(String key : map.keySet()) {
    	  if(map.get(key) != 0) {
    		  System.out.println(key);
    		  break;
    	  }
      }
   }
}