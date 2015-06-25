package blocks;

import java.awt.Color;

public class SqBlock extends Block{
	
	
	public SqBlock(int x, int y){
		super(x,y);
	}
	
	public SqBlock(int x, int y, Color color){
		super(x,y,color);
	}
	
	void addPixels(){
		pixels = new Pixel[4];
		pixels[0] = new Pixel(0,0);
		pixels[1] = new Pixel(1,0);
		pixels[2] = new Pixel(0,1);
		pixels[3] = new Pixel(1,1);
	}
}
