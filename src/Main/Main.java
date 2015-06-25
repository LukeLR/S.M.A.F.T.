package Main;

import blocks.*;

import java.awt.Color;

import misc.Position;
import ui.TestWindow;
import blocks.Block;

public class Main{
	boolean[][] statBlocks = new boolean[50][50];
	
	public static void main(String[] args){
		Main m = new Main();
		TestWindow t = new TestWindow();
		new GameEngine(m, t).start();
	}
	
	public boolean[][] getStats(){
		return statBlocks;
	}
	
	public boolean getFilled(int x, int y){
		return statBlocks[x][y];
	}
	
	public void setFilled(int x, int y, boolean c){
		statBlocks[x][y] = c;
	}
}
