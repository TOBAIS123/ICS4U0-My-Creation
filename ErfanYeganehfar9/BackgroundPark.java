/*
Erfan Yeganhefar
Ms.Krasteva
Oct 15 2018
This program outputs a background of a park using multiple loops
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class

public class BackgroundPark
{
    //global variable used to pass the object to the main console
    Console c;

    //class to make the background
    public void draw ()
    {
	//local instances of Color used for different colours within the background
	Color nightSky = new Color (10, 17, 80);
	Color bushG1 = new Color (21, 96, 11);
	Color bushG2 = new Color (22, 170, 3);
	Color fallTree1 = new Color (170, 73, 3);
	Color fallTree2 = new Color (196, 214, 4);
	Color WindowTint = new Color (0, 9, 17);
	Color treeBark1 = new Color (45, 31, 0);
	Color treeBark2 = new Color (56, 15, 0);
	Color grayRock = new Color (61, 54, 51);
	Color creamWall = new Color (145, 100, 20);
	Color houseRoof = new Color (60, 2, 100);
	Color slateGray = new Color (112, 128, 144);
	Color lightGray = new Color (149, 151, 155);
	Color darkGray = new Color (84, 86, 89);
	Color darkBrown = new Color (35, 16, 1);

	//loop used to make the night sky and the street
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (nightSky);
	    c.drawLine (x, 0, x, 250); //the sky
	    c.setColor (lightGray);
	    c.drawLine (x, 250, x, 500); //the street
	}

	//loop used to create the house
	for (int x = 0 ; x < 110 ; x++)
	{
	    //house walls
	    c.setColor (creamWall);
	    c.drawLine (370 + x, 140, 370 + x, 250); //main house
	    //house roof
	    c.setColor (houseRoof);
	    c.drawLine (420, 70, 370 + x, 140); //main house roof
	}

	//loop used to create the building
	for (int x = 0 ; x < 140 ; x++)
	{
	    c.setColor (slateGray);
	    c.drawLine (507 + x, 60, 507 + x, 250); //main building
	}

	//loop used to create a small part of a rock, tree trunk, right tree leaves, and windows
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (grayRock);
	    c.drawOval (110 + x, 230, 20 - 2 * x, 20); //small part of rock
	    //left tree trunk
	    c.setColor (treeBark1);
	    c.drawLine (80 + x / 2, 141, 80 + x / 2, 249);
	    //right tree trunk
	    c.setColor (treeBark2);
	    c.drawLine (190 + x, 161, 190 + x, 249);
	    //right tree leaves
	    c.setColor (fallTree2);
	    c.drawOval (160 + x, 140, 20 - 2 * x, 20);
	    c.drawOval (220 + x, 100, 20 - 2 * x, 20);
	    //house windows
	    c.drawLine (390 + x, 170, 390 + x, 190);
	    c.drawLine (440 + x, 170, 440 + x, 190);
	    c.setColor (Color.BLACK);
	    c.drawLine (400, 170, 400, 190);
	    c.drawLine (390, 180, 410, 180);
	    c.drawLine (450, 170, 450, 190);
	    c.drawLine (440, 180, 460, 180);
	    //building windows
	    c.setColor (WindowTint);
	    c.drawLine (520, 80 + x, 560, 80 + x);
	    c.drawLine (520, 120 + x, 560, 120 + x);
	    c.drawLine (520, 160 + x, 560, 160 + x);
	    c.drawLine (520, 200 + x, 560, 200 + x);
	    c.drawLine (600, 80 + x, 640, 80 + x);
	    c.drawLine (600, 120 + x, 640, 120 + x);
	    c.drawLine (600, 160 + x, 640, 160 + x);
	    c.drawLine (600, 200 + x, 640, 200 + x);

	}

	//loop used to create leaves for the left tree
	for (int x = 0 ; x < 70 ; x++)
	{
	    c.setColor (fallTree1);
	    c.drawOval (70 + x, 60, 70 - 2 * x, 70);
	}

	//loop used to create the door for the house, a bush, tree leaves, rocks, and the moon
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (darkBrown);
	    c.drawLine (415, 210 + x, 435, 210 + x); //door
	    //bush
	    c.setColor (bushG2);
	    c.drawOval (x, 210, 40 - 2 * x, 40);
	    c.setColor (bushG1);
	    c.drawRoundRect (20 + x, 220, 30 - 2 * x, 30, 10, 10);
	    //moon
	    c.setColor (lightGray);
	    c.drawOval (500 + x, 0, 40 - 2 * x, 40);
	    //left tree leaves
	    c.setColor (fallTree1);
	    c.drawOval (40 + x, 80, 40 - 2 * x, 40);
	    c.drawOval (80 + x, 120, 40 - 2 * x, 40);
	    //right tree leaves
	    c.setColor (fallTree2);
	    c.drawOval (220 + x, 120, 40 - 2 * x, 40);
	    //rocks
	    c.setColor (grayRock);
	    c.drawRoundRect (140 + x, 210, 40 - 2 * x, 40, 10, 10);
	    c.drawRoundRect (120 + x, 220, 30 - 2 * x, 30, 10, 10);

	}
	//loop used to create leaves for the left tree
	for (int x = 0 ; x < 60 ; x++)
	{
	    c.setColor (fallTree1);
	    c.drawOval (50 + x, 90, 60 - 2 * x, 60);
	}

	//loop used to create leaves for the right tree
	for (int x = 0 ; x < 80 ; x++)
	{
	    c.setColor (fallTree2);
	    c.drawOval (160 + x, 90, 80 - 2 * x, 80); //right tree
	}

	//loop used to create fences
	for (int x = 0 ; x < 10 ; x++)
	{
	    //fence posts
	    c.setColor (darkBrown);
	    c.drawLine (240 + x, 200, 240 + x, 249);
	    c.drawLine (280 + x, 200, 280 + x, 249);
	    c.drawLine (320 + x, 200, 320 + x, 249);
	    //fence boards
	    c.drawLine (250, 207 + x / 2, 369, 207 + x / 2);
	    c.drawLine (250, 219 + x / 2, 369, 219 + x / 2);
	}

	//loop used to make a separation between the street and houses
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (darkGray);
	    c.drawLine (x, 250, x, 260);
	}
    }


    //passes the drawing onto a main console and executes it
    public BackgroundPark (Console con)
    {
	c = con;
	draw ();
    }
}


