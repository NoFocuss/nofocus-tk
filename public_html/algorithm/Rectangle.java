import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;
import java.lang.Math;
import java.util.Arrays;
public class Rectangle extends RectangleTraits
{
	private static final int width = RectangleTraits.getRectangleWidth();
	private int height, xPos, yPos, index;
	private int accesses = 0;
	private boolean access;
	private Color color;
	private long sleep = RectangleTraits.getSleep();

	public Rectangle()
	{
		height = 0;
		index = -1;
	}

	public Rectangle(int index, int height)
	{
		setYPos(RectangleTraits.getWindowHeight()-height);
		setXPos(index);
		this.index = index;
		this.height = height;

	}


	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	public void setHeight(int h)
	{
		height = h;
		setYPos(RectangleTraits.getWindowHeight()-height);
	}

	public void setXPos(int x)
	{
		xPos = x*getWidth();
	}

	public int getXPos()
	{
		return xPos;
	}
	public void setYPos(int y)
	{
		yPos = y;
	}

	public int getYPos()
	{
		return yPos;
	}
	public void setIndex(int i)
	{
		index = i;
	}

	public int getIndex()
	{
		return index;
	}
	public boolean isAccessed()
	{
		return access;
	}
	
	public long getSleepMilli()
	{
		return sleep;
	}

	public void draw(Graphics window)
	{
		sleep();
		window.setColor(getColor());
		window.fillRect(getXPos(), getYPos(), getWidth(), getHeight());
		setColor(Color.BLACK);	

	}
	public void access(Graphics window)
	{
		access = true;
		setColor(Color.WHITE);
		window.setColor(getColor());
		window.drawString("Array Accesses: "+RectangleTraits.getAccesses(), 50,50);
		RectangleTraits.setAccesses();
		drawAccesses(window);
		setColor(Color.RED);
		
		draw(window);
		setColor(Color.BLACK);
		draw(window);
		access=false;		
	}
	public static int getAccesses()
	{
		return RectangleTraits.getAccesses();
	}
	public void setColor(Color c)
	{
		color = c;
	}
	public Color getColor()
	{
		return color;
	}
	public void drawAccesses(Graphics window)
	{
		
		setColor(Color.BLACK);
		window.setColor(getColor());
		
		window.drawString("Array Accesses: "+RectangleTraits.getAccesses(), 50,50);
	}
	public void sleep()
    {
        try
        {
            Thread.sleep(getSleepMilli());
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public void hide(Graphics window)
    {
    	
    	setColor(Color.RED);
    	draw(window);

    	setColor(Color.WHITE);
    	draw(window);
    	setColor(Color.BLACK);
		
    }

	public String toString()
	{
		return "Index : " + index + ", xPos : " + getXPos() + ", yPos : " + getYPos() + ", Width : " + width + ", Height : " + height ;
	}	
}