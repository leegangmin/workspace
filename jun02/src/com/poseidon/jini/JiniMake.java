package com.poseidon.jini;

import java.util.Scanner;

//�ܾ���� �ɽ��� ������
//�ȳ�
//�ð�
//Ż�� �� �ȳ�
public class JiniMake {
	public static void main(String[] args) {
		//��ü ����
		JINI jini = new JINI();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ����");
		System.out.println("��ɾ� : �ȳ�/�̸�/��¥/�ð�/������");
		
		while (jini.isQute) {
			System.out.println("���� >");
			String input = sc.next();
			jini.scheck(input);
		}
	sc.close();
}
}
