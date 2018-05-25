package Board;

import java.util.ArrayList;
import Player.*;

public class Block {
	
	private ArrayList<Player> players = new ArrayList<Player>();

	public Block() {}

	public void stepOn(Player player) {
		this.players.add(player);
	}

	public void stepOff(Player player) {
		this.players.remove(player);
	}
	
}
