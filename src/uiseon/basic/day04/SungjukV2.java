package uiseon.basic.day04;

import java.util.Scanner;

//성적처리프로그램 v2
//반복문을 이용해서 성적데이터ㄹ입력을 계속 수행함

public class SungjukV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //변수 선언
		String name;
		int kor , eng, mat;
		int tot;
		double avg;
		char grd;
		String fmt = "%s,%d,%d%d,%d \n"+
		             "%d, %.1F,%c \n";
		Scanner sc = new Scanner(system.in);
		
		//성적처리
		int i=1;
		while(i<=3) { //while문의 조건식을 true로 설정하면
		System.out.print("이름은?");
		name=sc.next();
		System.out.print("국어는?");
		kor=sc.nextInt();
		System.out.print("영어는?");
		eng=sc.nextInt();
		System.out.print("수학은?");
		mat=sc.nextInt();
		
		tot=kor+eng+mat;
		avg=(double)tot/3;
		grd=(avg>=90)?'수':
			(avg>=80)?'우':
			(avg>=70)?'미':
			(avg>=60)?'양':'가';	
									
		 //결과처리
		 System.out.printf(fmt, name, kor, eng, mat, tot, avg, grd);
	
	    //반복 증감식
	   ++i;
		
	
	 }//while

   }//main

}//class