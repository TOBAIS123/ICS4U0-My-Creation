/*
* Erfan Yeganhefar
* Ms.Krasteva
* Oct 15 2018
* This program outputs a background of a cemetery using multiple loops
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class

public class BackgroundCemetery
{
    //global variable used to pass the object to the main console
    Console c;

    //class to make the background
    public void draw ()
    {
	//local instances of Color used for different colours used in BackgroundCemetery
	Color nightSky = new Color (10, 17, 80);
	Color WindowTint = new Color (0, 9, 17);
	Color grayRock = new Color (61, 54, 51);
	Color slateGray = new Color (112, 128, 144);
	Color lightGray = new Color (149, 151, 155);
	Color pillar = new Color (28, 27, 27);
	Color darkGray = new Color (84, 86, 89);
	Color darkGray2 = new Color (38, 37, 37);
	Color lightYellow = new Color (238, 255, 0);
	Color lightGrayGrave = new Color (168, 163, 167);

	//loop used to make the night sky and the street
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (nightSky);
	    c.drawLine (x, 0, x, 260); //the sky
	    c.setColor (lightGray);
	    c.drawLine (x, 260, x, 500); //the street
	}

	//loop used to create the building
	for (int x = 0 ; x < 120 ; x++)
	{
	    c.setColor (slateGray);
	    c.drawLine (0 + x, 70, 0 + x, 260); //main building
	}

	//loop used to create the graves
	for (int x = 0 ; x < 20 ; x++)
	{
	    //graveyard graves
	    c.setColor (lightGrayGrave);
	    c.drawLine (200, 240 + x, 220, 240 + x);
	    c.drawLine (280, 240 + x, 300, 240 + x);
	    c.drawLine (380 + x, 230, 380 + x, 260);
	    c.setColor (grayRock);
	    c.drawLine (300 + x, 230, 300 + x, 260);
	    c.drawLine (230 + x, 230, 230 + x, 260);
	    //The obelisk
	    c.setColor (darkGray2);
	    c.drawLine (320, 240 + x, 360, 240 + x);
	    c.drawLine (330, 230 + x, 350, 230 + x);


	}

	//loop used to create the building windows
	for (int x = 0 ; x < 30 ; x++)
	{
	    //building windows
	    c.setColor (WindowTint);
	    c.drawLine (0, 100 + x, 40, 100 + x);
	    c.setColor (lightYellow);
	    c.drawLine (0, 160 + x, 40, 160 + x);
	    c.setColor (WindowTint);
	    c.drawLine (0, 220 + x, 40, 220 + x);
	    c.setColor (WindowTint);
	    c.drawLine (60, 100 + x, 100, 100 + x);
	    c.drawLine (60, 160 + x, 100, 160 + x);
	    c.setColor (lightYellow);
	    c.drawLine (60, 220 + x, 100, 220 + x);

	}

	//loop used to create the graveyard enterance and the top of the obelisk
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.setColor (pillar);
	    c.drawLine (160 + x, 170, 160 + x, 260);
	    c.drawLine (250 + x, 170, 250 + x, 260);
	    c.drawLine (160, 170 - x, 260, 170 - x);
	    c.drawLine (420 + x, 190, 420 + x, 260);
	    //c.setColor (lightGrayGrave);
	    //c.drawArc (210 + x/2, 250, 10 + x, 10, 0, 180);

	}

	//loop used to make a separation between the street and houses
	for (int x = 0 ; x < 440 ; x++)
	{
	    c.setColor (darkGray);
	    c.drawLine (x, 260, x, 290);
	}
    }


    //passes the drawing onto a main console and executes it
    public BackgroundCemetery (Console con)
    {
	c = con;
	draw ();
    }
}


