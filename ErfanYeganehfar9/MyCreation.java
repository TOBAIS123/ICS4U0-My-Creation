/*
* Erfan yeganehfar
* Ms. Krateva
* Oct 17, 2018
* This class controls the flow of the animation "A Spooky Night"
*   STORY: 
*       On a dark moonlight night bats flutter in the sky. While humans go on with their nightly routines a monster is on the prowl. 
*       His first vicitm is a man reading a book. Scared out of his mind he runs for help.
*       Stilling prowling, the monster approaches a girl on her phone and a boy eating. He scares them too, dropping their belongings.
*       The monster still looking for more victims, gets surprised by a bigger monster who fires a flame from his mouth, scarring the monster away.
*   CITATION: Olympiads Java class, Java for dummies 8 book edition
*/

import java.awt.*; //gives access to the awt library
import hsa.Console; //access to the Console class

public class MyCreation
{
    Console c; // The main output console

    //adds the Title to MyCreation
    public void title ()
    {
	//creates an instance of the Title
	Title t = new Title (c);
	t.start ();


	try //joins the thread, making sure that the title executes before the background
	{
	    t.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the BackgroundStreet to MyCreation
    public void backgroundStreet ()
    {
	//creates an instance of the BackgroundStreet
	BackgroundStreet b = new BackgroundStreet (c);
    }


    //adds the BackgroundPark to MyCreation
    public void backgroundPark ()
    {
	//creates an instance of the BackgroundPark
	BackgroundPark p = new BackgroundPark (c);
    }


    //adds the BackgroundCemetery to MyCreation
    public void backgroundCemetery ()
    {
	//creates an instance of the backgroundCemetery
	BackgroundCemetery bc = new BackgroundCemetery (c);
    }


    //adds the ScaryBats thread to MyCreation
    public void scaryBats ()
    {
	//creates the ScaryBats thread (different arguments are passed so each bat is unique)
	ScaryBats s = new ScaryBats (c, -70, 75);
	//starts the thread
	s.start ();
	ScaryBats s1 = new ScaryBats (c, new Color (38, 144, 27), -40, 45);
	//starts the thread
	s1.start ();
	ScaryBats s2 = new ScaryBats (c, new Color (51, 156, 156), 5, 0, 70);
	//starts the thread
	s2.start ();

	try // joins the thread making sure that the title and background have executed before executing
	{
	    s.join ();
	    s1.join ();
	    s2.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the personReading thread to MyCreation with the argument of character form
    public void personReading (int cForm)
    {
	//creates the thread
	PersonReading r = new PersonReading (c, 700, 340, cForm); //form 1
	PersonReading r1 = new PersonReading (c, 400, 340, cForm); //form 2

	//starts the thread based on the form
	if (cForm == 1) //form 1
	{
	    r.start ();

	}
	else if (cForm == 2) //form 2
	{
	    r1.start ();
	}

	try //joins the thread based on the form of the reading person
	{
	    if (cForm == 1) //form 1
	    {
		r.join ();

	    }
	    else if (cForm == 2) //form 2
	    {
		r1.join ();
	    }
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the personEating thread to MyCreation with the argument of character form
    public void personEating (int cForm)
    {
	//creates the thread based on different parameters
	PersonEating Pe = new PersonEating (c, 700, 355, cForm); //form 1
	PersonEating Pe1 = new PersonEating (c, 400, 355, cForm); //form 2

	//starts the thread based on the form
	if (cForm == 1) //form 1
	{
	    Pe.start ();

	}
	else if (cForm == 2) //form 2
	{
	    Pe1.start ();
	}

	try //joins the thread based on form
	{
	    if (cForm == 1) //form 1
	    {
		Pe.join ();

	    }
	    else //form 2
	    {

	    }
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the personCellPhone thread to MyCreation with the argument of character form
    public void personCellPhone (int cForm)
    {
	//creates the thread based on different arguments
	PersonCellPhone cP = new PersonCellPhone (c, 700, 270, cForm); //form 1
	PersonCellPhone cP1 = new PersonCellPhone (c, 500, 270, cForm); //form 2

	//starts the thread based on the form
	if (cForm == 1) //
	{
	    cP.start ();

	}
	else if (cForm == 2)
	{
	    cP1.start ();
	}

	try //try catch statment to join the thread based on form
	{
	    if (cForm == 1)
	    {
		cP.join ();

	    }
	    else //if (cForm == 2)
	    {
		//cP1.join ();
	    }
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the monster thread to MyCreation with the arguments x and y for position
    public void monster (int x, int y, int objectDistance, int cForm)
    {
	//creates the thread
	Monster m1 = new Monster (c, x, y, objectDistance, cForm);
	Monster m2 = new Monster (c, x, y, objectDistance, cForm);

	//starts the thread based on the form
	if (cForm == 1) //form 1
	{
	    m1.run ();

	}
	else if (cForm == 2) //form 2
	{
	    m2.run ();
	}

	try //joins the thread based on different scenes and form
	{
	    if (cForm == 1) //form 1
	    {
		m1.join ();

	    }
	    else if (cForm == 2) //form 2
	    {
		m2.join ();
	    }
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the BigMonster thread to MyCreation with the arguments x and y for position
    public void bigMonster (int x, int y)
    {
	//creates the thread
	BigMonster bm = new BigMonster (c, x, y);
	//starts the thread
	bm.start ();

	try //joins the thread after monster has executed
	{
	    bm.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the fireBall thread to MyCreation with the arguments x and y for position
    public void fireBall (int x, int y)
    {
	//creates the thread
	FireBall f = new FireBall (c, x, y);
	//starts the thread
	f.start ();

	// try //joins the thread after monster has executed
	// {
	//     f.join ();
	// }
	// catch (InterruptedException e)
	// {
	// }
    }


    //creates a new window and gives window the title "A Scary Night"
    public MyCreation ()
    {
	c = new Console ("A Spooky Night"); //main console and title
    }


    //main method, different arguments are passed onto the methods
    public static void main (String[] args)
    {
	MyCreation m = new MyCreation ();
	m.title ();
	m.backgroundStreet ();
	m.scaryBats ();
	m.personReading (1);
	m.monster (-100, 310, 0, 1);
	m.personReading (2);
	m.monster (200, 310, 200, 1);
	m.backgroundPark ();
	m.personEating (1);
	m.personCellPhone (1);
	m.monster (-100, 310, 0, 1);
	m.personCellPhone (2);
	m.personEating (2);
	m.monster (200, 310, 200, 1);
	m.backgroundCemetery ();
	m.monster (-100, 310, 0, 1);
	m.bigMonster (440, -200);
	m.fireBall (440, -200);
	m.monster (-100, 310, 0, 2);

    }
}


