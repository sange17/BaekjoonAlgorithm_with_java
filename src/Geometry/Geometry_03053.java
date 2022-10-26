package Geometry;

import java.util.Scanner;

// 소수점 표현1: Math.round(x * 소수점 아래 자리 수(100...)) / (100...).0
// 소수점 표현2: String.format("%.(소수점 아래 자리 수)f"
public class Geometry_03053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		double result = 0;
		
		// 기하학에서의 원의 넓이: PI * R^2
		result = Math.round(Math.PI * R * R * 1000000) / 1000000.0;
		System.out.println(result);
		
		// 택시 기하학에서의 원의 넓이는 마름모꼴 정사각형
		result = R * R / 2.0 * 4;
		System.out.println(String.format("%.6f", result));
		
		sc.close();
	}
}
