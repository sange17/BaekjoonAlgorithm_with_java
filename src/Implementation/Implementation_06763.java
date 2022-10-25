package Implementation;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Implementation_06763 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int speedLimit = Integer.parseInt(br.readLine());
		int speedOfCar = Integer.parseInt(br.readLine());
		int difference = speedOfCar - speedLimit;
		
		if(difference < 1) {
			System.out.println("Congratulations, you are within the speed limit!");
		}else if(difference >= 1 && difference <=20) {
			System.out.println("You are speeding and your fine is $100.");
		}else if(difference >= 21 && difference <=30) {
			System.out.println("You are speeding and your fine is $270.");
		}else if(difference >= 31) {
			System.out.println("You are speeding and your fine is $500.");
		}
		
		br.close();
	}
}
