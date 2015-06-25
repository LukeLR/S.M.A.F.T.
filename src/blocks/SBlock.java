package blocks;

public class SBlock extends Block{
	
	
	public SBlock(int x, int y){
		super(x,y);
	}
	
	public SBlock(int x, int y, Color color){
		super(x,y,color);
	}
	
	private void addPixels(){
		pixels = new Pixel[4];
		pixels[0] = new Pixel(0,1);
		pixels[1] = new Pixel(1,1);
		pixels[2] = new Pixel(1,0);
		pixels[3] = new Pixel(2,0);
	}
}
