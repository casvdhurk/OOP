
public class League_of_Legends{
	
	public String championName;
	public String role;
	public double winrate;
	public boolean ranged;
	public String opggtier;
	
	public League_of_Legends() {
		System.out.println("lege constructor");
	}
	
	public League_of_Legends(String championName, String role, double winrate, boolean Ranged, String opggtier ) {
		this.championName = championName;
		this.role = role;
		this.winrate = winrate;
		this.ranged = Ranged;
		this.opggtier = opggtier;
	}
	
	public void printProperties() {
		System.out.println("Champion Name = " + championName + "\n" + "Role = " + role + "\n" + "winrate = " + winrate + "\n" + "ranged = " + ranged + "\n" + "opggtier = " + opggtier); 
		
	}
	
	public void setWinrate(double newWinrate) {
		winrate = newWinrate;
	}
	
	public void setOpggtier(String newOpggtier) {
		opggtier = newOpggtier;
	}
	
	public void setRanged(boolean newRanged) {
		ranged = newRanged;
	}
	
	public String getChampionName() {
		return championName;
	}
	
	public String getRole() {
		return role;
	}
	
	public double getWinrate() {
		return winrate;
	}
	
	public boolean getRanged() {
		return ranged;
	}
	
	public String getOpggtier() {
		return opggtier;
	}
	
}
