// Lab15st.java
// This is the student, starting file for Lab 15.
// This file is identical to Java1521.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;


public class Lab15 extends java.applet.Applet
{

	int numClicks;
	Image picture1, picture2, picture3, picture4, picture5;

	public void init()
	{
		numClicks = 0;
		picture1 = getImage(getDocumentBase(),"me.jpg");
		picture2 = getImage(getDocumentBase(),"dishwasher.png");
		picture3 = getImage(getDocumentBase(),"newjersey.png");
		picture4 = getImage(getDocumentBase(),"nothing.jpg");
		picture5 = getImage(getDocumentBase(),"creative.jpg");

		// The following MediaTracker/try/catch code ensures that
		// all images are loaded before the program continues.
		MediaTracker tracker = new MediaTracker(this);
		tracker.addImage(picture1,1);
		tracker.addImage(picture2,1);
		tracker.addImage(picture3,1);
		tracker.addImage(picture4,1);
		tracker.addImage(picture5,1);
		try
		{
			tracker.waitForAll();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public void paint(Graphics g)
	{
		switch (numClicks)
		{
			case 0 : page1(g); break;
			case 1 : page2(g); break;
			case 2 : page3(g); break;
			case 3 : page4(g); break;
			case 4 : page5(g); break;
			case 5 : page1(g); break;
			case 6 : page2(g); break;
			case 7 : page3(g); break;
			case 8 : page4(g); break;
			case 9 : page5(g); break;
			case 10: page1(g); break;
			case 11: page2(g); break;
			case 12: page3(g); break;
			case 13: page4(g); break;
			case 14: page5(g); break;
			case 15: page1(g); break;
			case 16: page2(g); break;
			case 17: page3(g); break;
			case 18: page4(g); break;
			case 19: page5(g); break;
		}
	}

	public boolean mouseDown(Event e, int x, int y)
	{
		numClicks++;
		repaint();
		return true;
	}

	public void page1(Graphics g)
	{
		Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"TITLE PAGE",218,100);
		Expo.setColor(g,Expo.red);
		Expo.drawThickPreciseSpiral(g,510,370,275,50,20);
		Expo.setColor(g,Expo.black);
		Expo.fillStar(g,510,370,175,32);
		Expo.setColor(g,Expo.purple);
		Expo.drawThickStar(g,510,370,225,16,25);
		Expo.setColor(g,Expo.purple);
		Expo.drawThickStar(g,510,370,275,16,25);
		g.drawImage(picture1,425,285,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"My name is Matt",30,300);
		Expo.drawString(g,"Click once to continue.",760,550);
	}

	public void page2(Graphics g)
	{
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"PAGE 2",200,100);
		Expo.setColor(g,Expo.blue);
		Expo.fillRectangle(g,170,250,600,600);
		Expo.setColor(g,Expo.chartreuse);
		g.drawImage(picture3,200,300,400,266,this);
		//g.drawImage(picture4,500,280,this);
		Expo.setColor(g,Expo.blue);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I was born in New Jersey in 2000 have a brother and a family",100,200);
		Expo.drawString(g,"Click once to continue.",750,550);
	}

	public void page3(Graphics g)
	{
		Expo.setFont(g,"Impact",Font.BOLD,100);
		Expo.drawString(g,"PAGE 3",200,100);
		Expo.setColor(g,Expo.darkGreen);
		Expo.fillRoundedRectangle(g,460,170,960,515,50);
		//g.drawImage(picture5,150,225,this);
		g.drawImage(picture2,470,173,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I work as a dishwasher at town tavern",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	
	public void page4(Graphics g)
	{
		Expo.setFont(g,"Algerian",Font.BOLD,100);
		Expo.drawString(g,"PAGE 4",200,100);
		Expo.setColor(g,Expo.blue);
		Expo.fillRectangle(g,60,270,560,615);
		g.drawImage(picture4,120,325,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I enjoy not doing anything that isn't nothing",100,150);
		Expo.drawString(g,"Click once to continue.",750,550);
	}
	
	public void page5(Graphics g)
	{
		Expo.setFont(g,"Arial",Font.BOLD,100);
		Expo.drawString(g,"PAGE 5",200,100);
		Expo.setColor(g,Expo.orange);
		Expo.fillRoundedRectangle(g,560,370,1060,815,50);
		g.drawImage(picture5,625,400,400,400,this);
		Expo.setFont(g,"Times Roman",Font.PLAIN,20);
		Expo.drawString(g,"I am not creative",100,150);
		Expo.drawString(g,"Click once to continue.",350,550);
	}


}

