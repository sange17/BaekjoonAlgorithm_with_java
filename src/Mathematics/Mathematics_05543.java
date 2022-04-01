package Mathematics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Mathematics_05543 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int large = Integer.parseInt(br.readLine());
		int middle = Integer.parseInt(br.readLine());
		int small = Integer.parseInt(br.readLine());
		int coke = Integer.parseInt(br.readLine());
		int soda = Integer.parseInt(br.readLine());
		
		int[] burger = {large, middle, small};
		int[] drink = {coke, soda};
		
		int min = 2001;
		int set = 0;
		for(int i = 0; i < 3; i++) {
			set = Math.min(burger[i] + drink[0], burger[i] + drink[1]);
			if(min > set) {
				min = set;
			}
		}
		
		System.out.println(min - 50);
		br.close();
	}
}
