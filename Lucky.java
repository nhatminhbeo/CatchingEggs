public class Lucky
{
	private final String PATH = "User.png";
	private int ACCELERATION = 10;
	private int x;
	private int y;
	
	
	public Lucky(int initialX, int initialY)
	{
		x = initialX;
		y = initialY;
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
	
	public void moveLeft()
	{
		x -= ACCELERATION;
	}
	
	public void moveRight()
	{
		x += ACCELERATION;
	}
}