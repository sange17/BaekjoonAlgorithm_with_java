package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_25628{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int buns = Integer.parseInt(st.nextToken());
        int patties = Integer.parseInt(st.nextToken());
        
        if(buns > 1 && patties > 0){
            if(buns / 2 >= patties){
                System.out.println(patties);
            }else{
                System.out.println(buns / 2);
            }
        }else{
            System.out.println(0);
        }
        
        br.close();
    }
}