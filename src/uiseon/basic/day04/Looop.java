package uiseon.basic.day04;

public class Looop {
   public static void main(String[] args) {
   //while
   //Ư�������� �����Ҷ����� ����ؼ� �־�������� ����
   
   //�ʱ��
   //while(whrjstlr) {
   //  qksqhrzhem
   //wmsrkatlr
   //}

   // ex) 1~10���� ���� ���
   int i = 1;        //�ʱ��
   while( i <= 10 ) { //������ ���̸� �ݺ�����
	   System.out.print(i + " ");
	   i += 1;       //������
   }
  
   // ex) 1~50���� Ȧ�����
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