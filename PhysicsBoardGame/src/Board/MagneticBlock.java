package Board;

public class MagneticBlock extends Block{

	private int magneticFieldStrength;
	private boolean upwards;
	
	public MagneticBlock(int magneticFieldStrength, boolean upwards) {
		
		this.magneticFieldStrength = magneticFieldStrength;
		this.upwards = upwards;
	}
	
	public void stepOn(int velocity) {
		
	}
	
	@Override
	public void stepOff() {
		
	}


}
