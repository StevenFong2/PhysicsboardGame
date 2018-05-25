package Player;

public class Player {
	
	private int position;
	private int velocity = 1;
	
	public Player() {
		
	}
	
	public void move(int num) {
		this.position += num;
	}
	
	public int getVelocity() {
		return this.velocity;
	}
	
	public void setVelocity(int newvelocity) {
		this.velocity = newvelocity;
	}
	
	public boolean equals(Object obj) {
		if ((Player)obj == null || !(obj instanceof Player)) 
			return false;
		return (Player)obj == this;
	}

}
