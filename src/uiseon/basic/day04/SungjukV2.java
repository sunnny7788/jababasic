package uiseon.basic.day04;

import java.util.Scanner;

//����ó�����α׷� v2
//�ݺ����� �̿��ؼ� ���������ͤ��Է��� ��� ������

public class SungjukV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //���� ����
		String name;
		int kor , eng, mat;
		int tot;
		double avg;
		char grd;
		String fmt = "%s,%d,%d%d,%d \n"+
		             "%d, %.1F,%c \n";
		Scanner sc = new Scanner(system.in);
		
		//����ó��
		int i=1;
		while(i<=3) { //while���� ���ǽ��� true�� �����ϸ�
		System.out.print("�̸���?");
		name=sc.next();
		System.out.print("�����?");
		kor=sc.nextInt();
		System.out.print("�����?");
		eng=sc.nextInt();
		System.out.print("������?");
		mat=sc.nextInt();
		
		tot=kor+eng+mat;
		avg=(double)tot/3;
		grd=(avg>=90)?'��':
			(avg>=80)?'��':
			(avg>=70)?'��':
			(avg>=60)?'��':'��';	
									
		 //���ó��
		 System.out.printf(fmt, name, kor, eng, mat, tot, avg, grd);
	
	    //�ݺ� ������
	   ++i;
		
	
	 }//while

   }//main

}//class