package uiseon.basic.day02;

import java.util.Scanner;

public class sungj {
	public static void main(String[] args) {

		// ��������
		String name; // �̸�
		int kor; // ����
		int eng; // ����
		int math; // ����
		int total; // ����
		double average;// ���
		char grade;// ����
		// ó��
		Scanner sc = new Scanner(System.in);
		// Ű���带 �̿��ؼ� ���������͸� �Է¹ޱ� ����
		// Scanner Ŭ������ �ʱ�ȭ��
		System.out.print("�̸���? ");
		name = sc.next();
		// Ű����� ���ڵ����͸� �Է¹޾� name������ ����
		System.out.print("�����? ");
		kor = sc.nextInt();
		// Ű����� ���ڵ����͸� �Է¹޾� kor ������ ����
		System.out.print("�����? ");
		eng = sc.nextInt();
		System.out.print("������? ");
		math = sc.nextInt();
		System.out.print("������? ");
		total = sc.nextInt();
		System.out.print("�����? ");
		average = sc.nextInt();
		// ���� , ��� ó��
		total = kor + eng + math;
		average = total / 3;

		// ���
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(total);
		System.out.println(average);
	}

}