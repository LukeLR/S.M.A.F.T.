package blocks;

import java.awt.Color;

public class ZBlock extends Block{
	
	
	public ZBlock(int x, int y){
		super(x,y);
		addPixels();
	}
	
	public ZBlock(int x, int y, Color color){
		super(x,y,color);
		addPixels();
	}
	
	private void addPixels(){
		pixels = new Pixel[4];
		pixels[0] = new Pixel(0,0);
		pixels[1] = new Pixel(1,0);
		pixels[2] = new Pixel(1,1);
		pixels[3] = new Pixel(2,1);
	}
}
