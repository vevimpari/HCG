
public class Position {
	PositionEnum pos;
	int xCoord;
	int yCoord;
	WorkRate offWR;
	WorkRate defWR;
	
	public Position(PositionEnum pos, int xCoord, int yCoord, WorkRate offWR, WorkRate defWR) {
		this.pos = pos;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.offWR = offWR;
		this.defWR = defWR;
	}
	
	public PositionEnum getPos() {
		return pos;
	}
	public void setPos(PositionEnum pos) {
		this.pos = pos;
	}
	public int getxCoord() {
		return xCoord;
	}
	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}
	
	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}
	
	public WorkRate getOffWR() {
		return offWR;
	}

	public void setOffWR(WorkRate offWR) {
		this.offWR = offWR;
	}

	public WorkRate getDefWR() {
		return defWR;
	}

	public void setDefWR(WorkRate defWR) {
		this.defWR = defWR;
	}
}
