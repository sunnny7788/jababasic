package uiseon.basic.day04;

public class Condition {

	public static void main(String[] args) {
		//���ǹ� 
		//�Ϲ������� ���α׷��� ��������� �������� sequence
		//������,Ư���� ��Ȳ�� �߻��� ���������� �ڵ带 
		//�����ؾ��� �ʿ䰡 ����µ� �̶�, ���ǹ��� �����
		
		//if
		//���ǽ��� ����� true�� false�϶�
		//���� �־��� ��ɹ��� ������
		//if(���ǽ�){
		//     //������ ���϶� �ڵ� ����
		// } else  {
		//     //������ �����϶� �ڵ� ����
		//}
		
		//ex)1~100���� ���� �� ¦���� ����ϼ���
		for(int i = 1 ; i <= 100; ++i) {
         if(i%2==0) //i�� ¦�����
        	 System.out.print(i+"");
	}// for
		//ex)1~100���� ���� �� ¦����� "¦���Դϴ�"��,
		//Ȧ���� "Ȧ���Դϴ�"��� ����ϼ���.
		for(int i =0; i<=100; ++i) {
			if(i%2==0)
			System.out.println(i+"�� ¦�� �Դϴ�");
			else
		    System.out.println(i+"�� Ȧ�� �Դϴ�");	
		}

    //����ڰ� ���� salary�� ��ȥis Married(0/1)���θ� �Է��ϸ�
	//������ �������� ���� �����ؾ� �� ����tax��
	//����ϴ� ���α׷��� �ۼ��ϼ���
	//��ȥ�� ���:���� 3000���̸�-10%,���� 3000���̻� -25%
	//��ȥ�� ���:���� 6000���̸�-15%,���� 6000���̻� -35%
		int salary;
		int Married;
		double tax;
		
		System.out.println("������?");
		salary = sc.nextInt();
		System.out.println(" ��ȥ ���δ�?(0-�ƴϿ�,1-��)");
		isMarried= sc.nextInt();
	   
	     if(isMarried==0)    //��ȥ
	    	 if(salary<3000)tax =salary * 0.1;
	    	 else tax =salary*0.25;
	     else                //��ȥ
	    	 if(salary<6000)tax=salary * 0.15;
	    	 else tax= salary*0.35;
	     String fmt ="������ %d�̰� ,��ȥ���δ� %d�϶� \n"+
	    	         "������ %.1f�Դϴ�";
	     System.out.printf(fmt, salary, isMarried, tax);
	
	
	