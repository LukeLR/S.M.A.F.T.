package ui;

import javax.swing.JFrame;

public class TestWindow extends JFrame{
	
	
	public TestWindow(){
		super("S.M.A.F.T. beta");
		this.setContentPane(new TestPanel());
		this.setSize(500,500);
		this.setVisible(true);
	}
}