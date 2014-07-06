package tk.joshi1999.source.source.main;
import javax.swing.*;



public class main 
{
	public static void main(String args[])
	{
		
		int l;
		int l1;
		int Points = 0;
		
		
		
		while(true)
		{
		int a = (int) (Math.random()*10+1);
		int b = (int) (Math.random()*10+1);
		
		l1 = a*b;
		
		
		
		String s = javax.swing.JOptionPane.showInputDialog( a+"*"+b+"= ");
		l = Integer.parseInt(s);
		
		
		
		
		if(l == l1)
		{
			javax.swing.JOptionPane.showInputDialog("Richtig!");
			Points++;
		}
		else
		{
			break;
		}
		
		
		}
		 
		   JFrame fenster = new JFrame("Mathe");
		    
		   
		   fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		   
		   
		   JLabel label = new JLabel("Du hast einen Fehler gemacht! \nDeine Punkte: " + Points, JLabel.CENTER);
		 
		  
		   fenster.getContentPane().add(label);
		 
		   
		   fenster.setSize(300, 200);
		 
		   
		   fenster.setVisible(true);
	}
}
