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
	TestWindow tw;
    private int fallspeed = 200;
	
	public GameEngine(Main m, TestWindow tw){
		this.m = m;
		this.tw = tw;
	}
	
	public void run(){
		Block b = newBlock();
		//die zentrale while-Schleife
		do {
            tw.tp.addBlock(b);
            while(moveDown(b)){
                tw.tp.repaint();
                try {
                    Thread.sleep(fallspeed);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Position[] pp = b.getBlockedPositions();
            if(pp!=null) for(Position p : pp) {
                if(p.getX() < 50 && p.getY() < 50){
                    m.setFilled(p.getX(), p.getY(), true);
                }
            }
            b = newBlock();
        } while(b != null); //b==null => neuer Block kann nicht mehr generiert werden
	}
	
	private Block newBlock() {
		//Zufälligen Block auswählen
		Block[] blocks = new Block[]{
			new IBlock(0, 0, Color.RED),
			new LBlock(0, 0, Color.RED),
			new SBlock(0, 0, Color.RED),
			new SqBlock(0, 0, Color.RED),
			new TBlock(0, 0, Color.RED),
			new ZBlock(0, 0, Color.RED)
		};

		Block result = blocks[(int)(Math.random()*6)];
		
		//überprüfen ob der block sich dem Spielfeld hinzufügen lässt
		Position[] pp = result.getBlockedPositions();
		if(pp!=null) for(Position p : pp){
			if(m.getFilled(p.getX(), p.getY())) return null;
		}
		
		return result;
	}

	private boolean moveDown(Block b) {
        Position[] pp = b.getBlockedPositions();
		
		//überprüfen ob der Block noch im Feld ist
		if(pp!=null) for(Position p : pp){
			int x = p.getX(), y = p.getY();
            if(0 > y || y > 49 || 0 > x || x > 49) return false;
		}

        //überprüfen ob der Block noch passt
        if(pp!=null) for(Position p : pp) {
            if(p.getX() < 50 && p.getY() + 1 < 50){
                if (m.getFilled(p.getX(), p.getY() + 1)) return false;
            } else return false;
        }

        b.setY(b.getY() + 1);
		return true;
	}
}
