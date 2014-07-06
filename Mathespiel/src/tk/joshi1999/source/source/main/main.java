package tk.joshi1999.source.source.main;
import javax.swing.*;

//Todo: All with Textures
//		delete Exception(if you write a letter)

public class main 
{
	public static void main(String args[])
	{
		
		int l;
		int l1;
		int Points = 0;
		boolean Fehler = false;
		
		
		
		while(true)
		{
			
			
			if(Points == 10)
			break;
			
			int a = (int) (Math.random()*10+1); //create random number for multiplikation
			int b = (int) (Math.random()*10+1); //create random number for multiplication
			
			l1 = a*b; // Computer multiplikates and save
		
		
		
			String s = javax.swing.JOptionPane.showInputDialog( a+"*"+b+"= "); //writing question
			l = Integer.parseInt(s);
			
		
		
		
			if(l == l1)
			{
				javax.swing.JOptionPane.showInputDialog("Richtig!"); // ToDo: Without Input
				Points++;
			}
			else
			{
				Fehler = true;
				break;
			}
		
		
		}
		
		 	
		   
		if(Fehler == true)  
		{
			 
		JFrame fenster = new JFrame("Mathe");
		    
		   
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Du hast einen Fehler gemacht! \nDeine Punkte: " + Points, JLabel.CENTER);
		
		fenster.getContentPane().add(label);
		fenster.setSize(300, 200);
		 
		   
		fenster.setVisible(true);
		}
		else
		{
			JFrame fenster = new JFrame("Mathe");
		    
			   
			fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Du hast volle 10 Punkte und somit Gewonnen!", JLabel.CENTER);
		fenster.getContentPane().add(label);
		fenster.setSize(300, 200);
		 
		   
		fenster.setVisible(true);
		}
		  
		
		 
		   
		
	}
}
