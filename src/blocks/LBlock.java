package blocks;

import java.awt.Color;

public class LBlock extends Block {
	
	
	public LBlock(int x, int y){
		super(x,y);
	}
	
	public LBlock(int x, int y, Color color){
		super(x,y,color);
	}
	
	private void addPixels(){
		pixels = new Pixel[4];
		pixels[0] = new Pixel(0, 0);
		pixels[1] = new Pixel(0, -1);
		pixels[2] = new Pixel(0, -2);
		pixels[3] = new Pixel(1, -2);
	}
}
