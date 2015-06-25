package blocks;

import java.awt.Color;
import java.awt.Graphics;

import misc.Constellation;
import misc.Position;

public class Block {
	public Position pos = new Position (0, 0);
	public Color color = Color.red;
	public int[] size = new int[2];
	public Constellation[] constellations;
	public Constellation currentConstellation;
	public Position[] blockedPositions;
	
	public Block(int x, int y){
		pos = new Position(x,y);
		addPixels();
		currentConstellation = constellations[0];
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
		if (currentConstellation.getPixels() != null){ //TODO: fix me better
			System.out.println("Ich sollte jetzt was zeichnen...");
			for (int i = 0; i < currentConstellation.getPixels().length; i++){
				g.fillRect((pos.getX() + currentConstellation.getPixels()[i].getX())*blockSize[0],
						(pos.getY() + currentConstellation.getPixels()[i].getY())*blockSize[1], blockSize[0], blockSize[1]);
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
		System.out.println("clacBlocked");
		blockedPositions = new Position[currentConstellation.getPixels().length];
		for (int i = 0; i < currentConstellation.getPixels().length; i++){
			blockedPositions[i] = new Position(pos.getX() + currentConstellation.getPixels()[i].getX(),
					pos.getY() + currentConstellation.getPixels()[i].getY());
		}
	}
	
	public Position[] getBlockedPositions(){
		return blockedPositions;
	}
}