package starcraft;

public class Marine extends Terran {
	
	public Marine(String name, int strength) {
		this.name = name;
		this.strength = strength;
	
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("마린이 공격");
	}
}
