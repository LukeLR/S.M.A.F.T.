package ui;

import java.awt.Graphics;

import javax.swing.JPanel;

import blocks.Block;
import blocks.LBlock;
import blocks.IBlock;
import blocks.SBlock;
import blocks.SqBlock;
import blocks.TBlock;
import blocks.ZBlock;

public class TestPanel extends JPanel{
	Block[] blocks;
	
	public TestPanel(){
		super();
		addBlocks();
	}
	
	private void addBlocks(){
		blocks = new Block[6];
		blocks[0] = new LBlock(1,1);
		blocks[1] = new IBlock(5,1);
		blocks[2] = new SBlock(9,1);
		blocks[3] = new SqBlock(13,1);
		blocks[4] = new TBlock(17,1);
		blocks[5] = new ZBlock(21,1);
	}
	
	public void paintComponent(Graphics g){
		System.out.println("Hey!");
		super.paintComponent(g);
		for(int i = 0; i < blocks.length; i++){
			blocks[i].draw(g, new int[]{20,20});
		}
	}
}
