import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BTSProject extends JFrame
	{
	private static final long serialVersionUID = 1L;
	static String name; 
	static int className;
	static int className1;
	static int className2;
	static int className3;
	static int className4;
	static int className5;
	static int className6;
	static int className7;
	static int className8;
	static int className9;
	static int className10;
	static int className11; 
	static JFrame frame = new JFrame();
	static int points; 
	

public static void main(String[] args)
    {
	name = JOptionPane.showInputDialog("What is your name?");  
	JOptionPane.showMessageDialog(frame, "Hello, " + name + "!");
	
	Object[] options = {"Yes", "No"};
	className = JOptionPane.showOptionDialog(frame, "Do You Want A Resfresher On Who BTS Is?",
			"BEGINNING:",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options, options[1]);
	
	switch(className)
	{
		case 0:
				{
			JOptionPane.showMessageDialog(frame, "BTS is a seven-member boyband formed under Big Hit Entertainment in 2013 in South Korea,\n their name in English means Bulletproof BoyScouts and Beyond the Scenes. \n There are 4 vocalist and 3 rappers, but they all can do both. \n They worked hard to persue their dream, and they have become what they are today because of that hard work!");
			break;
				}
		case 1:
				{
				JOptionPane.showMessageDialog(frame, "Alright, let's get to it! You have 10 points to start out with! Try to keep them all!");
				break;
				}
			}
	points = 10; 
	Object[] options1 = { "2012", "2013", "2015" };
    className1 =  JOptionPane.showOptionDialog(frame, "When did BTS debut? Points = " + points , 
			"Question 1:",
			JOptionPane.YES_NO_CANCEL_OPTION, 
			JOptionPane.QUESTION_MESSAGE,
			null, options, options[1]);
	
	switch(className1)
	{
		case 0:
				{
				JOptionPane.showMessageDialog(frame, "Nope! BTS debuted in 2013! You lost a point!");
				points --;
				break; 
				}
		case 1:
				{
				JOptionPane.showMessageDialog(frame, "Yes! They did debut in 2013!");
				break;
				}
		case 2:
				{
				JOptionPane.showMessageDialog(frame, "Nope! BTS debuted in 2013! You lost a point!");
				points --;
				break; 
				}
	}
	
	Object[] options2 = { "R.M", "Jungkook", "Seokjin" };
	className2 =  JOptionPane.showOptionDialog(frame, "Who is the leader of BTS? Points = " + points , 
			"Question 2:",
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options, options[1]);
	
	switch(className2) 
	{
		case 0:
				{
				JOptionPane.showMessageDialog(frame,"Yes! R.M is the leader of BTS!");
			    break;
				}
		case 1:
				{
				JOptionPane.showMessageDialog(frame, "No, I'm sorry, R.M is the leader of BTS.");
				points--;
				break;
				}
		case 2:
				{
				JOptionPane.showMessageDialog(frame, "No, I'm sorry, R.M is the leader of BTS.");
				points--;
				break;
				}
	}
	
	Object[] options3 = { "Jungkook", "Jimin"};
	className3 =  JOptionPane.showOptionDialog(frame, "Who is the leader of BTS? Points = " + points , 
			"Question 3:" , 
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options, options[1]);
	
	switch(className3)
	{
		case 0:
				{
				JOptionPane.showMessageDialog(frame, "Yes! Jungkook is the youngest member! He debut when he was only 15-years-old"); 
				break;
				}
		case 1:
				{
				JOptionPane.showMessageDialog(frame, "Nope! Jungkook is the youngest member!");
				points--;
				break;
				}
	}
	
	Object[] options4 = { "Seokjin", "R.M", "J-Hope"};
	className4 =  JOptionPane.showOptionDialog(frame, "Who is the best dancer of BTS? Points = " + points , 
			"Question 4:" , 
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options, options[1]);
	
	switch(className4)
	{
		case 0:
				{
				JOptionPane.showMessageDialog(frame, "No, I'm sorry... J-Hope is the best dancer!");
			    points--;
			    break;
				}
		case 1:
				{
				JOptionPane.showMessageDialog(frame,"No, I'm sorry... J-Hope is the best dancer!");
			    points--;
			    break;
				}
		case 2:
				{
				JOptionPane.showMessageDialog(frame, "Yes! J-Hope is the best dancer! He did underground dancing for 10 years!");
				break; 
				}
	}
	
	Object[] options5 = { "A.R.M.Y", "EXO-L's", "MAMA"};
	className5 =  JOptionPane.showOptionDialog(frame, "What is the fanbase of BTS called? Points = " + points , 
			"Question 5:",  
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options, options[1]);
	
	switch(className5)
	{
		case 0:
				{
				JOptionPane.showMessageDialog(frame, "Yes! A.R.M.Y is the fanbase of BTS! They are currently the biggest fanbase in the whole world!");
				break; 
				}
		case 1:
				{
				JOptionPane.showMessageDialog(frame, "No, A.R.M.Y is the fanbase of BTS!");
				points--;
				break;
				}
		case 2:
				{
				JOptionPane.showMessageDialog(frame, "No, A.R.M.Y is the fanbase of BTS!");
				points--;
				break;
				}		
	}
	Object[] options6 = { "Behind the Scenes", "Beyond the Scenes", "BulletProof BoyScouts"};
	className6 =  JOptionPane.showOptionDialog(frame, "What does BTS stand for? Points = " + points , 
			"Question 6:", 
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options, options[1]);
	
	switch(className6)
	{
		case 0:
				{
				JOptionPane.showMessageDialog(frame, "NOPE! BTS stands for Beyond the Scenes!");
				points--;
				break;
				}
		case 1:
				{
				JOptionPane.showMessageDialog(frame, "Yes! BTS does stand for Beyond the Scenes");
				break;
				}
		case 2:
				{
					JOptionPane.showMessageDialog(frame, "Yes! BTS does stand for BulletProof BoyScouts!");
					break;
				}
	}
	
    
    Object[] options7 = { "3", "5", "7"};
	className7 =  JOptionPane.showOptionDialog(frame, "How many members are there in BTS? Points = " + points , 
			"Question 7:", 
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null, options, options[1]);
	
	switch(className7)
	{
		case 0:
				{
				JOptionPane.showMessageDialog(frame, "NOPE! I'm sorry but there are 7 members of BTS!");
				points--;
				break;
				}
		case 1:
				{
				JOptionPane.showMessageDialog(frame, "NOPE! I'm sorry but there are 7 members of BTS!");
				points--;
				break;
				}
		case 2:
				{
				JOptionPane.showMessageDialog(frame, "Yes! You are correct! There are 7 members of BTS!");
				break;
				}
	}
	
	 Object[] options8 = { "J-Hope", "Suga", "V"};
		className8 =  JOptionPane.showOptionDialog(frame, "Which member has the deepest voice? Points = " + points , 
				"Question 8:", 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		
		switch(className8)
		{
			case 0:
					{
					JOptionPane.showMessageDialog(frame, "NOPE! I'm sorry but V has the deepest voice!");
					points--;
					break;
					}
			case 1:
					{
					JOptionPane.showMessageDialog(frame, "NOPE! I'm sorry but V has the deepest voice! But Suga has the next deepest!");
					points--;
					break;
					}
			case 2:
					{
						JOptionPane.showMessageDialog(frame, "Yes! V or Taehyung has the deepest voice in the band!");
						break;
					}
		}
		
		Object[] options9 = { "Jimin", "Jin", "Jungkook"};
		className9 =  JOptionPane.showOptionDialog(frame, "Which member has the highest voice? Points = " + points , 
				"Question 9:",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		
		switch(className9)
		{
			case 0:
					{
						JOptionPane.showMessageDialog(frame, "You are correct! Jimin has the highest voice!");
						break;
					}
					
			case 1:
					{
						JOptionPane.showMessageDialog(frame, "NOPE! I'm sorry but Jimin has the highest voice!");
						points--;
						break;
					}
			case 2:
					{
						JOptionPane.showMessageDialog(frame, "NOPE! I'm sorry but Jimin has the highest voice!");
						points--;
						break;
					}
		}
		
		Object[] options10 = { "3", "5"};
		className10 =  JOptionPane.showOptionDialog(frame, "How many rappers are in the group? Points = " + points , 
				"Question 10:", 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		
		switch(className10)
		{
			case 0:
					{
						JOptionPane.showMessageDialog(frame, "You are correct! the 3 rappers are R.M, Suga, and J-Hope!");
						break;
					}
			case 1:
					{
						JOptionPane.showMessageDialog(frame, "No I'm sorry! There are only 3 rappers in the group!");
						break;
					}
		}
		
		Object[] options11 = {"1-4", "5-7", "8-9", "10"};
		className11 =  JOptionPane.showOptionDialog(frame, "What are your points? Points = " + points , 
				"END:", 
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		
		switch(className11)
		{
			case 0: 
					{
						JOptionPane.showMessageDialog(frame, "You scored pretty low on this quiz! I recommend trying again and getting a better score!");
						break;
					}
			case 1 :
					{
						JOptionPane.showMessageDialog(frame, "You didn't score terrible but it wasn't the best! Try this quiz again and see if you can get a better score!"); 
						break;
					}
			case 2:
					{
						JOptionPane.showMessageDialog(frame, "You scored really well! I am very proud! Congrats!");
						break; 
					}
			case 3:
					{
						JOptionPane.showMessageDialog(frame, "You got a perfect score! I am so proud and congratulations to you!");
						break; 
					}
		}			
   }
}