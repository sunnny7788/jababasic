package uiseon.basic.day03;

public class Loop {
	public static void main(String[] srgs) {
		//�ݺ��� loop
		//���α׷� ������ �Ȱ��� ����� ������ ȹ����ŭ
		//�ݺ��Ͽ� �����ϵ��� �ۼ��ϴ� ��ɹ�
		//���󵵰� ���� ��ɾ�� �� �ϳ�
		//for(Ƚ�������� �ݺ�),while(������ �����Ҷ����� �ݺ�)
		
		//�λ縻 ��� v1 -3���� ���
		System.out.println("Hello,World!!");
		System.out.println("Hello,World!!");
		System.out.println("Hello,World!!");
		
		
		//�λ縻	
	   for(int i = 1 ; i <= 10 ; ++i) {
		System.out.println(1);
	}
		
		// ex)1~50 ���� Ȧ�� ���
		for(int i = 1 ; i <= 50 ; i=i+2) {
			System.out.print( i + " ");
		}		
		System.out.println(" ");
		    
		    
		for(int i = 2 ; i <= 50 ; i=i+2) {
			System.out.print( i + " ");
		}
		
		//ex)1~100���� ���� ���ؼ� ���
	    int sum = 0;
		for(int  i= 1 ; i <= 100 ; ++i) {
			sum = sum + i;
		}
		System.out.println("1~100 ���� �� : " + sum);
	
	}
 }
		
	//ex)1~100���� ���� ���ؼ� ��� v2
    //���콺 �������� �̿��ϸ�
    //Ư������ �� ��� ���� ���� ���ϰ� ���� �� ����
    //���� : sum , ���۹���:i ������:j
    // sum =(i+j) *J/2
    
    i=1;
    int j =100;
    sum =(i + j) * J/2;
    System.out.println(sum);
    
    sum =0;
    for(int i=1+100 ;i=2+99;  i <=101 ) {
    	sum = sum + i;
	}
    System.out.println("1~100 ���� �� : " + sum);	
    	
    
