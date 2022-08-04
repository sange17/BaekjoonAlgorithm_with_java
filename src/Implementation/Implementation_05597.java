package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Implementation_05597 {
   public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      boolean[] array = new boolean[31];
      
      for(int i = 0; i < 28; i++) {
         int idx = Integer.parseInt(br.readLine());
         
         array[idx] = true;
      }
      
      for(int i = 1; i <= 30; i++) {
         if(array[i] == false) {
            System.out.println(i);
         }
      }
      
      br.close();
   }
}