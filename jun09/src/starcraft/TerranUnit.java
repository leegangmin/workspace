package starcraft;

public abstract class TerranUnit extends StarCraftUnit {
	String clan;
	
	//생성자 위치
	
	public String getClan() {
		return this.clan;
	}
	public String getDescription() {
		return "";
	}
}
