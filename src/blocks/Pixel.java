package blocks;

import misc.Position;

public class Pixel {
	private Position pos = new Position(0, 0);
	
	public Pixel (int x, int y){
		pos = new Position(x, y,);
	}
	
	public void setX(int x){
		pos.setX(x);
	}
	
	public void setY(int y){
		pos.setY(y);
	}
	
	public void setPos(int x, int y){
		pos.setPos(x,y);
	}
	
	public int getX(){
		return pos.getX();
	}
	
	public int getY(){
		return pos.getY();
	}
}