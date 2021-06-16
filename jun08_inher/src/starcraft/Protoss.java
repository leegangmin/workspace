package starcraft;

public class Protoss extends StarCraft {
	int shield;
	String clan;
	
	public void attack() {
		System.out.println("프로토스가 공격");
	}
	public void shieldCharge() {
		System.out.println("보호막 회복");
		this.shield++;
	}
	
}
