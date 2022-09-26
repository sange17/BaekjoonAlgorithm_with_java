package String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class String_25630{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        String sotteok = br.readLine();
        int count = 0;
        for(int i = 0; i < N / 2; i++){
            char ingredient = sotteok.charAt(i);
            
            if(ingredient != sotteok.charAt(N - 1- i)){
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}