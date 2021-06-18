package jun17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	BufferedReader br = null;
	
	try {
		br = new BufferedReader(new FileReader("/Users/gangmin/Downloads/mariadb.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	int number = 0;
	try {
		number = Integer.parseInt("100T");
		
	} catch (Exception e) {
		number = 10;
	}
	
	System.out.println(number);
	
	
	
	}

}


/*
 * 트랜잭션 : 묶음. 여러 명령어들을 하나로 묶어서 처리함.
 * 3개의 명령어가 들어있는 트랜잭션이 있음.
 * 2개 성공, 1개 실패라면 모두 취소시켜야 함.
 * 
 * try {
 *  포장();
 *  영수증 발행();
 *  택배발송();
 *  } catch(){
 *  취소();
 */



















