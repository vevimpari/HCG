import java.util.ArrayList;

public class PosDistance {
	Position posFrom;
	Position posTo;
	double distance;
	public ArrayList<PosDistance> posDistances;

	
	public PosDistance(Position pos1, Position pos2, double distance) {
		this.posFrom = pos1;
		this.posTo = pos2;
		this.distance = distance;
	}
	
	public Position getPosFrom() {
		return posFrom;
	}

	public void setPosFrom(Position posFrom) {
		this.posFrom = posFrom;
	}

	public Position getPosTo() {
		return posTo;
	}

	public void setPosTo(Position posTo) {
		this.posTo = posTo;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public ArrayList<PosDistance> getPosDistances() {
		return posDistances;
	}

	public void setPosDistances(ArrayList<PosDistance> posDistances) {
		this.posDistances = posDistances;
	}

	public double calcPosDistance(Position position1, Position position2) {
		
		int p1x = position1.getxCoord();
		int p1y = position1.getyCoord();
		int p2x = position2.getxCoord();
		int p2y = position2.getyCoord();
		
		double distance = Math.hypot(p1x-p2x, p1y-p2y);
		
		return distance;
	}
		
}
