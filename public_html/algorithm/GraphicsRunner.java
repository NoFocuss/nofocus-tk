import javax.swing.JFrame;
import java.util.Scanner;
public class GraphicsRunner extends JFrame
{
    private static final int WIDTH = 1000;
	private static final int HEIGHT = 1000;
	private static RectangleFactory factory;
	public GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);

		Scanner in = new Scanner(System.in);
		System.out.println("Sleep Time (Miliseconds):: ");
		long s = 0;
		System.out.println("How many items? :: ");
		int i = 250;
		factory = new RectangleFactory(i, s, WIDTH, HEIGHT);
		getContentPane().add(new Window(factory));

		setVisible(true);
	}

	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
		
		for(Rectangle r : factory.getRectangles())
		{
			System.out.println(r.toString());
		}

	}
}