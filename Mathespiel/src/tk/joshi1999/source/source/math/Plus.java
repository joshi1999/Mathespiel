package tk.joshi1999.source.source.math;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Plus {
	public static int Plus(int punkte, int level){
		int l;
		int l1;
		int schwierigkeit = 0;
		boolean Fehler = false;
		
		if(level == 1){
			schwierigkeit = 11;
		}
		else if(level == 2){
			schwierigkeit = 21;
		}
		else if(level == 3){
			schwierigkeit = 51;
		}
		else if(level == 4){
			schwierigkeit = 101;
		}
		else if(level == 5){
			schwierigkeit = 201;
		}
		else if(level == 6){
			schwierigkeit = 501;
		}
		else if(level == 7){
			schwierigkeit = 1001;
		}
		else if(level == 8){
			schwierigkeit = 2001;
		}
		else if(level == 9){
			schwierigkeit = 5001;
		}
		else if(level == 10)
			schwierigkeit = 10001;
		else{
			schwierigkeit = 11;
		}
		
		while(true){
			
			
			if(punkte == 10)
			break;
			
			int a = (int) (Math.random()*schwierigkeit); //create random number for +
			int b = (int) (Math.random()*schwierigkeit); //create random number for +
			
			l1 = a+b; // Computer multiplikates and save
		
			String s = javax.swing.JOptionPane.showInputDialog( a+"+"+b+"= "); //writing question
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
		if(Fehler == true)  {
			 
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
