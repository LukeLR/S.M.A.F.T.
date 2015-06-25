package Main;

import blocks.*;
import java.awt.Color;
import ui.TestWindow;
import blocks.Block;

public class Main {
	Color[][] statBlocks = new Color[50][50];
	
	public static void main(String[] args){
		new Main();
	}
	
	public Main(){
		new TestWindow();
	}
	
	public void newGame(){
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
		Position[] pp = b.getBlockedPosition();
		if(pp!=null) for(Position p : pp){
			if(statBlocks[p.getX()][p.getY()] != null) return null
		}
		
		return result;
	}

	private boolean moveDown(Block b) {
		b.setY(b.getY() + 1);
		
		//überprüfen ob der Block noch passt

		
		return true;
	}
}
