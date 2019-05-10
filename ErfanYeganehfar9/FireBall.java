/*
* Erfan Yeganhefar
* Ms.Krasteva
* Oct 20 2018
* This program outputs a flame that is produced from the big monster, scaring the smaller monster. Also produces the end screen
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class
import java.lang.*; // access Thread class

public class FireBall extends Thread //extends the thread class
{
    //global variable used to pass the object to the main console
    private Console c;
    private int w; //determines x cord for object
    private int y; //determines y cord for object

    //method that draws the fireball
    public void drawFireBall ()
    {
	//local instances of Color used for different colours in BigMonster
	Color lightGray = new Color (149, 151, 155);
	//local instance of Font used for the font in title
	Font font1 = new Font ("Comic Sans MS", Font.BOLD, 60);
	//loop used to create a fire ball
	for (int j = 0 ; j < 20 ; j++)
	{
	    c.setColor (Color.red);
	    c.fillOval (430 - j / 2, 345 - j / 2, j, j);
	    try //try catch statment used to delay the drawing (animating it)
	    {
		Thread.sleep (15); //15 milis
	    }
	    catch (Exception e)
	    {

	    }
	}



	//loop used to animate the flame
	for (int x = 0 ; x < 450 ; x++)
	{
	    int flame1X[] = {433 - x, 433 - x, 456 - x}; //x vertices for flame trail erase
	    int flame1Y[] = {334, 356, 345}; //y vertices for flame trail erase
	    c.setColor (lightGray);
	    c.fillPolygon (flame1X, flame1Y, 3); //flame erase
	    int flameX[] = {433 - x, 433 - x, 455 - x}; //x vertices for flame trail
	    int flameY[] = {335, 355, 345}; //y vertices for flame trail
	    c.setColor (Color.yellow);
	    c.fillPolygon (flameX, flameY, 3); //flame trail
	    c.setColor (Color.red);
	    c.fillOval (420 - x, 335, 20, 20); //flame

	    try //try catch statment used to delay the drawing (animating it)

	    {
		Thread.sleep (7); //10 milis
	    }


	    catch (Exception e)
	    {

	    }
	}


	//loop used to create the end screen
	for (int x = 0 ; x <= 640 ; x++)
	{
	    c.setColor (Color.black);
	    c.drawLine (0 + x, 0, 0 + x, 500); //black end screen
	    try //try catch statment used to delay the drawing (animating it)
	    {
		Thread.sleep (6);
	    }


	    catch (Exception e)
	    {

	    }


	    c.setColor (Color.white); //Ends the animation
	    c.setFont (font1);
	    c.drawString ("THE END", 170, 80);
	}
    }



    //constructor for FireBall takes in console argument, and x+y positions
    public FireBall (Console con, int Positionx, int Positiony)
    {
	c = con;
	w = Positionx;
	y = Positiony;
    }


    //overrides the run() method
    public void run ()
    {
	drawFireBall ();
    }
}
