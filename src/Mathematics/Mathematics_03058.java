package Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mathematics_03058{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        int num = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            
            for(int j = 0; j < 7; j++){
                num = Integer.parseInt(st.nextToken());
                if(num % 2 == 0){
                    sum += num;
                    
                    if(min > num){
                        min = num;
                    }
                }
            }
            
            sb.append(sum + " " + min + "\n");
            sum = 0;
            min = Integer.MAX_VALUE;
        }
        
        System.out.println(sb);
        br.close();
    }
}