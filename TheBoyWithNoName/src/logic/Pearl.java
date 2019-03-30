package logic;

public class Pearl extends Block{
	private boolean alive;
	

	public Pearl(int row, int col, Tile tile) {
		super(row, col, tile);
		alive = true;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public void die() {
		alive = false;
		this.setTile(null);
		//make fish disappear
	}
	
}
