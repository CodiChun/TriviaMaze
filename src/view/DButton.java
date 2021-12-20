package view;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DButton extends JButton{

	/**
	 * 
	 */
	private static final long serialVersionUID = -280116855087175764L;
	
	public DButton(String theName) {
        super(theName);
        setContentAreaFilled(false);
        //setFocusPainted(false); 

	}
	
	
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setPaint(new GradientPaint(
                new Point(0, 0), 
                getBackground(), 
                new Point(0, getHeight()/3), 
                Color.blue));
        
        g2.fillRect(0, 0, getWidth(), getHeight()/3);
        
        g2.setPaint(new GradientPaint(
                new Point(0, getHeight()/3), 
                Color.blue, 
                new Point(0, getHeight()), 
                getBackground()));
        
        g2.fillRect(0, getHeight()/3, getWidth(), getHeight());
        g2.dispose();

        super.paintComponent(g);
    }




}
