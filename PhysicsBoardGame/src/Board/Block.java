package Board;

public class Block {
	
	private boolean occupied;

	public Block() {}

	public void stepOn() {
		this.occupied = true;
	}

	public void stepOff() {
		this.occupied = false;
	}
	
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
}
