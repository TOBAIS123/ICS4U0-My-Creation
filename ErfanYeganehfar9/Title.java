/*
* Erfan Yeganhefar
* Ms.Krasteva
* Oct 15 2018
* Outputs the title screen
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class
import java.lang.*; // access Thread class

public class Title extends Thread
{
    //global variable used to pass the object to the main console
    private Console c;

    //class to make the background
    public void title ()
    {
	//local instances of Font used for the fonts in title
	Font font1 = new Font ("Comic Sans MS", Font.BOLD, 60);
	Font font2 = new Font ("Arial", Font.BOLD, 20);

	//loop used to make the black screen
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (Color.black);
	    c.drawLine (0 + x, 0, 0 + x, 500);
	}

	c.setColor (Color.white); //introduces the user to the animation
	c.setFont (font1);
	c.drawString ("A Spooky Night", 80, 80);
	c.setFont (font2);
	c.drawString ("By: Erfan Yeganehfar", 200, 140);

	try //try catch statment used to delay the drawing (animating it)
	{
	    Thread.sleep (2000);//2000 milis
	}
	catch (Exception e)
	{

	}
    }


    //passes the drawing onto a main console and executes it
    public Title (Console con)
    {
	c = con;
    }


    public void run ()
    {
	title ();
    }
}


