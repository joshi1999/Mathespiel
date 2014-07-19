package tk.joshi1999.source.source.main;
import javax.swing.*;

//Todo: All with Textures
//		delete Exception(if you write a letter)
//		Bei geteilt Komma-Zahlen entfernen




public class main 
{
	public static void main(String args[])
	{
		int punkte = 0;
		Plus.Plus((int) punkte);
		Minus.Minus((int) punkte);
		Mal.Mal((int) punkte);
		Geteilt.Geteilt((int) punkte);
		
		
		
		
		System.out.println("Deine erreichten Punkte: " + punkte); // zu einem fenster ändern
		
	}
}
