package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exception04 {
	public static void main(String[] args) {
		//���� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("c:\set.log��� �Է��ϼ���.");
		
		String fileName = sc.next();
		
		try {
			
			FileReader fr = new FileReader(fileName);
			System.out.println("�����ֽ��ϴ�.");
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		} finally {
			sc.close();
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
