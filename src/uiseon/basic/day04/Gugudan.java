package uiseon.basic.day04;

import java.util.Scanner;

public class Gugudan {
   public  static void main(String[] args) {
	   //������ ����ϱ�
	   // ex)7���� ����ϼ��� v1
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
	   
	   
	   //ex)7���� ����ϼ��� v2-for
	   for(int i =1; i<=9; ++i) {
		   System.out.println("7*"+i+"="+(7*i)); 
	   }
	   //ex)7���� ����ϼ��� v3-while, printf
	   String fmt="7 * % d  = % d \n";
	   int i = 1;
	   while(i<=9) {
		   System.out.printf(fmt, i,7*i);
		   ++i;
	   } 
	  //ex)3���� ����ϼ��� v3-while, printf
		   
		   i = 1;
		   fmt ="3 * % d  = %2d \n";
		   while(i<=9) {
			   System.out.printf(fmt, i,(3*i));
			   ++i; 
		   }
		   System.out.println("----- -----");   
		  
		   
		   //������ ���α׷� v1
		   //����ڷκ��� ����(1-9)�� �ϳ� �Է� �޾�.
		   //�������� ����ϴ� ���α׷� �ۼ� 
		   //Scanner, while, printf
		     
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� �������� ���� �Է��ϼ���:"); 
		 = sc.nextInt();
		
		
	   
	    System.out.print("����� �������� ���� �Է��ϼ���:"); 
		char dan2 =sc .next().charAt(0);
		//�Է¹��� ���ڿ� �� ù��° ���ڸ� �̾Ƽ� 
		//
		//i=1;
		//fmt="1* % d =  %2d \n";
		//while(i<=9) {
		//System.out.printf(fmt, dan , i,(dan*i));
		//++i;    
		System.out.print("����� �������� ���� �Է��ϼ���:"); 
		String dan3 =sc .next().charAt(0);
		i = 1;
		try {
	    while(i<=9) {
		    System.out.printf(fmt, dan3, i,(Interger.parseInt(dan3)*i));
			++i; 
		
		  
       catch(Exception ex) {
	      System.out.println("�߸��Է��ϼ̽��ϴ�!")

         //����ó���ڵ�(try-catch)�� �̿��ؼ�
         //���α׷� ������ �����߻���
         //��� catch �ڵ������� �ѱ�

	      
	       //ex)�ֹι�ȣ�� �̿��ؼ� ������ ����ϴ� �ڵ带 �ۼ��ϼ���
	      //�ֹι�ȣ 123456-7654321���� 7�� ������ ��Ÿ���� �ڵ�
	      // 1 : 1999�� ������ ����� ����
	      // 2 : 1999�� ������ ����� ����
	      // 3 : 2000�� ���Ŀ� ����� ����
	      // 4 : 2000�� ���Ŀ� ����� ����
	      // charAt�� �̿��ؼ� Ǯ�����
	      String jumin = "123456-1234567";
	      
	      char gender = jumin.charAt(7);
	      result = (gender == '1') ? "1999����" :	   
	    	       (gender == '2') ? "1999����" :	   
	    		   (gender == '3') ? "2000����" : "2000����";	   
	     
	      System.out.println(result);		  	   
       }
}


