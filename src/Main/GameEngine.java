package Main;

import java.awt.Color;

import misc.Position;
import ui.TestWindow;
import blocks.Block;
import blocks.IBlock;
import blocks.LBlock;
import blocks.SBlock;
import blocks.SqBlock;
import blocks.TBlock;
import blocks.ZBlock;

public class GameEngine extends Thread{
	Main m;
	TestWindow t;
	
	public GameEngine(Main m, TestWindow t){
		this.m = m;
		this.t = t;
	}
	
	public void run(){
		Block b = null;
		
		//die zentrale while-Schleife
		do {
		b = newBlock();
		} while(b != null && moveDown(b)); //b==null => neuer Block kann nicht mehr generiert werden
	}
	
	private Block newBlock() {
		//Zufälligen Block auswählen
		Block[] blocks = new Block[]{
			new IBlock(25, 0, Color.RED),
			new LBlock(25, 0, Color.RED),
			new SBlock(25, 0, Color.RED), 
			new SqBlock(25, 0, Color.RED), 
			new TBlock(25, 0, Color.RED), 
			new ZBlock(25, 0, Color.RED)
		};

		Block result = blocks[(int)Math.random()*6];
		
		//überprüfen ob der block sich dem Spielfeld hinzufügen lässt
		Position[] pp = result.getBlockedPositions();
		if(pp!=null) for(Position p : pp){
			if(m.getColor(p.getX(), p.getY()) != null) return null;
		}
		
		return result;
	}

	private boolean moveDown(Block b) {
		b.setY(b.getY() + 1);
		
		//überprüfen ob der Block noch passt
		Position[] pp = b.getBlockedPositions();
		if(pp!=null) for(Position p : pp){
			if(m.getColor(p.getX(), p.getY()) != null) return false;
		}
		
		//überprüfen ob der Block noch im Feld ist
		if(pp!=null) for(Position p : pp){
			int x = p.getX(), y = p.getY();
			if(0 < y && y < 50 && 0 < x && x < 50) return false;
		}
		
		return true;
	}
}
