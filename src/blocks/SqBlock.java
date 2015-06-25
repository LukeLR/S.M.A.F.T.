package blocks;

import java.awt.Color;

import misc.Constellation;

public class SqBlock extends Block{
	
	
	public SqBlock(int x, int y){
		super(x,y);
	}
	
	public SqBlock(int x, int y, Color color){
		super(x,y,color);
	}
	
	void addPixels(){
		constellations = new Constellation[1];
		constellations[0] = new Constellation(new Pixel[]{new Pixel(0,0), new Pixel(1,0), new Pixel(0,1), new Pixel(1,1)});
	}
}
