package ui;

import java.awt.Graphics;

import javax.swing.JPanel;

import blocks.Block;
import blocks.LBlock;

public class TestPanel extends JPanel{
	Block[] blocks;
	
	public TestPanel(){
		super();
		addBlocks();
	}
	
	private void addBlocks(){
		blocks = new Block[1];
		blocks[0] = new LBlock(1,1);
	}
	
	public void paintComponent(Graphics g){
		System.out.println("Hey!");
		super.paintComponent(g);
		for(int i = 0; i < blocks.length; i++){
			blocks[i].draw(g, new int[]{20,20});
		}
	}
}
