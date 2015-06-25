package blocks;

import java.awt.Color;

import misc.Constellation;

public class LBlock extends Block {
	
	
	public LBlock(int x, int y){
		super(x,y);
	}
	
	public LBlock(int x, int y, Color color){
		super(x,y,color);
	}
	
	void addPixels(){
		constellations = new Constellation[4];
		constellations[0] = new Constellation(new Pixel[]{new Pixel(0,0), new Pixel(0,1), new Pixel(0,2), new Pixel(1,2)});
		constellations[1] = new Constellation(new Pixel[]{new Pixel(0,1), new Pixel(0,0), new Pixel(1,0), new Pixel(2,0)});
		constellations[2] = new Constellation(new Pixel[]{new Pixel(0,0), new Pixel(1,0), new Pixel(1,1), new Pixel(1,2)});
		constellations[3] = new Constellation(new Pixel[]{new Pixel(0,1), new Pixel(1,1), new Pixel(2,1), new Pixel(2,0)});
	}
}
