package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOTest08 {
	public static void main(String[] args) {
		//����ڰ� -1�̶�� �Է��ϸ� �Է��� ���߰�
		//�Էµ� ������ �����ϱ�
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String temp = "";

		while (true) {//�Է´�� �����
			System.out.println("�Է��� ������ �Է��ϼ���.");
			System.out.println("-1�� �Է��ϸ� ����˴ϴ�.");
			temp = sc.next();
			if(temp.equals("-1")){
				break;
			}
			sb.append(temp + "\r\n");//�ٹٲ� �����ؼ� sb�� ����
		}
		//System.out.println(sb);
		try {
			FileWriter fw = new FileWriter("c:\\temp\\write.txt");
			fw.write(sb.toString());
			fw.close();
			
			//����� ������ ȭ�鿡 ����ϱ�
			FileReader fr = new FileReader("c:\\temp\\write.txt");
			BufferedReader br = new BufferedReader(fr);//fr���� ���� �� ū
			
			//�� �� ������ ��ģ�ٸ� �Ʒ��� ���� 
			BufferedReader br2 = 
					new BufferedReader(
							new FileReader("c:\\temp\\write.txt"));
			
			String line = "";
			while ((line = br.readLine()) != null) {//�������� ������ null			
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
