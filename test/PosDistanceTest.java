import java.util.ArrayList;

import org.junit.Test;

public class PosDistanceTest {

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
	
	@Test
	public void calcPosDistanceTest() {
		
		ArrayList<Position> positionList;
		PositionList posList = new PositionList();
		
		posList.addAllPositions();
		positionList = posList.getPositionList();
		
		for (Position pos1 : positionList) {
			for (Position pos2 : positionList) {
				if (pos1.getPos() != pos2.getPos()) {
					PosDistance posDistance = new PosDistance(pos1, pos2, 0);
					double distance = posDistance.calcPosDistance(pos1, pos2);
					System.out.println(pos1.getPos() + " / " + pos2.getPos() + " --- distance: " + distance);
				}
			}	
		}
	}
	
	
}
