package graphicscont;

import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
 
public class Strings extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
    		Strings canvas = new Strings();
	        JFrame frame = new JFrame();
	        frame.setSize(500, 500);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(false);
	        frame.setVisible(true);
    		}
    	public void paint(Graphics graphics)
    	{
    		boolean rerun =true;
    		int q =0;
    		while (rerun)
    			{
    		for (int i=0;i<430;i++)
    			{
    				int a= (int)(Math.random()*255)+1;
    				int b =(int)(Math.random()*255)+1;
    				int c= (int)(Math.random()*255)+1;
    				graphics.setColor(new Color(a,b,c)); 
    				graphics.drawString("Hello There", i, i);
    				delay();
    			}
    		int v=429;
			int g = 430;
    		for (int j=0;j<420;j++)
    			{
    				
    				int a = (int)(Math.random()*255)+1;
    				int b = (int)(Math.random()*255)+1;
    				int c = (int)(Math.random()*255)+1;
    				graphics.setColor(new Color(a,b,c)); 
    				graphics.drawString("Hello There", g, v);
    				v=v-1;
    				delay();
    				
    			}
//    		v=10;
//			g = 430;
    		for (int w=0;w<430;w++)
    			{
    				
    				int a = (int)(Math.random()*255)+1;
    				int b = (int)(Math.random()*255)+1;
    				int c = (int)(Math.random()*255)+1;
    				graphics.setColor(new Color(a,b,c)); 
    				graphics.drawString("Hello There", g, v);
    				g=g-1;
    				delay();
    				
    			}
//    		int v=429;
//			int g = 430;
    		for (int j=0;j<463;j++)
    			{
    				
    				int a = (int)(Math.random()*255)+1;
    				int b = (int)(Math.random()*255)+1;
    				int c = (int)(Math.random()*255)+1;
    				graphics.setColor(new Color(a,b,c)); 
    				graphics.drawString("Hello There", g, v);
    				v=v+1;
    				delay();
    				
    			}
    		for (int w=0;w<432;w++)
    			{
    				
    				int a = (int)(Math.random()*255)+1;
    				int b = (int)(Math.random()*255)+1;
    				int c = (int)(Math.random()*255)+1;
    				graphics.setColor(new Color(a,b,c)); 
    				graphics.drawString("Hello There", g, v);
    				g=g+1;
    				delay();
    				
    			}
    		for (int j=0;j<463;j++)
    			{
    				
    				int a = (int)(Math.random()*255)+1;
    				int b = (int)(Math.random()*255)+1;
    				int c = (int)(Math.random()*255)+1;
    				graphics.setColor(new Color(a,b,c)); 
    				graphics.drawString("Hello There", g, v);
    				v=v-1;
    				delay();
    			}
    		
    		q=q+1;
    		if (q==5)
    			{
    				rerun=false;
    			}
    			}
    		
    	}
		private void delay()
			{
				
						try 
							{
								Thread.sleep(2);                 //1000 milliseconds is one second.
							} 
						catch(InterruptedException ex)
							{
								Thread.currentThread().interrupt();
							}
					
			}
	}