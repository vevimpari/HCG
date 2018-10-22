import java.util.ArrayList;

//	int id, PersonalDetails personalDetails, PlayerAttributes playerAttributes, 
// PlayerType playerType, PlayerType secondaryPlayerType, 
// WorkRate offWorkRate, WorkRate defWorkRate, 
// int overallRating, double corsicaRating, 
// PositionEnum primaryPositon, PositionEnum secondaryPosition, 
// int jerseyNumber, Team currentTeam, Team previousTeam) {

//public class PlayerAttributes {
//	int skating;
//	int shot;
//	int hands;
//	int passing;
//	int defence;
//	int physical;
//}
/*public class PersonalDetails {
	String firstname;
	String lastname;
	String birthCountry;
	String birthStateProvince;
	String city;
	int draftyear;
	int draftpos;
	int height;
	int weight;
	String handness;
}*/


public class Players {
	public ArrayList<Player> playersList;

	public Players() {
		this.playersList = new ArrayList<>();
	}
	
	public ArrayList<Player> getPlayersList() {
		return playersList;
	}

	public void setPlayersList(ArrayList<Player> playersList) {
		this.playersList = playersList;
	}

	public void AddPlayers() {
		
		PersonalDetails personal = new PersonalDetails("Connor", "McDavid", "Canada", "Ontario", "Richmond Hill", 2015, 1, 185, 87, "left");
		PlayerAttributes attributes = new PlayerAttributes(96, 87, 97, 94, 87, 81);
		Team team = new Team("Oilers", "Edmonton", "EDM", "Pacific", "West");
		Player player = new Player(1, personal, attributes, PlayerType.PLY, PlayerType.SNP, WorkRate.HIGH, WorkRate.MEDIUM, 96, 92.2, PositionEnum.c, PositionEnum.lw, 0, team, team);
		this.playersList.add(player);
		
	}
}
