/*
* Erfan Yeganhefar
* Ms.Krasteva
* Oct 15 2018
* This program outputs a background of a street using multiple loops
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class

public class BackgroundStreet
{
    //global variable used to pass the object to the main console
    private Console c;

    //class to make the background
    public void draw ()
    {
	//local instances of Color used for different colours within thebackground
	Color nightSky = new Color (10, 17, 80);
	Color evergreen = new Color (0, 48, 5);
	Color bushG1 = new Color (21, 96, 11);
	Color bushG2 = new Color (22, 170, 3);
	Color WindowTint = new Color (0, 9, 17);
	Color treeBark1 = new Color (45, 31, 0);
	Color grayRock = new Color (61, 54, 51);
	Color creamWall = new Color (145, 100, 20);
	Color houseRoof = new Color (60, 2, 100);
	Color lightGray = new Color (149, 151, 155);
	Color darkGray = new Color (84, 86, 89);
	Color darkBrown = new Color (35, 16, 1);

	//loop used to make the night sky and the street
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (nightSky);
	    c.drawLine (0 + x, 0, 0 + x, 260); //the sky
	    c.setColor (darkGray);
	    c.drawLine (0 + x, 260, 0 + x, 300); //seperation between the street and houses
	    c.setColor (lightGray);
	    c.drawLine (0 + x, 300, 0 + x, 500); //the street
	}

	//loop used to create the right house walls
	for (int x = 0 ; x < 100 ; x++)
	{
	    //house walls
	    c.setColor (creamWall);
	    c.drawLine (380 + x, 170, 380 + x, 260); //main house
	    c.drawLine (460 + x, 200, 460 + x, 260); //garage

	}

	//loop used to create the right house roofs
	for (int x = 0 ; x < 100 ; x++)
	{
	    //house roof
	    c.setColor (houseRoof);
	    c.drawLine (430, 110, 380 + x, 170); //main house roof
	    c.drawLine (510, 150, 460 + x, 200); //garage roof
	}
	c.setColor (Color.BLACK);
	c.drawRect (460, 200, 100, 60); //garage outline


	//loop used to create the walls for the left house
	for (int x = 0 ; x < 80 ; x++)
	{
	    c.setColor (creamWall);
	    c.drawLine (100, 180 + x, 220, 180 + x); //cream wall for left house
	}

	//loop used to create a green bush, evergreen leaves, and the garage door
	for (int x = 0 ; x < 60 ; x++)
	{
	    //green bush
	    c.setColor (bushG1);
	    c.drawRoundRect (20 + x, 220, 60 - 2 * x, 40, 10, 10);
	    c.drawOval (x, 200, 60 - 2 * x, 60);
	    //evergreen leaves
	    c.setColor (evergreen);
	    c.drawLine (270, 135, 240 + x, 160);
	    c.drawLine (270, 155, 240 + x, 180);
	    c.drawLine (270, 175, 240 + x, 200);
	    c.drawLine (270, 195, 240 + x, 220);
	    c.drawLine (270, 215, 240 + x, 240);
	    //garage door
	    c.setColor (lightGray);
	    c.drawLine (480 + x, 221, 480 + x, 259);
	}

	//loop used to create the door for both houses, a rock, and the moon
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (darkBrown);
	    c.drawLine (150, 220 + x, 170, 220 + x); //left door
	    c.drawLine (420, 220 + x, 440, 220 + x); //right door
	    //rock
	    c.setColor (grayRock);
	    c.drawOval (320 + x, 220, 40 - 2 * x, 40);
	    c.drawRoundRect (340 + x, 230, 30 - 2 * x, 30, 10, 10);
	    //moon
	    c.setColor (lightGray);
	    c.drawOval (500 + x, 0, 40 - 2 * x, 40);
	}


	//loop used to create a small part of a green bush, windows, tree trunk
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (bushG1);
	    c.drawOval (80 + x, 240, 20 - 2 * x, 20); //small part of bush
	    //left house windows
	    c.setColor (WindowTint);
	    c.drawLine (120, 195 + x, 140, 195 + x); //left window
	    c.drawLine (180, 195 + x, 200, 195 + x); // right window
	    //right house windows
	    c.drawLine (390, 190 + x, 430, 190 + x); //left window
	    c.drawLine (180, 195 + x, 200, 195 + x); // right window
	    c.drawOval (500 + x, 170, 20 - 2 * x, 20); //garage window
	    //tree trunk
	    c.setColor (treeBark1);
	    c.drawLine (260, 240 + x, 280, 240 + x);
	}

	//loop used to create the roof for the left house
	for (int x = 0 ; x < 120 ; x++)
	{
	    c.setColor (houseRoof);
	    c.drawLine (160, 110, 100 + x, 180);
	}


    }


    //passes the drawing onto a main console and executes it
    public BackgroundStreet (Console con)
    {
	c = con;
	draw ();
    }
}


