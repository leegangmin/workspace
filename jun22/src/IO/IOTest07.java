package IO;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest07 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("C:\\temp\\filewriter.txt");
			for (int i = 0; i < 10; i++) {
				String data = i + "번 \r\n";
				fw.write(data);//String이 그대로 들어감.
				
			}
			fw.close();			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
