package b2018;

import java.util.Scanner;

public class 연속된자연수의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 1;
		int start_index = 1;
		int end_index = 1;
		int sum = 1;
		
		while (end_index != n) {
			if(sum == n) {
				count++;
				end_index++;
				sum =sum + end_index;
			}else if(sum>n){
				sum = sum - start_index;
				start_index++;
			}else {//sum<n
				end_index++;
				sum = sum + end_index;
			}
			
		}//while
		System.err.println(count);
	}
}
