package uiseon.basic.day03;

public class TestCast {
	public static void main(String[] srgs) {
		// �ڹ��� JVM�� �⺻������ 32��Ʈ������ ó����
		byte x = 1; // byte �ڷ����� 8��Ʈ ũ��
		byte y = 2;
		byte z = (byte) (x + y);
		// byte�� ���� ����� �ڵ����� int �� ��ȯ
		// ����, ����� byte�� �����Ϸ���
		// int�� byte�� ��ȯ�ϴ� ���� �ʿ�

		// ����ó���� �����ϰ� ��հ���ϱ�
		int kor = 98;
		int eng = 78;
		int mat = 45;

		// double avg = (kor + eng + mat) / 3.0;
		// double avg = (kor + eng + mat) /(double)3;
		double avg = (double) (kor + eng + mat) / 3;
		// System.out.println("����� " + avg + "�Դϴ�");
		String fmt = "����� %.1f �Դϴ�";
		System.out.printf(fmt, avg);

	}
}
