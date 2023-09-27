
public class LeagueApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		League_of_Legends champ1 = new League_of_Legends();
		League_of_Legends champ2 = new League_of_Legends();
		League_of_Legends champ3 = new League_of_Legends();
		champ1.championName = "Thresh";
		champ2.championName = "Hecarim";
		champ2.ranged = false;
		champ2.setRanged(true);
		champ1.ranged = true;
		champ1.setRanged(false);
		champ1.role = "Support";
		champ2.role = "Jungle";
		champ1.winrate = 50.7;
		champ1.setWinrate(20);
		champ2.winrate = 48.9;
		champ2.setWinrate(60);
		champ1.opggtier = "S+";
		champ1.setOpggtier("Trash");
		champ2.opggtier = "D";
		champ2.setOpggtier("S+");
		
		champ3.championName = "Heimerdinger";
		champ3.ranged = true;
		champ3.opggtier = "A";
		champ3.winrate = 50;
		champ3.role = "Support";
		
		champ1.printProperties();
		champ2.printProperties();
		champ3.printProperties();
		
		String Name = champ1.getChampionName();
		System.out.println("Champion name = " + Name);
		
		String Role = champ1.getRole();
		System.out.println("role = " + Role);
		
		double Winrate = champ1.getWinrate();
		System.out.println("winrate = " + Winrate);
		
		boolean Ranged = champ1.getRanged();
		System.out.println("ranged = " + Ranged);
		
		String Opggtier = champ1.getOpggtier();
		System.out.println("opggtier = " + Opggtier);
		
		//League_of_Legends champ4 = new League_of_Legends();
		//System.out.println(champ4);
		
		League_of_Legends champ5 = new League_of_Legends("Talon", "Mid", 51, false, "S");
		System.out.println("champion name = " + champ5.getChampionName() + "\n" + "Role = " + champ5.getRole() + "\n" + "winrate = " + champ5.getWinrate());

	}

}
