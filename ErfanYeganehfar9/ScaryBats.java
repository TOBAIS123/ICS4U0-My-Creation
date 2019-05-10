/*
* Erfan Yeganhefar
* Ms.Krasteva
* Oct 16 2018
* This program outputs 3 different bats that fly across the sky at different speeds, cords, and colour
* DISCLAIMER: setColor methods are repeated so when threads are concurrently running colors do not get confused (as they would mix)
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class
import java.lang.*; // to access Thread class

public class ScaryBats extends Thread //extends thread class
{
    private Console c; //global variable used to pass the object to the main console
    private Color batColor; //stores the color of the bat from the overloaded constructor
    private int delay = 7; //stores the delay of the bat from the overloaded constructor
    private int locationX, locationY; //stores the position of the bat from the overloaded constructor

    //draws and animates the bats
    public void drawBat ()
    {

	//local colour variable used for the color of the sky
	Color nightSky = new Color (10, 17, 80);
	//local colour variable used for the color of the ears
	Color lightGray = new Color (149, 151, 155);

	//loop used to animate 3 bats using an overloaded method
	for (int x = 0 ; x < 750 ; x++)
	{

	    int BatEar1x[] = { - 30 + x + locationX, -30 + x + locationX, -27 + x + locationX}; //x left ear vertices
	    int BatEar1y[] = {2 + locationY, 10 + locationY, 10 + locationY}; //y left ear vertices
	    int BatEar2x[] = { - 15 + x + locationX, -15 + x + locationX, -18 + x + locationX}; //x right ear vertices
	    int BatEar2y[] = {2 + locationY, 10 + locationY, 10 + locationY}; //y right ear vertices

	    c.setColor (nightSky);
	    c.fillRect (-44 + x + locationX, locationY, 47, 31); //erase
	    c.setColor (Color.black);
	    c.fillArc (-45 + x + locationX, 15 + locationY, 20, 20, 0, 150); //left wing
	    c.setColor (Color.black);
	    c.fillArc (-20 + x + locationX, 15 + locationY, 20, 20, 30, 150); //right wing
	    c.setColor (batColor);
	    c.fillRect (-30 + x + locationX, 15 + locationY, 15, 15); //bat body
	    c.setColor (batColor);
	    c.fillOval (-30 + x + locationX, 4 + locationY, 14, 14); //bat head
	    c.setColor (lightGray);
	    c.fillPolygon (BatEar1x, BatEar1y, 3); //bat left ear
	    c.setColor (lightGray);
	    c.fillPolygon (BatEar2x, BatEar2y, 3); //bar right ear
	    c.setColor (Color.black);
	    c.fillOval (-28 + x + locationX, 9 + locationY, 4, 4); //left eye
	    c.setColor (Color.black);
	    c.fillOval (-22 + x + locationX, 9 + locationY, 4, 4); //right eye

	    //used to delay the animation
	    try
	    {
		sleep (delay);//based on the constructor input
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    //arguements passed to the constructor control the position
    public ScaryBats (Console con, int PositionX, int PositionY)
    {

	c = con;
	batColor = new Color (102, 101, 97);
	locationX = PositionX;
	locationY = PositionY;
    }


    //arguements passed to the constructor control the position and Coloor
    public ScaryBats (Console con, Color n, int PositionX, int PositionY)
    {
	c = con;
	batColor = n;
	locationX = PositionX;
	locationY = PositionY;

    }


    //arguements passed to the constructor control the position, Coloor, and delay
    public ScaryBats (Console con, Color n, int t, int PositionX, int PositionY)
    {
	c = con;
	batColor = n;
	delay = t;
	locationX = PositionX;
	locationY = PositionY;
    }

    //overrides the run method
    public void run ()
    {
	drawBat ();
    }
}



