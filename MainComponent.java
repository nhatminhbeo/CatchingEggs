import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JComponent;

public class MainComponent extends JComponent
{
	Lucky lucky = new Lucky(118,520);
	private int score = 0;
	ArrayList<Eggs> eggs = new ArrayList<Eggs>();
	private int cal = 0;
	public void paintComponent(Graphics g)
	{
		process();
		Graphics2D g2 = (Graphics2D) g;
		Image luckyImage =Toolkit.getDefaultToolkit().getImage(lucky.getPath());
		for(int i=0; i<eggs.size(); i++)
		{
			Eggs tempEgg = eggs.get(i);
			if (checkCollision(tempEgg,lucky))
			{
				score+=tempEgg.getScore();
				eggs.remove(i);
				
			}
			else
			{
				Image tempEggImage =  Toolkit.getDefaultToolkit().getImage(tempEgg.getPath());
				g2.drawImage(tempEggImage,tempEgg.getX(),tempEgg.getY(), this);
			}
			g2.drawString("Score : " + score, 50, 50);
		}
		g2.drawString("Score : " + score, 50, 50);
		g2.drawImage(luckyImage,lucky.getX(),lucky.getY(),this);
		
	}
	
	public void process()
	{
		cal++;
		Random ran = new Random();
		if (ran.nextInt(250)<1) 
		{
			if (ran.nextInt(5)<1)
			{
				Eggs tempEgg = new GoldenEggs(ran.nextInt(236));
				eggs.add(tempEgg);
			}
			else
			{
				Eggs tempEgg = new Eggs(ran.nextInt(236));
				eggs.add(tempEgg);
			}
		}
		
		for(int i = 0; i<eggs.size(); i++)
		{
			Eggs tempEgg = eggs.get(i);
			tempEgg.move();
			
		}
		
	}
	
	public boolean checkCollision(Eggs collisionEgg, Lucky collisionLucky)
	{
		if ((collisionEgg.getY()+32 >= collisionLucky.getY()) 
				&& (collisionEgg.getX()+32 >= collisionLucky.getX())
				&& (collisionEgg.getX() <= (collisionLucky.getX() +32)))
			return true ;
		else
			return false;
	
	}
	public Lucky getLucky()
	{
		return lucky;
	}
	public void moveLuckyLeft()
	{
		if (lucky.getX()>1)
		lucky.moveLeft();
		
	}
	
	public void moveLuckyRight()
	{
		if (lucky.getX()<236)
		lucky.moveRight();
		
	}
}