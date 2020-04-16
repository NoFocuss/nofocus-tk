import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;
import java.lang.Math;
import java.util.Arrays;

public class RectangleTraits
{
	private static int totalPixels;
	private static int width;
	private static int windowHeight, windowWidth;
	private static long sleep;
	private static int accesses;

	public static void setSleep(long s)
	{
		sleep = s;
	}
	public static long getSleep()
	{
		return sleep;
	}

	public static void setWindowWidth(int w)
	{
		windowWidth = w;
	}
	public static int getWindowWidth()
	{
		return windowWidth;
	}
	public static void setRectangleWidth(int w, int itemCount)
	{
		width = w/itemCount;
		totalPixels = w;
	}
	public static void setWindowHeight(int height)
	{
		windowHeight = height;
	}
	public static int getWindowHeight()
	{
		return windowHeight;
	}
	public static int getRectangleWidth()
	{
		return width;
	}

	public static int getRectangleListSize()
	{
		int out = 0;
		for (int i=0; i<totalPixels/getRectangleWidth(); i++)
		{
			out++;
		}
		return out;
	}
	public static int getAccesses()
	{
		return accesses;
	}
	public static void setAccesses()
	{
		accesses++;
	}
}