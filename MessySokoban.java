import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
public class MessySokoban extends Applet implements ActionListener
{

    // for the screens
    Panel p_card;
    Panel card1, card2, card3, card4, card5, card6, Rcard;
    CardLayout cdLayout = new CardLayout ();


    int des0[] [] = {  //level1
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 0, 1, 1, 4, 1, 1, 2},
	    {2, 2, 2, 2, 3, 1, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2}};
    int des0copy[] [] = {  //level1
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 0, 1, 1, 4, 1, 1, 2},
	    {2, 2, 2, 2, 3, 1, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2}};

    int des[] [] = {  //level3
	    {1, 1, 2, 2, 2, 2, 2, 1},
	    {2, 2, 2, 1, 1, 1, 2, 1},
	    {2, 0, 3, 4, 1, 1, 2, 1},
	    {2, 2, 2, 1, 4, 0, 2, 1},
	    {2, 0, 2, 2, 4, 1, 2, 1},
	    {2, 1, 2, 1, 0, 1, 2, 2},
	    {2, 4, 1, 6, 4, 4, 0, 2},
	    {2, 1, 1, 1, 0, 1, 1, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2}};
    int descopy[] [] = {   //level3
	    {1, 1, 2, 2, 2, 2, 2, 1},
	    {2, 2, 2, 1, 1, 1, 2, 1},
	    {2, 0, 3, 4, 1, 1, 2, 1},
	    {2, 2, 2, 1, 4, 0, 2, 1},
	    {2, 0, 2, 2, 4, 1, 2, 1},
	    {2, 1, 2, 1, 0, 1, 2, 2},
	    {2, 4, 1, 6, 4, 4, 0, 2},
	    {2, 1, 1, 1, 0, 1, 1, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2}};
    int des1[] [] = {  // level 2
	    {1, 1, 2, 2, 2, 1, 1, 1},
	    {1, 1, 2, 0, 2, 1, 1, 1},
	    {1, 1, 2, 1, 2, 2, 2, 2},
	    {2, 2, 2, 4, 1, 4, 0, 2},
	    {2, 0, 1, 4, 3, 2, 2, 2},
	    {2, 2, 2, 2, 4, 2, 1, 1},
	    {1, 1, 1, 2, 0, 2, 1, 1},
	    {1, 1, 1, 2, 2, 2, 1, 1},
	    {1, 1, 1, 1, 1, 1, 1, 1}};
    int des1copy[] [] = {  // level 2
	    {1, 1, 2, 2, 2, 1, 1, 1},
	    {1, 1, 2, 0, 2, 1, 1, 1},
	    {1, 1, 2, 1, 2, 2, 2, 2},
	    {2, 2, 2, 4, 1, 4, 0, 2},
	    {2, 0, 1, 4, 3, 2, 2, 2},
	    {2, 2, 2, 2, 4, 2, 1, 1},
	    {1, 1, 1, 2, 0, 2, 1, 1},
	    {1, 1, 1, 2, 2, 2, 1, 1},
	    {1, 1, 1, 1, 1, 1, 1, 1}};

    int des4[] [] = {  // bonus level
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 1, 0, 1, 2, 2, 2, 2},
	    {2, 1, 1, 1, 2, 2, 2, 2},
	    {2, 0, 1, 4, 3, 2, 2, 2},
	    {2, 1, 1, 4, 1, 2, 2, 2},
	    {2, 1, 1, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2}};
    int des4copy[] [] = {  // bonus level
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 1, 0, 1, 2, 2, 2, 2},
	    {2, 1, 1, 1, 2, 2, 2, 2},
	    {2, 0, 1, 4, 3, 2, 2, 2},
	    {2, 1, 1, 4, 1, 2, 2, 2},
	    {2, 1, 1, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2},
	    {2, 2, 2, 2, 2, 2, 2, 2}};

    int pos;
    int col = 8;
    int row = 9;
    int m, o = 18, score = 0, lvl = 1;
    JLabel[] pics = new JLabel [row * col];


    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);

	resize (600, 800); //the size
	openingScreen ();
	level1 ();
	//level2 ();
	//level3 ();
	//bonuslevel ();
	rulesScreen ();

	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void titlefont (JLabel t)
    {
	t.setFont (new Font ("serif", Font.BOLD, 50));
	t.setForeground (Color.WHITE);
    }





    public void buttonfont (JButton b)
    {
	b.setForeground (Color.RED);
	b.setFont (new Font ("serif", Font.PLAIN, 30));
	b.setBackground (Color.white);
	b.setPreferredSize (new Dimension (150, 50));
	b.addActionListener (this);
    }




    public void openingScreen ()
    { //starting screen
	card1 = new Panel ();
	card1.setBackground (new Color (135, 206, 235));
	JLabel title = new JLabel ("Messy Room");
	titlefont (title);

	JLabel pic = new JLabel (createImageIcon ("sokoban.jpg"));






	JButton n4 = new JButton ("Rules");
	buttonfont (n4);
	n4.setActionCommand ("rules");

	card1.add (pic);
	card1.add (n4);
	p_card.add ("1", card1);
    }


    public void rulesScreen ()
    {
	Rcard = new Panel ();
	Rcard.setBackground (new Color (134, 162, 252));
	JLabel r = new JLabel (createImageIcon ("rules.jpg"));

	Panel p = new Panel (new GridLayout (1, 4));

	JButton lvl1 = new JButton ("Level 1");
	buttonfont (lvl1);
	lvl1.setActionCommand ("L1");

	JButton lvl2 = new JButton ("Level 2");
	buttonfont (lvl2);
	lvl2.setActionCommand ("L2");

	JButton lvl3 = new JButton ("Level 3");
	buttonfont (lvl3);
	lvl3.setActionCommand ("L3");

	JButton lvlb = new JButton ("Bonus");
	buttonfont (lvlb);
	lvlb.setActionCommand ("LB");

	p.add (lvl1);
	//p.add (lvl2);
	//p.add (lvl3);
	//p.add (lvlb);
	Rcard.add (r);
	Rcard.add (p);
	p_card.add ("4", Rcard);
    }


    public void level1 ()
    {
	card4 = new Panel ();
	card4.setBackground (new Color (135, 206, 235));
	JLabel title = new JLabel ("Messy Room");
	titlefont (title);

	// the top buttons
	Panel p = new Panel (new GridLayout (1, 4));
	JButton c1 = new JButton ("Reset");
	buttonfont (c1);
	c1.setActionCommand ("reset");
	JButton c2 = new JButton ("Previous");
	buttonfont (c2);
	c2.setActionCommand ("last");
	JButton c3 = new JButton ("Next");
	buttonfont (c3);
	c3.setActionCommand ("next");
	JButton c4 = new JButton ("Rules");
	buttonfont (c4);
	c4.setActionCommand ("rules");
	p.add (c1);
	p.add (c2);
	p.add (c3);
	p.add (c4);

	Panel p2 = new Panel (new GridLayout (row, col));
	m = 0;
	for (int i = 0 ; i < row ; i++)
	{
	    for (int j = 0 ; j < col ; j++)
	    {
		pics [m] = new JLabel (createImageIcon (des0 [i] [j] + ".png"));
		pics [m].setPreferredSize (new Dimension (55, 55));
		p2.add (pics [m]);
		m++;
	    }
	}

	Panel p3 = new Panel (new GridLayout (1, 4));
	JButton up = new JButton (createImageIcon ("up.png"));
	up.addActionListener (this);
	up.setActionCommand ("up");
	JButton down = new JButton (createImageIcon ("down.png"));
	down.addActionListener (this);
	down.setActionCommand ("down");
	JButton left = new JButton (createImageIcon ("left.png"));
	left.addActionListener (this);
	left.setActionCommand ("left");
	JButton right = new JButton (createImageIcon ("right.png"));
	right.addActionListener (this);
	right.setActionCommand ("right");
	p3.add (left);
	p3.add (up);
	p3.add (down);
	p3.add (right);


	card4.add (title);
	card4.add (p);
	card4.add (p2);
	card4.add (p3);
	p_card.add ("5", card4);
    }


    public void level2 ()
    {
	card3 = new Panel ();
	card3.setBackground (new Color (135, 206, 235));
	JLabel title = new JLabel ("Messy Room");
	titlefont (title);

	// the top buttons
	Panel p = new Panel (new GridLayout (1, 4));
	JButton c1 = new JButton ("Reset");
	buttonfont (c1);
	c1.setActionCommand ("reset");
	JButton c2 = new JButton ("Previous");
	buttonfont (c2);
	c2.setActionCommand ("last");
	JButton c3 = new JButton ("Next");
	buttonfont (c3);
	c3.setActionCommand ("next");
	JButton c4 = new JButton ("Rules");
	buttonfont (c4);
	c4.setActionCommand ("rules");
	p.add (c1);
	p.add (c2);
	p.add (c3);
	p.add (c4);

	Panel p2 = new Panel (new GridLayout (row, col));
	m = 0;
	for (int i = 0 ; i < row ; i++)
	{
	    for (int j = 0 ; j < col ; j++)
	    {
		pics [m] = new JLabel (createImageIcon (des1 [i] [j] + ".png"));
		pics [m].setPreferredSize (new Dimension (55, 55));
		p2.add (pics [m]);
		m++;
	    }
	}

	Panel p3 = new Panel (new GridLayout (1, 4));
	JButton up = new JButton (createImageIcon ("up.png"));
	up.addActionListener (this);
	up.setActionCommand ("up");
	JButton down = new JButton (createImageIcon ("down.png"));
	down.addActionListener (this);
	down.setActionCommand ("down");
	JButton left = new JButton (createImageIcon ("left.png"));
	left.addActionListener (this);
	left.setActionCommand ("left");
	JButton right = new JButton (createImageIcon ("right.png"));
	right.addActionListener (this);
	right.setActionCommand ("right");
	p3.add (left);
	p3.add (up);
	p3.add (down);
	p3.add (right);


	card3.add (title);
	card3.add (p);
	card3.add (p2);
	card3.add (p3);
	p_card.add ("3", card3);
    }


    public void level3 ()
    { // main screen
	card2 = new Panel ();
	card2.setBackground (new Color (135, 206, 235));
	// title
	JLabel title = new JLabel ("Messy Room");
	titlefont (title);
	// the top buttons
	Panel p = new Panel (new GridLayout (1, 4));
	JButton c1 = new JButton ("Reset");
	buttonfont (c1);
	c1.setActionCommand ("reset");
	JButton c2 = new JButton ("Previous");
	buttonfont (c2);
	c2.setActionCommand ("last");
	JButton c3 = new JButton ("Next");
	buttonfont (c3);
	c3.setActionCommand ("next");
	JButton c4 = new JButton ("Rules");
	buttonfont (c4);
	c4.setActionCommand ("rules");
	p.add (c1);
	p.add (c2);
	p.add (c3);
	p.add (c4);

	//the game screen
	Panel p2 = new Panel (new GridLayout (row, col));
	m = 0;

	for (int i = 0 ; i < row ; i++)
	{
	    for (int j = 0 ; j < col ; j++)
	    {
		pics [m] = new JLabel (createImageIcon (des [i] [j] + ".png"));
		pics [m].setPreferredSize (new Dimension (55, 55));
		p2.add (pics [m]);
		m++;
	    }
	}

	Panel p3 = new Panel (new GridLayout (1, 4));
	JButton up = new JButton (createImageIcon ("up.png"));
	up.addActionListener (this);
	up.setActionCommand ("up");
	JButton down = new JButton (createImageIcon ("down.png"));
	down.addActionListener (this);
	down.setActionCommand ("down");
	JButton left = new JButton (createImageIcon ("left.png"));
	left.addActionListener (this);
	left.setActionCommand ("left");
	JButton right = new JButton (createImageIcon ("right.png"));
	right.addActionListener (this);
	right.setActionCommand ("right");

	card2.add (title);
	card2.add (p);
	card2.add (p2);
	p3.add (left);
	p3.add (up);
	p3.add (down);
	p3.add (right);
	card2.add (p3);

	p_card.add ("2", card2);
    }


    public void bonuslevel ()
    {
	// main screen
	card5 = new Panel ();
	card5.setBackground (new Color (135, 206, 235));
	// title
	JLabel title = new JLabel ("Messy Room");
	titlefont (title);
	// the top buttons
	Panel p = new Panel (new GridLayout (1, 4));
	JButton c1 = new JButton ("Reset");
	buttonfont (c1);
	c1.setActionCommand ("reset");
	JButton c2 = new JButton ("Previous");
	buttonfont (c2);
	c2.setActionCommand ("last");
	JButton c3 = new JButton ("Next");
	buttonfont (c3);
	c3.setActionCommand ("next");
	JButton c4 = new JButton ("Rules");
	buttonfont (c4);
	c4.setActionCommand ("rules");
	p.add (c1);
	p.add (c2);
	p.add (c3);
	p.add (c4);

	//the game screen
	Panel p2 = new Panel (new GridLayout (row, col));
	m = 0;

	for (int i = 0 ; i < row ; i++)
	{
	    for (int j = 0 ; j < col ; j++)
	    {
		pics [m] = new JLabel (createImageIcon (des4 [i] [j] + ".png"));
		pics [m].setPreferredSize (new Dimension (55, 55));
		p2.add (pics [m]);
		m++;
	    }
	}

	Panel p3 = new Panel (new GridLayout (1, 4));
	JButton up = new JButton (createImageIcon ("up.png"));
	up.addActionListener (this);
	up.setActionCommand ("up");
	JButton down = new JButton (createImageIcon ("down.png"));
	down.addActionListener (this);
	down.setActionCommand ("down");
	JButton left = new JButton (createImageIcon ("left.png"));
	left.addActionListener (this);
	left.setActionCommand ("left");
	JButton right = new JButton (createImageIcon ("right.png"));
	right.addActionListener (this);
	right.setActionCommand ("right");

	card5.add (title);
	card5.add (p);
	card5.add (p2);
	p3.add (left);
	p3.add (up);
	p3.add (down);
	p3.add (right);
	card5.add (p3);

	p_card.add ("6", card5);
    }


    public void move (int n, int ara[] [])
    {
	int x = o / col;
	int y = o % col;
	if (n == 1) //move right
	{
	    if (ara [x] [y + 1] == 4) //facing the banana peel
	    {
		if (ara [x] [y + 2] == 2 || ara [x] [y + 2] == 4) //facing the banana peel and the wall
		{
		}
		else if (ara [x] [y + 2] == 0) //putting the peel into trash
		{
		    ara [x] [y] = 1;
		    ara [x] [y + 1] = 3;
		    ara [x] [y + 2] = 6;
		    score++;
		    o++;
		}
		else if (ara [x] [y + 2] == 6) //facing the trash after adding the peel
		{
		    if (ara [x] [y + 3] == 2)
		    {
		    }
		    else
		    {
			ara [x] [y] = 1;
			ara [x] [y + 1] = 3;
			ara [x] [y + 2] = 6;
			ara [x] [y + 3] = 4;
			o++;
		    }
		}
		else if (ara [x] [y] == 5) //when on the trash
		{
		    if (ara [x] [y + 2] == 4 || ara [x] [y + 2] == 2)
		    {
		    }
		    else
		    {
			ara [x] [y] = 5;
			ara [x] [y + 1] = 3;
			ara [x] [y + 2] = 4;
			o++;
		    }
		}
		else //facing the peel
		{
		    ara [x] [y + 1] = 3;
		    ara [x] [y + 2] = 4;
		    ara [x] [y] = 1;
		    o++;
		}
	    }
	    else if (ara [x] [y + 1] == 2) //facing the wall
	    {
	    }
	    else if (ara [x] [y] == 5) //on the empty trash
	    {
		ara [x] [y] = 0;
		ara [x] [y + 1] = 3;
		o++;
	    }
	    else if (ara [x] [y + 1] == 0) //facing the empty trash
	    {
		ara [x] [y] = 1;
		ara [x] [y + 1] = 5;
		o++;
	    }
	    else if (ara [x] [y + 1] == 6) //facing the trash full
	    {
		if (ara [x] [y + 2] == 2 || ara [x] [y + 2] == 4)
		{
		}
		else
		{
		    ara [x] [y] = 1;
		    ara [x] [y + 1] = 5;
		    ara [x] [y + 2] = 4;
		    o++;
		    score--;

		}
	    }
	    else //moving right
	    {
		ara [x] [y + 1] = 3;
		ara [x] [y] = 1;
		o++;
	    }
	}
	else if (n == 2) //move left
	{
	    if (ara [x] [y - 1] == 4) //facing the banana
	    {
		if (ara [x] [y - 2] == 4 || ara [x] [y - 2] == 2) //facing the banana peel and the wall
		{
		}
		else if (ara [x] [y - 2] == 0) //putting the peel into trash
		{
		    ara [x] [y] = 1;
		    ara [x] [y - 1] = 3;
		    ara [x] [y - 2] = 6;
		    score++;
		    o--;
		}
		else if (ara [x] [y - 2] == 6 || ara [x] [y - 2] == 2) //facing the trash full
		{
		}
		else if (ara [x] [y] == 5) //when on the trash
		{
		    if (ara [x] [y - 2] == 4 || ara [x] [y - 2] == 2)
		    {
		    }
		    else
		    {
			ara [x] [y] = 0;
			ara [x] [y - 1] = 3;
			ara [x] [y - 2] = 4;
			o--;
		    }
		}
		else //facing the peel
		{
		    ara [x] [y - 1] = 3;
		    ara [x] [y - 2] = 4;
		    ara [x] [y] = 1;
		    o--;
		}
	    }


	    else if (ara [x] [y - 1] == 2) //facing the wall
	    {
	    }
	    else if (ara [x] [y - 1] == 6) //facing the trash full
	    {
		if (ara [x] [y - 2] == 2 || ara [x] [y - 2] == 4)
		{
		}
		else
		{
		    ara [x] [y] = 1;
		    ara [x] [y - 1] = 5;
		    ara [x] [y - 2] = 4;
		    o--;
		    score--;
		}
	    }
	    else if (ara [x] [y] == 5) //on the empty trash
	    {
		ara [x] [y] = 0;
		ara [x] [y - 1] = 3;
		o--;
	    }
	    else if (ara [x] [y - 1] == 0) //facing the empty trash
	    {
		ara [x] [y] = 1;
		ara [x] [y - 1] = 5;
		o--;
	    }


	    else
	    {
		ara [x] [y - 1] = 3;
		ara [x] [y] = 1;
		o--;
	    }
	}
	else if (n == 3) //move up
	{
	    if (ara [x - 1] [y] == 4) //facing the peel
	    {
		if (ara [x - 2] [y] == 4 || ara [x - 2] [y] == 2) //facing the banana peel and the wall
		{
		}
		else if (ara [x - 2] [y] == 0) //putting the peel into trash
		{
		    ara [x] [y] = 1;
		    ara [x - 1] [y] = 3;
		    ara [x - 2] [y] = 6;
		    score++;
		    o = o - 8;
		}
		else if (ara [x - 2] [y] == 6) //facing the trash after full
		{
		}
		else if (ara [x] [y] == 5) //when on the trash
		{
		    if (ara [x - 2] [y] == 4 || ara [x - 2] [y] == 2)
		    {
		    }
		    else
		    {
			ara [x] [y] = 6;
			ara [x - 1] [y] = 3;
			ara [x - 2] [y] = 4;
			o = o - 8;
		    }
		}
		else //facing the peel
		{
		    ara [x - 1] [y] = 3;
		    ara [x - 2] [y] = 4;
		    ara [x] [y] = 1;
		    o = o - 8;
		}
	    }
	    else if (ara [x - 1] [y] == 2) //facing the wall
	    {
	    }
	    else if (ara [x] [y] == 5) //on the empty trash
	    {
		ara [x] [y] = 0;
		ara [x - 1] [y] = 3;
		o = o - 8;
	    }
	    else if (ara [x - 1] [y] == 6) //facing the trash after full
	    {
		if (ara [x - 2] [y] == 2 || ara [x - 2] [y] == 4)
		{
		}
		else
		{
		    ara [x] [y] = 1;
		    ara [x - 1] [y] = 5;
		    ara [x - 2] [y] = 4;
		    o = o - 8;
		    score--;
		}
	    }
	    else if (ara [x - 1] [y] == 0) //facing the empty trash
	    {
		ara [x] [y] = 1;
		ara [x - 1] [y] = 5;
		o = o - 8;
	    }
	    else //facing nothing
	    {
		ara [x - 1] [y] = 3;
		ara [x] [y] = 1;
		o = o - 8;
	    }
	}
	else if (n == 4) //move down
	{
	    if (ara [x + 1] [y] == 4) //facing the peel
	    {
		if (ara [x + 2] [y] == 4 || ara [x + 2] [y] == 2) //facing the banana peel and the wall
		{
		}
		else if (ara [x + 2] [y] == 0) //putting the peel into trash
		{
		    if (ara [x] [y] == 5)
			ara [x] [y] = 0;
		    else
			ara [x] [y] = 1;
		    ara [x + 1] [y] = 3;
		    ara [x + 2] [y] = 6;
		    score++;
		    o = o + 8;
		}
		else if (ara [x + 2] [y] == 6) //facing the trash after full
		{
		    if (ara [x] [y] == 5)
			ara [x] [y] = 0;
		    else
			ara [x] [y] = 1;
		    ara [x + 1] [y] = 3;
		    ara [x + 2] [y] = 6;
		    o = o + 8;
		}
		else if (ara [x] [y] == 5) //when on the trash
		{
		    if (ara [x + 2] [y] == 4 || ara [x + 2] [y] == 2)
		    {
		    }
		    else
		    {
			ara [x] [y] = 0;
			ara [x + 1] [y] = 3;
			ara [x + 2] [y] = 4;
			o = o + 8;
		    }
		}
		else //facing the peel
		{
		    ara [x + 1] [y] = 3;
		    ara [x + 2] [y] = 4;
		    ara [x] [y] = 1;
		    o = o + 8;
		}
	    }
	    else if (ara [x + 1] [y] == 2) //facing the wall
	    {
	    }
	    else if (ara [x + 1] [y] == 6) //facing the trash after full
	    {
		if (ara [x + 2] [y] == 2 || ara [x + 2] [y] == 4)
		{
		}
		else
		{
		    ara [x] [y] = 1;
		    ara [x + 1] [y] = 5;
		    ara [x + 2] [y] = 4;
		    o = o + 8;
		    score--;

		}
	    }
	    else if (ara [x] [y] == 5) //on the empty trash
	    {
		ara [x] [y] = 0;
		ara [x + 1] [y] = 3;
		o = o + 8;
	    }
	    else if (ara [x + 1] [y] == 0) //facing the empty trash
	    {
		ara [x] [y] = 1;
		ara [x + 1] [y] = 5;
		o = o + 8;
	    }
	    else //facing nothing
	    {
		ara [x + 1] [y] = 3;
		ara [x] [y] = 1;
		o = o + 8;
	    }
	}
	if (lvl == 3 && score == 7)
	{
	    JOptionPane.showMessageDialog (null, "You passed this level\nPress next for next level");
	}
	else if (lvl == 2 && score == 4)
	{
	    JOptionPane.showMessageDialog (null, "You passed this level\nPress next for next level");

	}
	else if (lvl == 1 && score == 1)
	{
	    JOptionPane.showMessageDialog (null, "You passed this level\nPress next for next level");

	}
	else if (lvl == 4 && score == 2)
	{
	    JOptionPane.showMessageDialog (null, "You passed the bonus and final level");

	}
	redraw ();
    }





    public void redraw ()
    {
	m = 0;

	for (int i = 0 ; i < row ; i++)
	{
	    for (int j = 0 ; j < col ; j++)
	    {
		if (lvl == 3)
		    pics [m].setIcon (createImageIcon (des [i] [j] + ".png"));
		else if (lvl == 2)
		    pics [m].setIcon (createImageIcon (des1 [i] [j] + ".png"));
		else if (lvl == 1)
		    pics [m].setIcon (createImageIcon (des0 [i] [j] + ".png"));
		else if (lvl == 4)
		    pics [m].setIcon (createImageIcon (des4 [i] [j] + ".png"));
		m++;
	    }
	}
    }


    public void reset ()
    {
	if (lvl == 3)
	{
	    score = 1;
	    o = 18;
	    for (int i = 0 ; i < row ; i++)
	    {
		for (int j = 0 ; j < col ; j++)
		{
		    des [i] [j] = descopy [i] [j];
		}
	    }
	}
	else if (lvl == 2)
	{
	    score = 0;
	    o = 36;
	    for (int i = 0 ; i < row ; i++)
	    {
		for (int j = 0 ; j < col ; j++)
		{
		    des1 [i] [j] = des1copy [i] [j];
		}
	    }
	}
	else if (lvl == 1)
	{
	    score = 0;
	    o = 44;
	    for (int i = 0 ; i < row ; i++)
	    {
		for (int j = 0 ; j < col ; j++)
		{
		    des0 [i] [j] = des0copy [i] [j];
		}
	    }
	}
	else if (lvl == 4)
	{
	    score = 0;
	    o = 28;
	    for (int i = 0 ; i < row ; i++)
	    {
		for (int j = 0 ; j < col ; j++)
		{
		    des4 [i] [j] = des4copy [i] [j];
		}
	    }
	}

	redraw ();
    }


    public void nextlvl ()
    {
	if (lvl == 1)
	{
	    lvl = 2;
	    cdLayout.show (p_card, "3");
	    o = 36;
	    score = 0;
	}
	else if (lvl == 2)
	{
	    cdLayout.show (p_card, "2");
	    lvl = 3;
	    o = 18;
	    score = 1;
	}
	else if (lvl == 3)
	{
	    cdLayout.show (p_card, "6");
	    lvl = 4;
	    o = 28;
	    score = 0;
	}
	reset ();
    }


    public void lastlvl ()
    {
	if (lvl == 2)
	{
	    lvl = 1;
	    cdLayout.show (p_card, "5");
	    o = 44;
	    score = 0;
	}
	else if (lvl == 3)
	{
	    lvl = 2;
	    cdLayout.show (p_card, "3");
	    o = 36;
	    score = 0;
	}
	else if (lvl == 4)
	{
	    cdLayout.show (p_card, "2");
	    lvl = 3;
	    o = 18;
	    score = 1;
	}
	reset ();
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("L3")) //level 3
	{
	    cdLayout.show (p_card, "2");
	    lvl = 3;
	    o = 18;
	    score = 1;
	}
	else if (e.getActionCommand ().equals ("rules"))
	    cdLayout.show (p_card, "4");
	else if (e.getActionCommand ().equals ("L1"))
	{
	    cdLayout.show (p_card, "5");
	    lvl = 1;
	    o = 44;
	    score = 0;
	}
	else if (e.getActionCommand ().equals ("L2")) //level 2
	{
	    cdLayout.show (p_card, "3");
	    lvl = 2;
	    o = 36;
	    score = 0;
	}
	else if (e.getActionCommand ().equals ("LB")) //bonus level
	{
	    cdLayout.show (p_card, "6");
	    lvl = 4;
	    o = 28;
	    score = 0;
	}
	else if (e.getActionCommand ().equals ("right"))
	{
	    if (lvl == 2)
		move (1, des1);
	    else if (lvl == 3)
		move (1, des);
	    else if (lvl == 1)
		move (1, des0);
	    else if (lvl == 4)
		move (1, des4);

	}
	else if (e.getActionCommand ().equals ("left"))
	{
	    if (lvl == 2)
		move (2, des1);
	    else if (lvl == 3)
		move (2, des);
	    else if (lvl == 1)
		move (2, des0);
	    else if (lvl == 4)
		move (2, des4);

	}
	else if (e.getActionCommand ().equals ("up"))
	{
	    if (lvl == 2)
		move (3, des1);
	    else if (lvl == 3)
		move (3, des);
	    else if (lvl == 1)
		move (3, des0);
	    else if (lvl == 4)
		move (3, des4);
	}
	else if (e.getActionCommand ().equals ("down"))
	{
	    if (lvl == 2)
		move (4, des1);
	    else if (lvl == 3)
		move (4, des);
	    else if (lvl == 1)
		move (4, des0);
	    else if (lvl == 4)
		move (4, des4);
	}
	else if (e.getActionCommand ().equals ("reset"))
	    reset ();
	else if (e.getActionCommand ().equals ("next"))
	    nextlvl ();
	else if (e.getActionCommand ().equals ("last"))
	    lastlvl ();

	showStatus ("" + score);
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = MessySokoban.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	    return null;
    }
}




