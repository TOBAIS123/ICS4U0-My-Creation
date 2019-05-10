/*
* Erfan Yeganhefar
* Ms.Krasteva
* Oct 17 2018
* This program outputs the animations for a person that is reading, later scared by a monster
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class
import java.lang.*;     // to access Thread class

public class PersonReading extends Thread //extends a thread
{
    //global variable used to pass the object to the main console
    private Console c;
    private int w; //determines x cord for object
    private int y; //determines y cord for object
    private int characterForm; //form of the object

    //constructor that controls the position and form of the reading person
    public PersonReading (Console con, int Positionx, int Positiony, int charForm)
    {
	c = con;
	w = Positionx;
	y = Positiony;
	characterForm = charForm;
    }


    public void drawPersonReading ()
    {
	//local instances of Color used for different colours representing PersonReading
	Color brown = new Color (45, 31, 0);
	Color skinColour = new Color (239, 169, 47);
	Color brightRed = new Color (244, 32, 0);
	Color lightGray = new Color (149, 151, 155);
	Color lavender = new Color (116, 0, 163);

	if (characterForm == 1) //if the form is one
	{
	    //this loop introduces the reading person
	    for (int x = 0 ; x <= 300 ; x++)
	    {
		c.setColor (lightGray);
		c.fillRect (w + 7 - x, y + 0, 61, 135); //erase
		//vertices used to draw the book
		int book1X[] = {w + 15 - x, w + 15 - x, w + 30 - x, w + 30 - x};
		int book1Y[] = {y + 53, y + 68, y + 60, y + 75};
		int book2X[] = {w + 15 - x, w + 30 - x, w + 15 - x, w + 30 - x};
		int book2Y[] = {y + 53, y + 60, y + 68, y + 75};
		int book3X[] = {w + 30 - x, w + 30 - x, w + 45 - x, w + 45 - x};
		int book3Y[] = {y + 60, y + 75, y + 53, y + 68};
		int book4X[] = {w + 30 - x, w + 45 - x, w + 30 - x, w + 45 - x};
		int book4Y[] = {y + 60, y + 53, y + 75, y + 68};

		c.setColor (skinColour);
		c.fillOval (w + 15 - x, y + 0, 30, 30); //head
		c.fillRect (w + 25 - x, y + 28, 10, 14); //neck

		c.setColor (brightRed);
		c.fillRect (w + 15 - x, y + 38, 30, 52); //body
		c.fillRect (w + 7 - x, y + 38, 8, 30); //left arm
		c.fillRect (w + 45 - x, y + 38, 8, 30); //right arm

		c.setColor (brown); //displays all the parts of the book
		c.fillPolygon (book1X, book1Y, 4);
		c.fillPolygon (book2X, book2Y, 4);
		c.fillPolygon (book3X, book3Y, 4);
		c.fillPolygon (book4X, book4Y, 4);

		c.setColor (skinColour);
		c.fillRect (w + 15 - x, y + 60, 5, 8);  //left hand
		c.fillRect (w + 40 - x, y + 60, 5, 8);  //left hand

		c.setColor (lavender);
		c.fillRect (w + 15 - x, y + 90, 30, 45); //legs


		c.setColor (Color.black);
		c.fillOval (w + 23 - x, y + 10, 5, 5); //eye
		c.fillOval (w + 32 - x, y + 10, 5, 5); //eye
		c.drawLine (w + 26 - x, y + 20, w + 34 - x, y + 20); //mouth
		c.drawLine (w + 30 - x, y + 98, w + 30 - x, y + 134); //line seperating legs
		c.fillRect (w + 15 - x, y + 127, 30, 8);  //shoes

		try //try catch statment used to delay the drawing (animating it)
		{
		    Thread.sleep (15); //15 milis
		}
		catch (Exception e)
		{

		}

	    }

	}
	else if (characterForm == 2) //if the character form was two
	{
	    //dropped book
	    for (int i = 0 ; i <= 20 ; i++)
	    {
		c.setColor (brown);
		c.drawLine (340 + i, 470 + i, 360 + i, 470 + i); //book

	    }

	    //this loop animates the reading person running away from the monster
	    for (int x = 0 ; x >= -300 ; x--)
	    {
		c.setColor (lightGray);
		c.fillRect (w + 6 - x, y + 0, 60, 135); //erase

		c.setColor (skinColour);
		c.fillOval (w + 15 - x, y + 0, 30, 30); //head
		c.fillRect (w + 25 - x, y + 28, 10, 14); //neck


		c.setColor (brightRed);
		c.fillRect (w + 15 - x, y + 38, 30, 52); //body
		c.fillRect (w + 7 - x, y + 8, 8, 35); //left arm
		c.fillRect (w + 45 - x, y + 8, 8, 35); //right arm

		c.setColor (skinColour);
		c.fillRect (w + 7 - x, y + 8, 8, 5);  //left hand
		c.fillRect (w + 45 - x, y + 8, 8, 5);  //right hand

		c.setColor (lavender);
		c.fillRect (w + 15 - x, y + 90, 30, 45); //legs

		c.setColor (Color.black);
		c.fillOval (w + 23 - x, y + 10, 5, 5); //eye
		c.fillOval (w + 32 - x, y + 10, 5, 5); //eye
		c.fillOval (w + 27 - x, y + 17, 8, 7); //mouth
		c.drawLine (w + 30 - x, y + 98, w + 30 - x, y + 134); //line seperating legs
		c.fillRect (w + 15 - x, y + 127, 30, 8);  //shoes

		try //try catch statment used to delay the drawing (animating it)
		{
		    Thread.sleep (15); //15 milis
		}
		catch (Exception e)
		{

		}
	    }
	}
    }


    //overrides the run method
    public void run ()
    {

	drawPersonReading ();

    }
}


