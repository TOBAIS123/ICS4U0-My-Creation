/*
* Erfan Yeganhefar
* Ms.Krasteva
* Oct 20 2018
* This program outputs a big monster that falls from the sky scaring the smaller monster by shooting a flame
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class
import java.lang.*; // access Thread class

public class BigMonster extends Thread //extends the thread class
{
    //global variable used to pass the object to the main console
    private Console c;
    private int w; //determines x cord for object
    private int y; //determines y cord for object

    public void drawBigMonster ()
    {
	//local instances of Color used for different colours in BigMonster
	Color nightSky = new Color (10, 17, 80);
	Color lightGray = new Color (149, 151, 155);
	Color darkBrown = new Color (35, 16, 1);
	Color darkGreen = new Color (0, 43, 0);
	Color midGreen = new Color (0, 137, 0);
	Color lightGreen = new Color (26, 198, 3);
	Color olive = new Color (128, 128, 0);

	//a loop used to animate the falling action of the big monster
	for (int x = 0 ; x <= 300 ; x++)
	{
	    c.setColor (nightSky);
	    c.fillRect (w, y + 19 + x, 200, 140); //erase

	    int Spike1X[] = {w + 90, w + 100, w + 100}; //x vertices used for the first spike
	    int Spike2X[] = {w + 110, w + 120, w + 120}; //x vertices used for the second spike
	    int Spike3X[] = {w + 130, w + 140, w + 140}; //x vertices used for the third spike
	    int SpikeY[] = {y + 80 + x, y + 80 + x, y + 60 + x}; //y vertices used for the third spike
	    int rearEndX[] = {w + 130, w + 130, w + 160}; //x vertices used for the rear end of big monster
	    int rearEndY[] = {y + 120 + x, y + 80 + x, y + 80 + x}; //y vertices used for the rear end of big monster
	    int tailX[] = {w + 180, w + 180, w + 199}; //x vertices used for the tail
	    int tailY[] = {y + 80 + x, y + 100 + x, y + 90 + x}; //y vertices used for the tail

	    c.setColor (olive);
	    c.fillRoundRect (w + 40, y + 40 + x, 40, 40, 10, 10); //neck
	    c.fillRect (w + 140, y + 80 + x, 40, 20); //tail

	    c.setColor (midGreen);
	    c.fillOval (w + 40, y + 20 + x, 40, 40); //neck (head connection)

	    c.setColor (lightGreen);
	    c.fillRoundRect (w, y + 20 + x, 60, 40, 20, 20); //head top

	    c.setColor (olive); //different spikes
	    c.fillPolygon (Spike1X, SpikeY, 3);
	    c.fillPolygon (Spike2X, SpikeY, 3);
	    c.fillPolygon (Spike3X, SpikeY, 3);
	    c.fillPolygon (tailX, tailY, 3);

	    c.setColor (lightGreen);
	    c.fillRect (w + 40, y + 80 + x, 90, 40); //body
	    c.fillPolygon (rearEndX, rearEndY, 3); //rear end

	    c.setColor (midGreen);
	    c.fillRect (w + 40, y + 120 + x, 20, 40); //left foot
	    c.fillRect (w + 100, y + 120 + x, 20, 40); //right foot

	    c.setColor (Color.black);
	    c.fillOval (w + 31, y + 24 + x, 7, 7); //eye
	    c.drawLine (w + 0, y + 40 + x, w + 30, y + 40 + x); //mouth

	    try //try catch statment used to delay the drawing (animating it)
	    {
		Thread.sleep (10); //10 milis
	    }
	    catch (Exception e)
	    {

	    }
	}
	//loop used to transition from the sky to the street
	for (int x = 0 ; x <= 200 ; x++)
	{
	    c.setColor (nightSky);
	    c.fillRect (w, y + 319 + x, 200, 140 - x); //sky erase
	    c.setColor (lightGray);
	    c.fillRect (w, y + 459, 200, x); //street erase

	    int Spike1X[] = {w + 90, w + 100, w + 100}; //x vertices used for the first spike
	    int Spike2X[] = {w + 110, w + 120, w + 120}; //x vertices used for the second spike
	    int Spike3X[] = {w + 130, w + 140, w + 140}; //x vertices used for the third spike
	    int SpikeY[] = {y + 380 + x, y + 380 + x, y + 360 + x}; //x vertices used for the spikes
	    int rearEndX[] = {w + 130, w + 130, w + 160}; //x vertices used for the rear of the monster
	    int rearEndY[] = {y + 420 + x, y + 380 + x, y + 380 + x}; //y vertices used for the rear of the monster
	    int tailX[] = {w + 180, w + 180, w + 199}; //x vertices used for the tail
	    int tailY[] = {y + 380 + x, y + 400 + x, y + 390 + x}; //y vertices used for the tail
	    int mouthX[] = {w, w + 30, w + 30}; //x vertices used for the mouth
	    int mouthY[] = {y + 360 + x, y + 340 + x, y + 360 + x}; //y vertices used for the mouth

	    c.setColor (olive);
	    c.fillRoundRect (w + 40, y + 340 + x, 40, 40, 10, 10); //neck
	    c.fillRect (w + 140, y + 380 + x, 40, 20); //tail

	    c.setColor (midGreen);
	    c.fillOval (w + 40, y + 320 + x, 40, 40); //neck (head connection)

	    c.setColor (lightGreen);
	    c.fillRoundRect (w, y + 320 + x, 60, 20, 20, 20); //head top
	    c.fillRoundRect (w + 27, y + 320 + x, 33, 40, 10, 10); //head bottom
	    c.fillPolygon (mouthX, mouthY, 3); //mouth

	    c.setColor (olive); //different spikes
	    c.fillPolygon (Spike1X, SpikeY, 3);
	    c.fillPolygon (Spike2X, SpikeY, 3);
	    c.fillPolygon (Spike3X, SpikeY, 3);
	    c.fillPolygon (tailX, tailY, 3);

	    c.setColor (lightGreen);
	    c.fillRect (w + 40, y + 380 + x, 90, 40); //body
	    c.fillPolygon (rearEndX, rearEndY, 3); //rear end

	    c.setColor (midGreen);
	    c.fillRect (w + 40, y + 420 + x, 20, 40); //left foot
	    c.fillRect (w + 100, y + 420 + x, 20, 40); //right foot

	    c.setColor (Color.black);
	    c.fillOval (w + 31, y + 324 + x, 7, 7); //eye

	    try //try catch statment used to delay the drawing (animating it)
	    {
		Thread.sleep (15); //15 milis
	    }
	    catch (Exception e)
	    {

	    }
	}

    }


    //constructor for BigMonster takes in console argument, and x+y positions
    public BigMonster (Console con, int Positionx, int Positiony)
    {
	c = con;
	w = Positionx;
	y = Positiony;
    }


    //overrides the run() method
    public void run ()
    {
	drawBigMonster ();
    }
}


