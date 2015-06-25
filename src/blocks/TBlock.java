package blocks;

import java.awt.Color;

public class TBlock extends Block {
	
	
	public TBlock(int x, int y){
		super(x,y);
	}
	
	public TBlock(int x, int y, Color color){
		super(x,y,color);
	}
	
	void addPixels(){
		pixels = new Pixel[5];
		pixels[0] = new Pixel(0,0);
		pixels[1] = new Pixel(1,0);
		pixels[2] = new Pixel(2,0);
		pixels[3] = new Pixel(1,1);
		pixels[4] = new Pixel(1,2);
	}
}