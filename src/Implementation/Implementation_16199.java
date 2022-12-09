package Implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Implementation_16199 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int bornYear = 0;
		int bornMonth = 0;
		int bornDate = 0;
		int currYear = 0;
		int currMonth = 0;
		int currDate = 0;
		int minYear = 0;
		int minMonth = 0;
		int minDate = 0;
			
		st = new StringTokenizer(br.readLine(), " ");
		
		bornYear = Integer.parseInt(st.nextToken());
		bornMonth = Integer.parseInt(st.nextToken());
		bornDate = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		currYear = Integer.parseInt(st.nextToken());
		currMonth = Integer.parseInt(st.nextToken());
		currDate = Integer.parseInt(st.nextToken());
		
		minYear = currYear - bornYear;
		minMonth = currMonth - bornMonth;
		minDate = currDate - bornDate;
		
		System.out.println(minYear + " " + minMonth + " " + minDate);
		
		if(minYear >= 0) {
			
			if(minMonth >= 0) {
				
			}else {
				
			}
		}else {
			
		}
	}
}
