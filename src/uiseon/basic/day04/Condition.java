package uiseon.basic.day04;

public class Condition {

	public static void main(String[] args) {
		//조건문 
		//일반적으로 프로그램의 실행순서는 순차적인 sequence
		//하지만,특수한 상황이 발생시 선택적으로 코드를 
		//실행해야할 필요가 생기는데 이때, 조건문을 사용함
		
		//if
		//조건식의 결과가 true와 false일때
		//각각 주어진 명령문을 실행함
		//if(조건식){
		//     //조건이 참일때 코드 실행
		// } else  {
		//     //조건이 거짓일때 코드 실행
		//}
		
		//ex)1~100사이 정수 중 짝수를 출력하세요
		for(int i = 1 ; i <= 100; ++i) {
         if(i%2==0) //i가 짝수라면
        	 System.out.print(i+"");
	}// for
		//ex)1~100사이 정수 중 짝수라면 "짝수입니다"를,
		//홀수면 "홀수입니다"라고 출력하세요.
		for(int i =0; i<=100; ++i) {
			if(i%2==0)
			System.out.println(i+"는 짝수 입니다");
			else
		    System.out.println(i+"는 홀수 입니다");	
		}

    //사용자가 연봉 salary과 결혼is Married(0/1)여부를 입력하면
	//다음의 세금율에 의해 납부해야 할 세금tax을
	//계산하는 프로그램을 작성하세요
	//미혼인 경우:연봉 3000만미만-10%,연봉 3000만이상 -25%
	//결혼한 경우:연봉 6000만미만-15%,연봉 6000만이상 -35%
		int salary;
		int Married;
		double tax;
		
		System.out.println("연봉은?");
		salary = sc.nextInt();
		System.out.println(" 결혼 여부는?(0-아니요,1-예)");
		isMarried= sc.nextInt();
	   
	     if(isMarried==0)    //미혼
	    	 if(salary<3000)tax =salary * 0.1;
	    	 else tax =salary*0.25;
	     else                //기혼
	    	 if(salary<6000)tax=salary * 0.15;
	    	 else tax= salary*0.35;
	     String fmt ="연봉은 %d이고 ,결혼여부는 %d일때 \n"+
	    	         "세금은 %.1f입니다";
	     System.out.printf(fmt, salary, isMarried, tax);
	
	
	