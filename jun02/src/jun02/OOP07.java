package jun02;

class David {
	int lovePoint = 10;
	
	void ask(Sunja s) {
		System.out.println("Do you love me?");
		s.answer();
		lovePoint++;
	}
}

class Sunja {
	int lovePoint = 60;
	void answer() {
		if (lovePoint > 50) {
			System.out.println("Love you");
		} else {
			System.out.println("I don't");
		}
		lovePoint--;
	}
}


public class OOP07 {
	public static void main(String[] args) {

		David david = new David();
		Sunja sunja = new Sunja();
		
		for (int i = 0; i < 15; i++) {
			
		//david.ask();
		//sunja.answer();
		david.ask(sunja);
		}
		
		
	}

}
