package blocks;

import java.awt.Color;

public class Block {
	public int x = 0;
	public int y = 0;
	public Color color;
	public int[] size = new int[2];
	
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
}
