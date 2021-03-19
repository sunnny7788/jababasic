package uiseon.basic.day04;

import java.util.Scanner;

public class Gugudan {
   public  static void main(String[] args) {
	   //구구단 출력하기
	   // ex)7단을 출력하세요 v1
	   System.out.println("7*1=7");
	   System.out.println("7*2=14");
	   System.out.println("7*3=21");
	   System.out.println("7*4=28");
	   System.out.println("7*5=35");
	   System.out.println("7*6=42");
	   System.out.println("7*7=49");
	   System.out.println("7*8=56");
	   System.out.println("7*9=63");
	   System.out.println("----- -----");
	   
	   
	   //ex)7단을 출력하세요 v2-for
	   for(int i =1; i<=9; ++i) {
		   System.out.println("7*"+i+"="+(7*i)); 
	   }
	   //ex)7단을 출력하세요 v3-while, printf
	   String fmt="7 * % d  = % d \n";
	   int i = 1;
	   while(i<=9) {
		   System.out.printf(fmt, i,7*i);
		   ++i;
	   } 
	  //ex)3단을 출력하세요 v3-while, printf
		   
		   i = 1;
		   fmt ="3 * % d  = %2d \n";
		   while(i<=9) {
			   System.out.printf(fmt, i,(3*i));
			   ++i; 
		   }
		   System.out.println("----- -----");   
		  
		   
		   //구구단 프로그램 v1
		   //사용자로부터 숫자(1-9)를 하나 입력 받아.
		   //구구단을 출력하는 프로그램 작성 
		   //Scanner, while, printf
		     
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 구구단의 단을 입력하세요:"); 
		 = sc.nextInt();
		
		
	   
	    System.out.print("출력할 구구단의 단을 입력하세요:"); 
		char dan2 =sc .next().charAt(0);
		//입력받은 문자열 중 첫번째 글자만 뽑아서 
		//
		//i=1;
		//fmt="1* % d =  %2d \n";
		//while(i<=9) {
		//System.out.printf(fmt, dan , i,(dan*i));
		//++i;    
		System.out.print("출력할 구구단의 단을 입력하세요:"); 
		String dan3 =sc .next().charAt(0);
		i = 1;
		try {
	    while(i<=9) {
		    System.out.printf(fmt, dan3, i,(Interger.parseInt(dan3)*i));
			++i; 
		
		  
       catch(Exception ex) {
	      System.out.println("잘못입력하셨습니다!")

         //예외처리코드(try-catch)를 이용해서
         //프로그램 실행중 오류발생시
         //제어를 catch 코드쪽으로 넘김

	      
	       //ex)주민번호를 이용해서 성별을 출력하는 코드를 작성하세요
	      //주민번호 123456-7654321에서 7이 성별을 나타내는 코드
	      // 1 : 1999년 이전에 출생한 남자
	      // 2 : 1999년 이전에 출생한 여자
	      // 3 : 2000년 이후에 출생한 남자
	      // 4 : 2000년 이후에 출생한 여자
	      // charAt를 이용해서 풀어보세요
	      String jumin = "123456-1234567";
	      
	      char gender = jumin.charAt(7);
	      result = (gender == '1') ? "1999남자" :	   
	    	       (gender == '2') ? "1999여자" :	   
	    		   (gender == '3') ? "2000남자" : "2000여자";	   
	     
	      System.out.println(result);		  	   
       }
}


