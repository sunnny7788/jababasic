package uiseon.basic.day01;

/**
 *
 * �������� �ǽ�
 *
 */
public class ex01 {
	public static void main(String[] args) {
		// 1.
		System.out.println("*   *    **    ****    ****    *   *      /////  ");
		System.out.println("*   *   *  *   *   *   *   *   *   *     | o o | ");
		System.out.println("*****  *    *  ****    ****     * *     (|  ^  |)");
		System.out.println("*   *  ******  *   *   *   *     *       | [_] | ");

		// 3
		int rate1; // ����
		// int 1stPlayer; //���ڷ� �����ϸ� �ȵ�
		// int myprogram.java; //��밡�� ��ȣ�� -,$
		// int long; //�ڹ� ������ �� ������ ����
		int TimeLimit; // ���� ,�������� �ҹ��ڷ� ������ ��
		int numberOfWindows; // ���� ,�� ����

		// 4
		// ǥ����:expression
		// ����̳� ó���� ���� �ۼ��ϴ� ���� �ǹ�
		// ���п��� ���ϴ� ���İ� ����
		// ǥ������ �߿��� Ư¡�� �� elaluate��
		// ��, �ڵ��� ����� �˾Ƴ��� ������ �ǹ�

		int x, y, z, s, s0, v, t, g;
		x = 10;
		y = 20;
		z = 30;
		s0 = 5;
		v = 10;
		t = 15;
		g = 20;

		int result = 3 * x; // 3x
		System.out.println(" 3 x  = ");
		System.out.println(result);

		result = (3 * x) + y;
		System.out.println("3 x  + y  = ");
		System.out.println(result);

		System.out.println(" ( x + y) / 7 = ");
		System.out.println((x + y) / 7);

		result = (3 * x + y) / (z + 2);
		System.out.println("( 3 * x + Y )/( z + 2 ) = ");
		System.out.println(result);

		// result s0 v*t +1/2 *g *t *t;
		result = s0 + v * t + (1 / 2) * g * t ^ 2;
		System.out.print("s0 + v *t+(1/2)*g*t^2 =");
		System.out.println(result);

		// 5.
		double number = (1 / 3) * 3;
		System.out.println(" ( 1 / 3 ) * 3 = " + number);

	}
}




//����:1, ������:0.0
//'���� ������ ���� '�� ������� �����̱� ����!




int quotient = 7 / 3;
System.out.println(" 7 / 3 = " + quotient );
 //���� 
int remainder = 7 % 3;
System.out.println(" 7 % 3 = "  + remainder );
 //

//
//System.out.println
//System.out.println
//���մ��Կ�����
//������Կ����ڿ� ���Կ����ڸ� ���ĳ��� ������
//ex)a=a+1 =>a +=1




//6.
double xx = 2.5;
double yy = 2.5;
int m = 18;
int n = 4;
double result2 = xx + n + yy - ( xx + n) * yy;
System.out.println( " x + n * y  -  ( x + n ) *  y = " +result2);

result2 = m / n + m % n;
System.out.println( " m / n + m % n = " + result2);

result2=5*x-n/5;
System.out.println( " 5 * x - n / 5 = " + result2);

result2=1-(1-(1-(1-(1-n))));
System.out.println( " 1-(1-(1-(1-(1-n)))) = " + result2);
