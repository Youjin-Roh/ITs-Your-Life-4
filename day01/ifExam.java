package day01;

public class ifExam {

	public static void main(String[] args) {
		//학점 A, B, C, D, F
		int score = 73;
		if(score >= 90) {
			System.out.println("A");
		}else if(score >=80){
			System.out.println("B");
		}else if(score>=70) {
			System.out.println("C");
		}else if(score>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		System.out.println("END");
	}

}
