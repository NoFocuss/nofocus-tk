import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

public class Window extends Canvas
{
    private RectangleFactory factory;
    public Window()
    {
        setBackground(Color.WHITE);
    }

    public Window(RectangleFactory factory)
    {
        
        this();
        this.factory = factory;
        
    }

    public void paint (Graphics window)
    {
        drawRectangles(window);
    }

    public Rectangle[] getRectangles()
    {
        return factory.getRectangles();
    }
    
    public void drawRectangles(Graphics window)
    {
        
        Rectangle[] rects = getRectangles();
        
        for(Rectangle r : rects)
        {
            r.access(window);  
        }
       
            shuffle(window);
       
        sort(window);
        check(window);
       
            
        
        
        
        
    }
    public void sort(Graphics window)
    {
        QuickSort x = new QuickSort(getRectangles(), window);
        x.sort(getRectangles(), 0, getRectangles().length-1);
    }
    public void shuffle(Graphics window)
    {

        Rectangle[] old = factory.clone();
        factory.shuffle();
        update(window,old);   
       
    }

    public void update(Graphics window, Rectangle[] old)
    {       
        int j = 0;

        for (int i = 0; i<getRectangles().length; i++)
        {
            old[i].access(window);
            old[i].hide(window);
            getRectangles()[i].access(window);       
        }
    }
    
    public void refresh(Graphics window)
    {
        for(Rectangle r: getRectangles())
        {
            r.hide(window);
            r.access(window);
        }
    }
    public void check(Graphics window)
    {
         RectangleTraits.setSleep(5);
        for(Rectangle r : getRectangles())
        {
            r.setColor(Color.GREEN);

            r.draw(window);
        }
    }
}

