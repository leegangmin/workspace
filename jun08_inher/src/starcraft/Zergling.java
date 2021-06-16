package starcraft;

public class Zergling extends Zerg {

	public Zergling(String name, int strength) {
		//생성자
		this.name = name;
		this.strength = strength;
		
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("저글링이 공격");
	}

}
