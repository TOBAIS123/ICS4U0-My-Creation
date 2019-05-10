/*
* Erfan Yeganhefar
* Ms.Krasteva
* Oct 15 2018
* This program outputs animations for a monster scarring people, ultimatly getting scared himself
* DISCLAIMER: setColor methods are repeated so when threads are concurrently running colors do not get confused (as they would mix)
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class
import java.lang.*; // access Thread class

public class Monster extends Thread
{
    //global variable used to a
    private Console c;
    private int w; //determines x cord for object
    private int y; //determines y cord for object
    private int d; //determines increase in distance for object
    private int characterForm; //form of the object

    //animates the monster
    public void drawMonster ()
    {
	//local instances of Color used for different colours with drawMonster
	Color brown = new Color (45, 31, 0);
	Color purple = new Color (80, 0, 160);
	Color lightGray = new Color (149, 151, 155);
	Color darkGray = new Color (84, 86, 89);
	Color darkBrown = new Color (35, 16, 1);
	Color darkGreen = new Color (0, 43, 0);
	Color murkyGreen = new Color (1, 175, 1);
	Color midGreen = new Color (0, 137, 0);
	Color lightGreen = new Color (26, 198, 3);
	if (characterForm == 1) //if the form is one
	{
	    for (int x = 0 ; x <= 300 + d ; x++)
	    {
		c.setColor (lightGray);
		c.fillRect (w + x, y + 5, 105, 155); //erase

		//vertices for the ears, tooth, and body of the monster
		int MonsterEarX[] = {w + 20 + x, w + 20 + x, w + 30 + x};
		int MonsterEarY[] = {y + 5, y + 27, y + 27};
		int MonsterToothX[] = {w + 62 + x, w + 65 + x, w + 65 + x};
		int MonsterToothY[] = {y + 40, y + 43, y + 40};
		int MonsteBodyX[] = {w + 20 + x, w + 60 + x, w + 60 + x, w + 55 + x, w + 20 + x};
		int MonsteBodyY[] = {y + 60, y + 60, y + 100, y + 120, y + 120};

		c.setColor (lightGreen);
		c.fillOval (w + 20 + x, y + 10, 40, 40); //head
		c.setColor (lightGreen);
		c.fillRect (w + 30 + x, y + 40, 20, 20); //neck
		c.setColor (lightGreen);
		c.fillRect (w + 60 + x, y + 60, 30, 12); //arm
		c.setColor (brown);
		c.fillPolygon (MonsterEarX, MonsterEarY, 3);
		c.setColor (midGreen);
		c.fillRoundRect (w + 48 + x, y + 30, 25, 17, 10, 10); //snout
		c.setColor (midGreen);
		c.fillRect (w + 20 + x, y + 150, 20, 7); //left foot
		c.setColor (midGreen);
		c.fillRect (w + 42 + x, y + 150, 20, 7); //right foot
		c.setColor (midGreen);
		c.setColor (Color.black);
		c.fillOval (w + 40 + x, y + 20, 7, 7); //eye
		c.setColor (Color.black);
		c.drawLine (w + 58 + x, y + 39, w + 72 + x, y + 39); //mouth
		c.setColor (Color.black);
		c.drawArc (w + 90 + x, y + 60, 9, 5, 0, 180);
		c.setColor (Color.black);
		c.drawArc (w + 90 + x, y + 64, 9, 5, 0, 180);
		c.setColor (Color.black);
		c.drawArc (w + 90 + x, y + 68, 9, 5, 0, 180);
		c.setColor (darkGreen);
		c.fillPolygon (MonsteBodyX, MonsteBodyY, 5); //body
		c.setColor (darkGreen);
		c.fillRect (w + 20 + x, y + 120, 12, 30); //left leg
		c.setColor (darkGreen);
		c.fillRect (w + 42 + x, y + 120, 12, 30); //left leg
		c.setColor (Color.white);
		c.fillPolygon (MonsterToothX, MonsterToothY, 3); //tooth
		c.setColor (purple);
		c.drawLine (w + 20 + x, y + 120, w + 10 + x, y + 110); //tail
		c.setColor (purple);
		c.fillOval (w + 1 + x, y + 100, 10, 10); //tail end


		try //try catch statment used to delay the drawing (animating it)
		{
		    Thread.sleep (10);
		}
		catch (Exception e)
		{

		}
	    }

	}
	else if (characterForm == 2)  //if the character form was two
	{
	    for (int x = 0 ; x <= 300 + d ; x++)
	    {
		c.setColor (lightGray);
		c.fillRect (w + 300, y + 5, 105, 155); //erases previous location
		c.setColor (lightGray);
		c.fillRect (w + 300 - x, y, 81, 157); //erase

		//vertices for the ears, tooth, of the monster
		int MonsterEarX[] = {w + 360 - x, w + 360 - x, w + 350 - x};
		int MonsterEarY[] = {y, y + 20, y + 20};
		int MonsterToothX[] = {w + 322 - x, w + 325 - x, w + 325 - x};
		int MonsterToothY[] = {y + 30, y + 33, y + 30};

		c.setColor (lightGreen);
		c.fillOval (w + 320 - x, y + 0, 40, 40); //head
		c.setColor (lightGreen);
		c.fillRect (w + 330 - x, y + 30, 20, 30); //neck
		c.setColor (brown);
		c.fillPolygon (MonsterEarX, MonsterEarY, 3);
		c.setColor (midGreen);
		c.fillRoundRect (w + 310 - x, y + 20, 25, 17, 10, 10); //snout
		c.setColor (Color.black);
		c.fillOval (w + 333 - x, y + 10, 7, 7); //eye
		c.setColor (Color.black);
		c.drawLine (w + 310 - x, y + 30, w + 327 - x, y + 30); //mouth
		c.setColor (Color.black);
		c.drawArc (w + 310 - x, y + 60, 9, 5, 0, 180);
		c.setColor (Color.black);
		c.drawArc (w + 310 - x, y + 64, 9, 5, 0, 180);
		c.setColor (Color.black);
		c.drawArc (w + 310 - x, y + 68, 9, 5, 0, 180);
		c.setColor (darkGreen);
		c.fillRect (w + 320 - x, y + 50, 40, 70); //body
		c.setColor (lightGreen);
		c.fillRect (w + 320 - x, y + 60, 40, 12); //arm
		c.setColor (lightGreen);
		c.fillRect (w + 345 - x, y + 120, 15, 35); //legs
		c.setColor (midGreen);
		c.fillRect (w + 340 - x, y + 150, 20, 7); // feet
		c.setColor (Color.white);
		c.fillPolygon (MonsterToothX, MonsterToothY, 3); //tooth
		c.setColor (purple);
		c.drawLine (w + 360 - x, y + 120, w + 372 - x, y + 110); //tail
		c.setColor (purple);
		c.fillOval (w + 370 - x, y + 100, 10, 10); //tail end

		try //try catch statment used to delay the drawing (animating it)
		{
		    Thread.sleep (10);
		}
		catch (Exception e)
		{

		}
	    }

	}

    }


    //constructor controls the position, form, and distance traveled of the object
    public Monster (Console con, int Positionx, int Positiony, int distance, int charForm)
    {
	c = con;
	w = Positionx;
	y = Positiony;
	d = distance;
	characterForm = charForm;
    }


    //overrides the run method
    public void run ()
    {
	drawMonster ();
    }
}


