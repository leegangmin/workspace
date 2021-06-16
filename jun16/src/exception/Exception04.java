package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exception04 {
	public static void main(String[] args) {
		//파일 없음 오류
		Scanner sc = new Scanner(System.in);
		System.out.println("c:\set.log라고 입력하세요.");
		
		String fileName = sc.next();
		
		try {
			
			FileReader fr = new FileReader(fileName);
			System.out.println("파일있습니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} finally {
			sc.close();
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
