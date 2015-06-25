package blocks;

import java.awt.Color;

public class Block {
	public int x = 0;
	public int y = 0;
	public Color color = Color.red;
	public int[] size = new int[2];
	public Pixel[] pixels;
	
	public Block(){
		
	}
	
	public Block(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Block(int x, int y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setPos(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Color getColor(){
		return color;
	}
	
	private void getPixels(){
		//only used by subclasses to form the individual block out of single pixels.
	}
}
