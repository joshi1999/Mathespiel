package tk.joshi1999.source.source.math;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Geteilt {
	public static int Geteilt(int punkte, int level){
		int l;
		int l1;
		boolean Fehler = false;
		
		
		
		while(true){
			
			
			if(punkte == 10)
			break;
			
			int a = (int) (Math.random()*101); //create random number for /
			int b = (int) (Math.random()*11); //create random number for /
			
			l1 = a/b; // Computer multiplikates and save
		
		
		
			String s = javax.swing.JOptionPane.showInputDialog( a+"/"+b+"= "); //writing question
			l = Integer.parseInt(s);
			
		
		
		
			if(l == l1){
				javax.swing.JOptionPane.showInputDialog("Richtig!"); // ToDo: Without Input
				punkte++;
			}
			else{
				Fehler = true;
				break;
			}
		
		
		}
		
		 	
		   
		if(Fehler == true){
			 
		JFrame fenster = new JFrame("Mathe");
		    
		   
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Du hast einen Fehler gemacht! \nDeine Punkte: " + punkte, JLabel.CENTER);
		
		fenster.getContentPane().add(label);
		fenster.setSize(300, 200);
		 
		   
		fenster.setVisible(true);
		}
		else{
			JFrame fenster = new JFrame("Mathe");
		    
			   
			fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Du hast dieses Kapitel abgeschlossen! Punkte: " + punkte, JLabel.CENTER);
		fenster.getContentPane().add(label);
		fenster.setSize(300, 200);
		 
		   
		fenster.setVisible(true);
		}
		return punkte;
	}
}
