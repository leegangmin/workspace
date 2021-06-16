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
	public String getDescription() {//정상 메소드가 있어도 됩니다.
		return "";
	}
}
