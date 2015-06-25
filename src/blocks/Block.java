package blocks;

import java.awt.Color;
import java.awt.Graphics;
import misc.Position;

public class Block {
	public Position pos = new Position (0, 0);
	public Color color = Color.red;
	public int[] size = new int[2];
	public Pixel[] pixels;
	public Position[] blockedPositions;
	
	public Block(int x, int y){
		pos = new Position(x,y);
		addPixels();
		calcBlocked();
	}
	
	public Block(int x, int y, Color color){
		pos = new Position(x,y);
		this.color = color;
		addPixels();
		calcBlocked();
	}
	
	public void setX(int x){
		pos.setX(x);
		calcBlocked();
	}
	
	public void setY(int y){
		pos.setY(y);
		calcBlocked();
	}
	
	public void setPos(int x, int y){
		pos.setPos(x,y);
		calcBlocked();
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public int getX(){
		return pos.getX();
	}
	
	public int getY(){
		return pos.getY();
	}
	
	public Color getColor(){
		return color;
	}
	
	void addPixels(){
		//only used by subclasses to form the individual block out of single pixels.
	}
	
	public void draw(Graphics g, int[] blockSize){
		g.setColor(color);
		if (pixels != null){ //TODO: fix me better
			System.out.println("Ich sollte jetzt was zeichnen...");
			for (int i = 0; i < pixels.length; i++){
				g.fillRect((pos.getX() + pixels[i].getX())*blockSize[0], (pos.getY() + pixels[i].getY())*blockSize[1], blockSize[0], blockSize[1]);
			}
		}
	}
	
	public boolean containsPos(int x, int y){
		boolean result = false;
		
		/*for (int i = 0; i < pixels.length; i++){
			if (
				(x == pos.getX() + pixels[i].getX()) &&
				(y == pos.getY() + pixels[i].getY())
			){
				result = true;
			}
		}*/
		
		Position testPos = new Position(x, y);
		
		for (int i = 0; i < blockedPositions.length; i++){
			if (blockedPositions[i].equals(testPos)){
				result = true;
			}
		}
		return result;
	}
	
	public void calcBlocked(){
		blockedPositions = new Position[pixels.length];
		for (int i = 0; i < pixels.length; i++){
			blockedPositions[i] = new Position(pos.getX() + pixels[i].getX(),pos.getY() + pixels[i].getY());
		}
	}
	
	public Position[] getBlockedPositions(){
		return blockedPositions;
	}
}