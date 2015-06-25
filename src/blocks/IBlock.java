package blocks;

import java.awt.Color;

import misc.Constellation;

public class IBlock extends Block{
	
	
	public IBlock(int x, int y){
		super(x,y);
	}
	
	public IBlock(int x, int y, Color color){
		super(x,y,color);
	}
	
	void addPixels(){
		constellations = new Constellation[2];
		constellations[0] = new Constellation(new Pixel[]{new Pixel(0,0), new Pixel(0,1), new Pixel(0,2), new Pixel(0,3)});
		constellations[1] = new Constellation(new Pixel[]{new Pixel(-1,0), new Pixel(0,0), new Pixel(1,0), new Pixel(2,0)});
	}
}
