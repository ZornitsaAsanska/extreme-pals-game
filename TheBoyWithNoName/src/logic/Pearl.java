package logic;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;

import intermediary.Settings;

public class Pearl extends Block{
	private boolean alive;
	private Image pic;
	

	

	public Pearl(int row, int col, Tile tile) {
		super(row, col, tile);
		alive = true;
		
	    try {
	        this.pic = ImageIO.read(getClass().getResource(Settings.tileImage("Pearl.png")));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    this.pic = pic.getScaledInstance(Settings.TILE_SIZE, Settings.TILE_SIZE, Image.SCALE_SMOOTH);
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
