public class Eggs
{
	private final int SCORE = 1;
	private int x;
	private int y;
	private final String PATH = "NormalEgg.png";
	private final int ACCELERATION = 1;
	private boolean Avalibility = true;
	public Eggs(int initialX)
	{
		x = initialX;
		y=0;
	}
	
	public String getPath()
	{
		return PATH;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public void move()
	{
		y += ACCELERATION;
	}
	
	public void setY(int a)
	{
		y=a;
	}
	
	public int getScore()
	{
		return SCORE;
	}
	
	public void Collide()
	{
		Avalibility = false;
	}
	
	public boolean getAvalibility()
	{
		return Avalibility;
	}
	
}
