import java.util.ArrayList;

public class PositionList {
	public ArrayList<Position> positionList;
	
	public PositionList() {
		this.positionList = new ArrayList<>();
	}
	
	public void addPosition(Position p){
		this.positionList.add(p);
	}
	

	public ArrayList<Position> getPositionList() {
		return positionList;
	}


	public void setPositionList(ArrayList<Position> positions) {
		this.positionList = positions;
	}


	public void addAllPositions() {
		
		Position lw1 = new Position(PositionEnum.lw, 0, 0, WorkRate.HIGH, WorkRate.LOW);
		Position lw2 = new Position(PositionEnum.lw, 0, 2, WorkRate.MEDIUM, WorkRate.MEDIUM);
		Position lw3 = new Position(PositionEnum.lw, 0, 4, WorkRate.LOW, WorkRate.HIGH);
		
		Position c1 = new Position(PositionEnum.c, 2, 2, WorkRate.HIGH, WorkRate.LOW);
		Position c2 = new Position(PositionEnum.c, 2, 2, WorkRate.MEDIUM, WorkRate.MEDIUM);
		Position c3 = new Position(PositionEnum.c, 2, 4, WorkRate.LOW, WorkRate.HIGH);
		
		Position rw1 = new Position(PositionEnum.rw, 4, 2, WorkRate.HIGH, WorkRate.LOW);
		Position rw2 = new Position(PositionEnum.rw, 4, 2, WorkRate.MEDIUM, WorkRate.MEDIUM);
		Position rw3 = new Position(PositionEnum.rw, 4, 4, WorkRate.LOW, WorkRate.HIGH);
		
		Position ld1 = new Position(PositionEnum.ld, 1, 6, WorkRate.HIGH, WorkRate.LOW);
		Position ld2 = new Position(PositionEnum.ld, 1, 8, WorkRate.MEDIUM, WorkRate.MEDIUM);
		Position ld3 = new Position(PositionEnum.ld, 1, 10, WorkRate.LOW, WorkRate.HIGH);
		
		Position rd1 = new Position(PositionEnum.ld, 3, 6, WorkRate.HIGH, WorkRate.LOW);
		Position rd2 = new Position(PositionEnum.ld, 3, 8, WorkRate.MEDIUM, WorkRate.MEDIUM);
		Position rd3 = new Position(PositionEnum.ld, 3, 10, WorkRate.LOW, WorkRate.HIGH);
		
		Position gk = new Position(PositionEnum.gk, 2, 12, WorkRate.LOW, WorkRate.HIGH);
		
		addPosition(lw1);
		addPosition(lw2);
		addPosition(lw3);
		addPosition(rw1);
		addPosition(rw2);
		addPosition(rw3);
		addPosition(c1);
		addPosition(c2);
		addPosition(c3);
		addPosition(ld1);
		addPosition(ld2);
		addPosition(ld3);
		addPosition(rd1);
		addPosition(rd2);
		addPosition(rd3);
		addPosition(gk);

	}
		
}

