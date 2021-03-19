package uiseon.basic.day04;

public class Looop {
   public static void main(String[] args) {
   //while
   //특정조건을 만족할때까지 계속해서 주어진명령을 수행
   
   //초기식
   //while(whrjstlr) {
   //  qksqhrzhem
   //wmsrkatlr
   //}

   // ex) 1~10까지 정수 출력
   int i = 1;        //초기식
   while( i <= 10 ) { //조건이 참이면 반복실행
	   System.out.print(i + " ");
	   i += 1;       //증감식
   }
  
   // ex) 1~50까지 홀수출력
    i=1;
    while( i <= 50 ) {
    	System.out.print(i+ " ");
    	i + = 2;
    }
    System.out.println(" ");
   
  int sum = 0;
  i  = 1;
  while(i<=100) {
	  sum += i;
	  ++i;
  }
  
   }
}