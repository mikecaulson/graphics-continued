package graphicscont;

import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
 
public class chall2cont1 extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
    		chall2cont1 canvas = new chall2cont1();
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
    		for (int i = 0; i<255;i++)
    			{
    				delay();
    				graphics.setColor(new Color(i,0,0));
    				graphics.fillRect(0, 0, 50, 50);
    				graphics.setColor(Color.white);
    			}
    		for (int j = 0; j<255;j++)
    			{
    				delay();
    				graphics.setColor(new Color(0,j,0));
    				graphics.fillRect(0, 0, 50, 50);
    				graphics.setColor(Color.white);
    			}
    		for (int t = 0; t<255;t++)
    			{
    				delay();
    				graphics.setColor(new Color(0,0,t));
    				graphics.fillRect(0, 0, 50, 50);
    				graphics.setColor(Color.white);
    			}
//   This is just for fun, not apart of the code. 		
//				for (int r = 0; r<165;r++)
//    			{
//    				int a= (int)(Math.random()*255)+1;
//    	    		int b =(int)(Math.random()*255)+1;
//    	    		int c= (int)(Math.random()*255)+1;
//    				graphics.setColor(new Color(a,b,c));
//
//    				graphics.fillRect(r, r, r*2, r*2);
//    				delay1();
//    				graphics.setColor(new Color(a,b,c));
//    				graphics.fillRect(r, r, r*2, r*2);
//    			}
//    		for (int c=0;c<350;c++)
//    			{
//    				int a= (int)(Math.random()*255)+1;
//    	    		int b =(int)(Math.random()*255)+1;
//    	    		int e= (int)(Math.random()*255)+1;
//    				graphics.setColor(new Color(a,b,e));
//
//    				graphics.fillOval(-c, -c, -c*2, -c*2);
//    				delay1();
//    				graphics.setColor(new Color(a,b,c));
//    				graphics.fillOval(-c, -c, -c*2, -c*2);
//    			}
    		for (int r = 0; r<455;r++)
    			{
    				int a= (int)(Math.random()*255)+1;
    	    		int b =(int)(Math.random()*255)+1;
    	    		int c= (int)(Math.random()*255)+1;
    				graphics.setColor(new Color(a,b,c));

    				graphics.fillRect(r, r, 20, 20);
    				delay1();
    				graphics.setColor(new Color(a,b,c));
    				graphics.fillRect(r, r, 20, 20);
    			}
    		for (int n=0;n<200;n++)
    			{
    				int v=480;
    				int y=480;
    				int w= (int)(Math.random()*255)+1;
    	    		int d =(int)(Math.random()*255)+1;
    	    		int f= (int)(Math.random()*255)+1;
    				graphics.setColor(new Color(w,d,f));
    				graphics.fillRect(v, y, 20, 20);
    				delay1();
    				v=v-1;
    			}
    	}
		private void delay()
			{
				try 
					{
						Thread.sleep(5);                 //1000 milliseconds is one second.
					} 
				catch(InterruptedException ex)
					{
						Thread.currentThread().interrupt();
					}
			}
		private void delay1()
			{
				try 
					{
						Thread.sleep(20);                 //1000 milliseconds is one second.
					} 
				catch(InterruptedException ex)
					{
						Thread.currentThread().interrupt();
					}
			}
	}