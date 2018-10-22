
public class Player {
	int id;
	PersonalDetails personalDetails;
	PlayerAttributes playerAttributes;
	PlayerType playerType;
	PlayerType secondaryPlayerType;
	WorkRate offWorkRate;
	WorkRate defWorkRate;
	int overallRating;
	double corsicaRating;
	PositionEnum primaryPositon;
	PositionEnum secondaryPosition;
	int jerseyNumber;
	Team currentTeam;
	Team previousTeam;
	
	public Player(int id, PersonalDetails personalDetails, PlayerAttributes playerAttributes, PlayerType playerType, PlayerType secondaryPlayerType, WorkRate offWorkRate, WorkRate defWorkRate, int overallRating, double corsicaRating, PositionEnum primaryPositon, PositionEnum secondaryPosition, int jerseyNumber, Team currentTeam, Team previousTeam) {
		this.personalDetails = personalDetails;
		this.playerAttributes = playerAttributes;
		this.playerType = playerType;
		this.secondaryPlayerType = secondaryPlayerType;
		this.offWorkRate = offWorkRate;
		this.defWorkRate = defWorkRate;
		this.overallRating = overallRating;
		this.corsicaRating = corsicaRating;
		this.primaryPositon = primaryPositon;
		this.secondaryPosition = secondaryPosition;
		this.jerseyNumber = jerseyNumber;
		this.currentTeam = currentTeam;
		this.previousTeam = previousTeam;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public PlayerAttributes getPlayerAttributes() {
		return playerAttributes;
	}

	public void setPlayerAttributes(PlayerAttributes playerAttributes) {
		this.playerAttributes = playerAttributes;
	}

	public PlayerType getPlayerType() {
		return playerType;
	}

	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}

	public WorkRate getOffWorkRate() {
		return offWorkRate;
	}

	public void setOffWorkRate(WorkRate offWorkRate) {
		this.offWorkRate = offWorkRate;
	}

	public WorkRate getDefWorkRate() {
		return defWorkRate;
	}

	public void setDefWorkRate(WorkRate defWorkRate) {
		this.defWorkRate = defWorkRate;
	}

	public int getOverallRating() {
		return overallRating;
	}

	public void setOverallRating(int overallRating) {
		this.overallRating = overallRating;
	}

	public double getCorsicaRating() {
		return corsicaRating;
	}

	public void setCorsicaRating(double corsicaRating) {
		this.corsicaRating = corsicaRating;
	}

	public PositionEnum getPrimaryPositon() {
		return primaryPositon;
	}

	public void setPrimaryPositon(PositionEnum primaryPositon) {
		this.primaryPositon = primaryPositon;
	}

	public PositionEnum getSecondaryPosition() {
		return secondaryPosition;
	}

	public void setSecondaryPosition(PositionEnum secondaryPosition) {
		this.secondaryPosition = secondaryPosition;
	}

	public int getJerseyNumber() {
		return jerseyNumber;
	}

	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	public Team getCurrentTeam() {
		return currentTeam;
	}

	public void setCurrentTeam(Team currentTeam) {
		this.currentTeam = currentTeam;
	}

	public Team getPreviousTeam() {
		return previousTeam;
	}

	public void setPreviousTeam(Team previousTeam) {
		this.previousTeam = previousTeam;
	}
}
