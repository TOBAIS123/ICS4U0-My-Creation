/*
* Erfan Yeganhefar
* Ms.Krasteva
* Oct 17 2018
* This program outputs animations for a person on their cell phone whom later is scared by a monster dropping her phone and running
* DISCLAIMER: setColor methods are repeated so when threads are concurrently running colors do not get confused (as they would mix)
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class
import java.lang.*; //access Thread class

public class PersonCellPhone extends Thread //extends the thread class
{
    //global variable used to pass the object to the main console
    private Console c;
    private int w; //determines x cord for object
    private int y; //determines y cord for object
    private int characterForm; //form of the object

    public void drawPersonCellPhone ()
    {
	//local instances of Color used for different colours representing PersonCellPhone
	Color brown = new Color (45, 31, 0);
	Color skinColour = new Color (239, 169, 47);
	Color lightGray = new Color (149, 151, 155);
	Color magenta = new Color (255, 0, 255);
	Color skirtPink = new Color (229, 123, 223);
	Color lightPink = new Color (219, 43, 198);
	Color phone = new Color (89, 85, 88);

	if (characterForm == 1) //if for =1
	{
	    //loop used to introduce the person on the cell phone
	    for (int x = 0 ; x <= 200 ; x++)
	    {
		c.setColor (lightGray);
		c.fillRect (w + 7 - x, y + 0, 61, 135); //erase

		//vertices used in skirt
		int skirt1X[] = {w + 15 - x, w + 15 - x, w + 7 - x};
		int skirt1Y[] = {y + 75, y + 105, y + 105};
		int skirt2X[] = {w + 45 - x, w + 45 - x, w + 52 - x};
		int skirt2Y[] = {y + 75, y + 105, y + 105};

		c.setColor (brown);
		c.fillRect (w + 15 - x, y + 15, 30, 15); //locks of hair
		c.setColor (magenta);
		c.fillRect (w + 15 - x, y + 35, 30, 40); //body
		c.setColor (skirtPink);
		c.fillRect (w + 7 - x, y + 35, 8, 25); //left arm
		c.setColor (skirtPink);
		c.fillRect (w + 45 - x, y + 35, 8, 25); //right arm
		c.setColor (skirtPink);
		c.fillRect (w + 15 - x, y + 52, 5, 8); //left arm
		c.setColor (skirtPink);
		c.fillRect (w + 40 - x, y + 52, 5, 8); //right arm
		c.setColor (phone);
		c.fillRect (w + 25 - x, y + 47, 9, 15); //phone
		c.setColor (skinColour);
		c.fillOval (w + 15 - x, y + 0, 30, 30); //head
		c.setColor (skinColour);
		c.fillRect (w + 25 - x, y + 28, 10, 7); //neck
		c.setColor (skinColour);
		c.fillOval (w + 19 - x, y + 52, 9, 9); //left hand
		c.setColor (skinColour);
		c.fillOval (w + 32 - x, y + 52, 9, 9);  //right hand
		c.setColor (brown);
		c.fillArc (w + 17 - x, y + 0, 26, 19, 0, 180); //hair
		c.setColor (skirtPink); //skirt
		c.fillPolygon (skirt1X, skirt1Y, 3); //left side
		c.setColor (skirtPink);
		c.fillPolygon (skirt2X, skirt2Y, 3); //right side
		c.setColor (skirtPink);
		c.fillRect (w + 15 - x, y + 75, 30, 30); //main skirt
		c.setColor (lightPink);
		c.fillRect (w + 15 - x, y + 105, 30, 15); //legs
		c.setColor (Color.black);
		c.fillOval (w + 24 - x, y + 12, 3, 4); //left eye
		c.setColor (Color.black);
		c.fillOval (w + 33 - x, y + 12, 3, 4); //right eye
		c.setColor (Color.black);
		c.drawLine (w + 25 - x, y + 21, w + 35 - x, y + 21); //mouth
		c.setColor (Color.black);
		c.drawLine (w + 29 - x, y + 105, w + 30 - x, y + 119); //line seperating legs
		c.setColor (Color.black);
		c.fillRect (w + 15 - x, y + 110, 30, 10);  //shoes

		try //try catch statment used to delay the drawing (animating it)
		{
		    Thread.sleep (15);
		}
		catch (Exception e)
		{

		}

	    }

	}
	else if (characterForm == 2) //if the form = 2
	{
	    //dropped phone
	    for (int i = 0 ; i <= 15 ; i++)
	    {
		c.setColor (phone);
		c.drawLine (440, 280 + i, 450, 280 + i); //phone

	    }
	    //loop animating the person running away from the monster
	    for (int x = 0 ; x >= -200 ; x--)
	    {
		c.setColor (lightGray);
		c.fillRect (w + 6 - x, y + 0, 60, 135); //erase

		//vertices used in skirt
		int skirt1X[] = {w + 15 - x, w + 15 - x, w + 7 - x};
		int skirt1Y[] = {y + 75, y + 105, y + 105};
		int skirt2X[] = {w + 45 - x, w + 45 - x, w + 52 - x};
		int skirt2Y[] = {y + 75, y + 105, y + 105};

		c.setColor (brown);
		c.fillRect (w + 15 - x, y + 15, 30, 15); //locks of hair
		c.setColor (magenta);
		c.fillRect (w + 16 - x, y + 35, 28, 40); //body
		c.setColor (skirtPink);
		c.fillRect (w + 7 - x, y + 15, 8, 27); //left arm
		c.setColor (skirtPink);
		c.fillRect (w + 45 - x, y + 15, 8, 27); //right arm
		c.setColor (skinColour);
		c.fillOval (w + 15 - x, y + 0, 30, 30); //head
		c.setColor (skinColour);
		c.fillRect (w + 25 - x, y + 28, 10, 7); //neck
		c.setColor (skinColour);
		c.fillOval (w + 7 - x, y + 6, 9, 9); //left hand
		c.setColor (skinColour);
		c.fillOval (w + 45 - x, y + 6, 9, 9);  //right hand
		c.setColor (brown);
		c.fillArc (w + 17 - x, y + 0, 26, 19, 0, 180); //hair
		c.setColor (skirtPink); //skirt
		c.fillPolygon (skirt1X, skirt1Y, 3); //left side
		c.setColor (skirtPink);
		c.fillPolygon (skirt2X, skirt2Y, 3); //right side
		c.setColor (skirtPink);
		c.fillRect (w + 15 - x, y + 75, 30, 30); //main skirt
		c.setColor (lightPink);
		c.fillRect (w + 15 - x, y + 105, 30, 15); //legs
		c.setColor (Color.black);
		c.fillOval (w + 24 - x, y + 12, 3, 4); //left eye
		c.setColor (Color.black);
		c.fillOval (w + 33 - x, y + 12, 3, 4); //right eye
		c.setColor (Color.black);
		c.fillOval (w + 27 - x, y + 19, 6, 7); //mouth
		c.setColor (Color.black);
		c.drawLine (w + 29 - x, y + 105, w + 30 - x, y + 119); //line seperating legs
		c.setColor (Color.black);
		c.fillRect (w + 15 - x, y + 110, 30, 10);  //shoes

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
    public PersonCellPhone (Console con, int Positionx, int Positiony, int charForm)
    {
	c = con;
	w = Positionx;
	y = Positiony;
	characterForm = charForm;
    }


    //overriding the run() method
    public void run ()
    {
	drawPersonCellPhone ();
    }
}



