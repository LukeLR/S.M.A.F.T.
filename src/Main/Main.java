package Main;

import ui.Window;
import blocks.Block;

public class Main {
	public static void main(String[] args){
		new Main();
	}
	
	public Main(){
		new Window();
	}
	
	public void newGame(){
		Block b = null;
		
		do {
		b = newBlock();
		} while(moveDown(b));
	}
	
	private Block newBlock() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean moveDown(Block b) {
		// TODO Auto-generated method stub
		return false;
	}
}