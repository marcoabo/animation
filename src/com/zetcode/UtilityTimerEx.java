package com.zetcode;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class UtilityTimerEx extends JFrame{
	private static final long serialVersionUID = 1L;

	public UtilityTimerEx() {
		initUI();
	}
	
	public void initUI() {
		add(new Board());
		
		setResizable(false);
		pack();
		
		setTitle("Star");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() ->{
			JFrame ex = new UtilityTimerEx();
			ex.setVisible(true);			
		});
	}
}
