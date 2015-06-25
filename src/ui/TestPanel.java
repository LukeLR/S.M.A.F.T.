package ui;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import blocks.Block;
import blocks.LBlock;
import blocks.IBlock;
import blocks.SBlock;
import blocks.SqBlock;
import blocks.TBlock;
import blocks.ZBlock;

public class TestPanel extends JPanel{

    ArrayList<Block> blocks;
	
	public TestPanel(){
		super();
        blocks = new ArrayList<Block>();
	}

    public void addBlock(Block b){
       blocks.add(b);
    }
	
	public void paintComponent(Graphics g){
		System.out.println("Hey!");
		super.paintComponent(g);
        for(Block b : blocks){
            b.draw(g, new int[]{10, 10});
        }
	}
}
