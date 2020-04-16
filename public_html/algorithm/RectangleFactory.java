import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

public class RectangleFactory
{
	private RectangleList rectangleList;
	public int windowWidth, windowHeight;
	

	public RectangleFactory()
	{
		rectangleList = new RectangleList(0,0, 0, 0);
	}

	public RectangleFactory(int totalItems, long sleep,int windowWidth, int windowHeight)
	{
		setRectangles(totalItems, sleep, windowWidth, windowHeight);
	}
	public void setRectangles(int totalItems, long sleep,int windowWidth, int windowHeight)
	{
		rectangleList = new RectangleList(totalItems,sleep, windowWidth, windowHeight);
	}
	public Rectangle[] getRectangles()
	{
		return rectangleList.getRectangleList();
	}

	public int getWindowWidth()
	{
		return windowWidth;

	}
	public int getWindowHeight()
	{
		return windowHeight;
	}
	public Rectangle[] clone()
	{
		Rectangle[] x = new Rectangle[getRectangles().length];
		for (int i = 0; i<getRectangles().length; i++)
        {
            x[i] = new Rectangle(i, getRectangles()[i].getHeight());
            
        }
        return x;
	}
	public void shuffle()
	{
		rectangleList.shuffle();
	}
	


}