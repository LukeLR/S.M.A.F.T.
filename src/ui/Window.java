package ui;

import javax.swing.JFrame;

public class Window extends JFrame{
	
	
	public Window(){
		super("S.M.A.F.T. beta");
		this.setContentPane(new Panel());
		this.setSize(500,500);
		this.setVisible(true);
	}
}
