package Board;

import java.util.ArrayList;

import Player.Player;

public class AccelerationBlock extends Block {

	private int acceleration; //For one second
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public AccelerationBlock(int acceleration) {
		this.acceleration = acceleration;
	}
	
	public void stepOn(Player player) {
		this.players.add(player);
		player.setVelocity(player.getVelocity() + this.acceleration);
	}
	
	public void stepOff(Player player) {
		this.players.remove(player);
	}
}
