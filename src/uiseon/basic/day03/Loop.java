package uiseon.basic.day03;

public class Loop {
	public static void main(String[] srgs) {
		//반복문 loop
		//프로그램 내에서 똑같은 명령을 지정한 획수만큼
		//반복하여 수행하도록 작성하는 명령문
		//사용빈도가 높은 명령어들 중 하나
		//for(횟수지정후 반복),while(조건을 만족할때까지 반복)
		
		//인사말 출력 v1 -3번만 출력
		System.out.println("Hello,World!!");
		System.out.println("Hello,World!!");
		System.out.println("Hello,World!!");
		
		
		//인사말	
	   for(int i = 1 ; i <= 10 ; ++i) {
		System.out.println(1);
	}
		
		// ex)1~50 사이 홀수 출력
		for(int i = 1 ; i <= 50 ; i=i+2) {
			System.out.print( i + " ");
		}		
		System.out.println(" ");
		    
		    
		for(int i = 2 ; i <= 50 ; i=i+2) {
			System.out.print( i + " ");
		}
		
		//ex)1~100사이 총합 구해서 출력
	    int sum = 0;
		for(int  i= 1 ; i <= 100 ; ++i) {
			sum = sum + i;
		}
		System.out.println("1~100 사이 합 : " + sum);
	
	}
 }
		
	//ex)1~100사이 총합 구해서 출력 v2
    //가우스 덧셈공식 이용하면
    //특정범위 내 모든 수의 합을 편리하게 구할 수 있음
    //총합 : sum , 시작범위:i 끝범위:j
    // sum =(i+j) *J/2
    
    i=1;
    int j =100;
    sum =(i + j) * J/2;
    System.out.println(sum);
    
    sum =0;
    for(int i=1+100 ;i=2+99;  i <=101 ) {
    	sum = sum + i;
	}
    System.out.println("1~100 사이 합 : " + sum);	
    	
    
