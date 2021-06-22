package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class IOTest10 {

	public static void main(String[] args) {

		try {
			PrintStream ps = new PrintStream(new File("C:\\temp\\write.txt"));
			
			ps.print("!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
