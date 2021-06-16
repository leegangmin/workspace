package starcraft;

class Marine extends TerranUnit{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Zealot extends ProtossUnit{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class Game {
	public static void main(String[] args) {
	
		Marine marine = new Marine();
		Zealot zealot = new Zealot();
	}
}
