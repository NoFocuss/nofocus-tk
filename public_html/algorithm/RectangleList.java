import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;
public class RectangleList extends Canvas
{
	private Rectangle[] rectangleList;
	private int itemsWanted, width, height;


	public RectangleList()
	{
		
		width = getWidth();
		height = getHeight();
	}
	public RectangleList(int items,long sleep, int width,int height)
	{
		
		setRectangleList(items, sleep, width, height);
		
	}

	public void setRectangleList(int items, long sleep, int width, int height)
	{
		this.itemsWanted=items;
		this.height =height;
		RectangleTraits.setRectangleWidth(width, items);
		RectangleTraits.setWindowHeight(height);
		RectangleTraits.setWindowWidth(width);
		RectangleTraits.setSleep(sleep);
		 
		rectangleList = new Rectangle[RectangleTraits.getRectangleListSize()];
		buildRectangleList();
	}
	public void setNewRectangleList(Rectangle[] rects)
	{
		rectangleList = rects;
	}
	public void buildRectangleList()
	{
		int rectangleHeight=0;
		for(int i = 0, j = 0; i<RectangleTraits.getRectangleListSize() && j<=height; i++, j+=height/itemsWanted)
		{
			 rectangleHeight = i+1;
			System.out.println("i = " + i);
			rectangleList[i] = new Rectangle(i, j);
			
			
		}
	}

	public void updateIndicies()
	{
		for (int i = 0; i<getRectangleList().length; i++)
		{
			rectangleList[i].setIndex(i);
			rectangleList[i].setXPos(i);
		}
	}

	public void shuffle()
	{
		Collections.shuffle(Arrays.asList(rectangleList));
		updateIndicies();

	}

	public Rectangle[] getRectangleList()
	{
		return rectangleList;
	}
}