package graphicscont;
import java.awt.*;
import javax.swing.*;

public class Image extends JFrame
{
    public static void main ( String [] args )
    {
        // frame
        JFrame frame = new Image();
        frame.setSize ( 1000, 1000 );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setTitle( "Remembory" );
        frame.setVisible( true );
    }

    class Gifpaneel extends JPanel{
        private ImageIcon gif, animatedGif;

        public Gifpaneel() {
            gif = new ImageIcon( "pug.jpg" );
            animatedGif = new ImageIcon( "pug.jpg" );
        }       

        public void paintComponent( Graphics g ){
            super.paintComponent( g );

            gif.paintIcon( this, g, 100, 100 );
            animatedGif.paintIcon ( this, g, 250, 100 );
        }

    }
}