package Board;

import java.util.ArrayList;

import Player.Player;

public class MagneticBlock extends Block{

	private int magneticFieldStrength;
	private boolean upwards;
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public MagneticBlock(int magneticFieldStrength, boolean upwards) {
		
		this.magneticFieldStrength = magneticFieldStrength;
		this.upwards = upwards;
	}
	
	public void stepOn(Player player, int velocity) {
		this.players.add(player);
	}
	
	@Override
	public void stepOff(Player player) {
		this.players.remove(player);
	}


}
