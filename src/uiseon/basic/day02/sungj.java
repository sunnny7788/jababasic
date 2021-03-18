package uiseon.basic.day02;

import java.util.Scanner;

public class sungj {
	public static void main(String[] args) {

		// 변수선언
		String name; // 이름
		int kor; // 국어
		int eng; // 영어
		int math; // 수학
		int total; // 총점
		double average;// 평균
		char grade;// 학점
		// 처리
		Scanner sc = new Scanner(System.in);
		// 키보드를 이용해서 성적데이터를 입력받기 위해
		// Scanner 클래스를 초기화함
		System.out.print("이름은? ");
		name = sc.next();
		// 키보드로 문자데이터를 입력받아 name변수에 대입
		System.out.print("국어는? ");
		kor = sc.nextInt();
		// 키보드로 숫자데이터를 입력받아 kor 변수에 대입
		System.out.print("영어는? ");
		eng = sc.nextInt();
		System.out.print("수학은? ");
		math = sc.nextInt();
		System.out.print("총점은? ");
		total = sc.nextInt();
		System.out.print("평균은? ");
		average = sc.nextInt();
		// 총점 , 평균 처리
		total = kor + eng + math;
		average = total / 3;

		// 출력
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(total);
		System.out.println(average);
	}

}