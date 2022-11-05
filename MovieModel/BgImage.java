package com.jsp.MovieModel;

import java.awt.*;
import javax.swing.*;

public class BgImage extends JFrame

{
	JLabel L1;
	
	public BgImage()
	
	{
		JFrame frame = new JFrame();
		
		setTitle("Bg Image");
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Alousi\\Downloads\\Bg Image.jpeg")));
	
		setLayout(new FlowLayout());
		L1 = new JLabel();
		add(L1);
		
		setSize(1080, 720);
		
	}

}
