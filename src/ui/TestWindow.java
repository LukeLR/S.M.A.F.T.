package ui;

import javax.swing.*;

public class TestWindow extends JFrame{
	
	
	public TestWindow(){
		super("S.M.A.F.T. beta");
		this.setContentPane(new TestPanel());
		this.setSize(500, 500);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
