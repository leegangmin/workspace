package starcraft;

public abstract class ProtossUnit extends StarCraftUnit {
	String clan;
	int shield;
	
	public String getClan() {
		return this.clan;
	}
	public int getShield() {
		return this.shield;
	}
	public String getDescription() {//���� �޼ҵ尡 �־ �˴ϴ�.
		return "";
	}
}
