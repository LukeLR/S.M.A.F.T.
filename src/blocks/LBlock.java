package blocks;

import java.awt.Color;

public class LBlock extends Block {
	
	
	public LBlock(){
		super();
	}
	
	public LBlock(int x, int y){
		super(x,y);
	}
	
	public LBlock(int x, int y, Color color){
		super(x,y,color);
	}
	
	private void addPixels(){
		pixels = new Pixel[4];
		pixels[0] = new Pixel(0, 0);
	}
}
