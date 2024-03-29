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
		//사용자가 -1이라고 입력하면 입력을 멈추고
		//입력된 내용을 저장하기
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String temp = "";

		while (true) {//입력대기 만들기
			System.out.println("입력할 문장을 입력하세요.");
			System.out.println("-1을 입력하면 종료됩니다.");
			temp = sc.next();
			if(temp.equals("-1")){
				break;
			}
			sb.append(temp + "\r\n");//줄바꿈 포함해서 sb에 저장
		}
		//System.out.println(sb);
		try {
			FileWriter fw = new FileWriter("c:\\temp\\write.txt");
			fw.write(sb.toString());
			fw.close();
			
			//저장된 내용을 화면에 출력하기
			FileReader fr = new FileReader("c:\\temp\\write.txt");
			BufferedReader br = new BufferedReader(fr);//fr보다 조금 더 큰
			
			//위 두 문장을 합친다면 아래와 같이 
			BufferedReader br2 = 
					new BufferedReader(
							new FileReader("c:\\temp\\write.txt"));
			
			String line = "";
			while ((line = br.readLine()) != null) {//읽을것이 없으면 null			
				System.out.println(line);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
