public class GoldenEggs extends Eggs
{

	private final String PATH = "GoldenEgg.png";
	private final int SCORE = 10;
	final int ACCELERATION = 3;
	public GoldenEggs(int initialX) {
		super(initialX);
	}
	
	public String getPath()
	{
		return PATH;
	}
	
	public void move()
	{
		super.setY(super.getY()+ACCELERATION);
	}
	
	public int getScore()
	{
		return SCORE;
	}
}