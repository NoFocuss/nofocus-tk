import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;
import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;
// Java program for implementation of QuickSort 
public class QuickSort 
{ 
    private Rectangle[] rectangles;
    private Graphics window;

    QuickSort(Rectangle[] rects, Graphics window)
    {
        rectangles = rects;
        this.window = window;
    }
    /* This function takes last element as pivot, 
       places the pivot element at its correct 
       position in sorted array, and places all 
       smaller (smaller than pivot) to left of 
       pivot and all greater elements to right 
       of pivot */
    public Graphics getWindow()
    {
        return window;
    }

    public Rectangle[] getRects()
    {
        return rectangles;
    }

    public void setRects(Rectangle[] rects)
    {
        rectangles = rects;
    }

    int partition(Rectangle[] arr, int low, int high) 
    { 
        int pivot = arr[high].getHeight();  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            arr[j].access(getWindow());
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j].getHeight() <= pivot) 
            { 
                
                i++; 
                
                // swap arr[i] and arr[j] 
                Rectangle temp = new Rectangle(j, arr[i].getHeight()); 
                Rectangle temp2 = new Rectangle(i, arr[j].getHeight());
                
               /* Rectangle itoj = new Rectangle(j, arr[j].getHeight());
                arr[j].hide(getWindow());
                arr[i].hide(getWindow());
                arr[i] = itoj;
                

                
                Rectangle jtoi = new Rectangle(temp.getIndex(), temp.getHeight());
                arr[j] = temp;
                arr[i].access(getWindow());
                arr[j].access(getWindow());
*/
               
                arr[i].hide(getWindow());
                arr[i] = temp2;
                arr[i].access(getWindow()); 
                arr[j].hide(getWindow());
                arr[j] = temp;
                
                arr[j].access(getWindow());
            } 

        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
                Rectangle temp = new Rectangle(high, arr[i+1].getHeight()); 
                Rectangle temp2 = new Rectangle(i+1, arr[high].getHeight());
                arr[i+1].hide(getWindow());
                arr[i+1] = temp2;
                arr[i+1].access(getWindow());
                arr[high].hide(getWindow()); 
                arr[high] = temp;
                arr[high].access(getWindow());
                /*
                Rectangle hightoi = new Rectangle(arr[i+1].getIndex(), arr[i+1].getHeight());
                
                arr[high] = hightoi;
               
               

                Rectangle itohigh = new Rectangle(high, arr[high].getHeight()); 
                
                arr[i+1] = temp;
                */
                
                 
                

        
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(Rectangle[] arr, int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
  }
