package day0620;

import java.util.Scanner;

public class SwitchTest_11 {

	public static void main(String[] args) {
		//숫자를 입력받아 그 숫자를 출력해보기
		//임포트
		Scanner sc= new Scanner(System.in);
		
		//변수지정
		int num,num2;
		
		//값 입력
		System.out.println("숫자입력");
		num=sc.nextInt();
		
		//조건문
		switch(num){
		case 1:
			System.out.println("숫자1입니다");
			break;
		case 2:
			System.out.println("숫자2입니다");
			break;
		case 3:
			System.out.println("숫자3입니다");
			break;
		default:
			System.out.println("숫자1,2,3이 아니다");
			break;
		}
		//switch 이용해서 
		//22는 짝수입니다 or 5는 홀수입니다
	
	switch(num%2) {
	case 1:
		System.out.println("홀");
		break;		
		default:
			System.out.println("짝");
			break;
	}
	}
}
