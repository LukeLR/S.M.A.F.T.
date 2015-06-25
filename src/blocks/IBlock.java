package blocks;

import java.awt.Color;

public class IBlock extends Block{
	
	
	public IBlock(int x, int y){
		super(x,y);
		addPixels();
	}
	
	public IBlock(int x, int y, Color color){
		super(x,y,color);
		addPixels();
	}
	
	private void addPixels(){
		pixels = new Pixel[4];
		pixels[0] = new Pixel(0,0);
		pixels[1] = new Pixel(0,1);
		pixels[2] = new Pixel(0,2);
		pixels[3] = new Pixel(0,3);
	}
}
