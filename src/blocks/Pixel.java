package blocks;

import java.awt.Color;

public class Pixel {
	public int x;
	public int y;
	public Color color;
	
	public void Pixel(){
		
	}
	
	public void Pixel (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void Pixel (int x, int y, Color color){
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
