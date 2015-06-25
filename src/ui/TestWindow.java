package ui;

import javax.swing.*;

public class TestWindow extends JFrame{

    public TestPanel tp;
	
	public TestWindow(){
		super("S.M.A.F.T. beta");
        tp = new TestPanel();
		this.setContentPane(tp);
		this.setSize(600, 600);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
