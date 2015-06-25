package Main;

import blocks.*;

import java.awt.Color;

import misc.Position;
import ui.TestWindow;
import blocks.Block;

public class Main{
	Color[][] statBlocks = new Color[50][50];
	
	public static void main(String[] args){
		Main m = new Main();
		TestWindow t = new TestWindow();
		new GameEngine(m, t);
	}
	
	public Color[][] getStats(){
		return statBlocks;
	}
	
	public Color getColor(int x, int y){
		return statBlocks[x][y];
	}
	
	public void setColor(int x, int y, Color c){
		statBlocks[x][y] = c;
	}
}
