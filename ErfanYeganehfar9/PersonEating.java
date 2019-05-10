/*
* Erfan Yeganhefar
* Ms.Krasteva
* Oct 20 2018
* This program outputs animations for a person who is eating whom later is scared by a monster and runs, dropping his food
* DISCLAIMER: setColor methods are repeated so when threads are concurrently running colors do not get confused (as they would mix)
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class
import java.lang.*; // access Thread class

public class PersonEating extends Thread //extends the thread class
{
    //global variable used to pass the object to the main console
    private Console c;
    private int w; //determines x cord for object
    private int y; //determines y cord for object;
    private int characterForm; //character form of the object

    //animates the person eating
    public void drawPersonEating ()
    {
	//local instances of Color used for different colours within drawPersonEating
	Color brown = new Color (45, 31, 0);
	Color skinColour = new Color (239, 169, 47);
	Color lightGray = new Color (149, 151, 155);
	Color cyan = new Color (27, 186, 180);
	Color scarlet = new Color (163, 19, 0);
	Color camellia = new Color (226, 34, 19);
	Color magenta = new Color (255, 0, 255);
	Color dilutedBrown = new Color (114, 92, 56);
	Color blueJeans = new Color (13, 19, 81);
	Color brightRed = new Color (244, 32, 0);

	if (characterForm == 1) //if the character form is 1
	{
	    //loop introduces the eating person
	    for (int x = 0 ; x <= 300 ; x++)
	    {
		c.setColor (lightGray);
		c.fillRect (w + 15 - x, y + 0, 61, 120); //erase

		//verices of the arm of the eating person
		int handX[] = {w + 52 - x, w + 52 - x, w + 67 - x, w + 67 - x};
		int handY[] = {y + 45, y + 55, y + 37, y + 49};
		int hand1X[] = {w + 52 - x, w + 67 - x, w + 52 - x, w + 67 - x};
		int hand1Y[] = {y + 45, y + 37, y + 55, y + 49};

		c.setColor (skinColour);
		c.fillOval (w + 30 - x, y + 0, 30, 30); //head
		c.setColor (skinColour);
		c.fillRect (w + 41 - x, y + 29, 7, 8); //neck
		c.setColor (skinColour);
		c.fillOval (w + 15 - x, y + 66, 9, 9); //left hand
		c.setColor (brightRed);
		c.fillRect (w + 22 - x, y + 37, 45, 45); //body
		c.setColor (brightRed);
		c.fillRect (w + 15 - x, y + 37, 8, 30); //left arm
		c.setColor (camellia);
		c.fillRect (w + 30 - x, y + 0, 30, 13); //hat
		c.setColor (camellia);
		c.drawLine (w + 60 - x, y + 13, w + 74 - x, y + 13); //line seperating legs
		c.setColor (brown);
		c.fillRect (w + 43 - x, y + 40, 5, 7); //chocolate
		c.setColor (skinColour);
		c.fillOval (w + 42 - x, y + 45, 10, 10); //right hand
		c.setColor (dilutedBrown); //left arm
		c.fillRect (w + 15 - x, y + 37, 8, 30);
		c.setColor (dilutedBrown); //right arm
		c.fillPolygon (handX, handY, 4);
		c.setColor (dilutedBrown);
		c.fillPolygon (hand1X, hand1Y, 4);
		c.setColor (cyan); //shirt stripe
		c.fillRect (w + 22 - x, y + 68, 44, 8);
		c.setColor (magenta); //shirt stripe
		c.fillRect (w + 23 - x, y + 75, 44, 7);
		c.setColor (blueJeans);
		c.fillRect (w + 30 - x, y + 82, 30, 38);
		c.setColor (Color.black);
		c.fillOval (w + 38 - x, y + 14, 4, 4); //left eye
		c.setColor (Color.black);
		c.fillOval (w + 47 - x, y + 14, 4, 4); //right eye
		c.setColor (Color.black);
		c.fillOval (w + 41 - x, y + 21, 7, 6); //mouth
		c.setColor (Color.black);
		c.drawLine (w + 45 - x, y + 93, w + 45 - x, y + 119); //line seperating legs
		c.setColor (Color.black);
		c.fillRect (w + 30 - x, y + 113, 30, 7);  //shoes

		try //try catch statment used to delay the drawing (animating it)
		{
		    Thread.sleep (15); //15 milis
		}
		catch (Exception e)
		{

		}

	    }

	}
	else if (characterForm == 2) //if character form is 2
	{
	    //dropped food
	    for (int i = 0 ; i <= 10 ; i++)
	    {
		c.setColor (brown);
		c.drawLine (360, 470 + i, 365, 470 + i); //chocolate bar
	    }

	    //animates the peron running away from the monster
	    for (int x = 0 ; x >= -300 ; x--)
	    {
		c.setColor (lightGray);
		c.fillRect (w + 14 - x, y + 0, 60, 120); //erase
		c.setColor (skinColour);
		c.fillOval (w + 30 - x, y + 0, 30, 30); //head
		c.setColor (skinColour);
		c.fillRect (w + 41 - x, y + 29, 7, 8); //neck
		c.setColor (skinColour);
		c.fillOval (w + 15 - x, y + 66, 9, 9); //left hand
		c.setColor (skinColour);
		c.fillOval (w + 65 - x, y + 66, 9, 9); //right hand
		c.setColor (brightRed);
		c.fillRect (w + 22 - x, y + 37, 45, 45); //body
		c.setColor (brightRed);
		c.fillRect (w + 15 - x, y + 37, 8, 30); //left arm
		c.setColor (camellia);
		c.fillRect (w + 30 - x, y + 0, 30, 13); //hat
		c.setColor (camellia);
		c.drawLine (w + 60 - x, y + 13, w + 74 - x, y + 13); //line seperating legs
		c.setColor (dilutedBrown);
		c.fillRect (w + 15 - x, y + 37, 8, 30); //left arm
		c.setColor (dilutedBrown);
		c.fillRect (w + 65 - x, y + 37, 8, 30); //right arm
		c.setColor (cyan); //shirt stripe
		c.fillRect (w + 22 - x, y + 68, 44, 8);
		c.setColor (magenta); //shirt stripe
		c.fillRect (w + 23 - x, y + 75, 44, 7);
		c.setColor (blueJeans);
		c.fillRect (w + 30 - x, y + 82, 30, 38);
		c.setColor (Color.black);
		c.fillOval (w + 38 - x, y + 14, 4, 4); //left eye
		c.setColor (Color.black);
		c.fillOval (w + 47 - x, y + 14, 4, 4); //right eye
		c.setColor (Color.black);
		c.fillOval (w + 41 - x, y + 21, 7, 6); //mouth
		c.setColor (Color.black);
		c.drawLine (w + 45 - x, y + 93, w + 45 - x, y + 119); //line seperating legs
		c.setColor (Color.black);
		c.fillRect (w + 30 - x, y + 113, 30, 7);  //shoes

		try //try catch statment used to delay the drawing (animating it)
		{
		    Thread.sleep (15);
		}
		catch (Exception e)
		{

		}
	    }
	}
    }


    //constructor controls the position and form of the object
    public PersonEating (Console con, int Positionx, int Positiony, int charForm)
    {
	c = con;
	w = Positionx;
	y = Positiony;
	characterForm = charForm;
    }


    //overrides run() method
    public void run ()
    {
	drawPersonEating ();
    }
}


