package tk.joshi1999.source.source.main;
import javax.swing.*;

import tk.joshi1999.source.source.math.*;
import tk.joshi1999.source.source.client.*;

//Todo: All with Textures
//		delete Exception(if you write a letter)
//		delete Exception(if you write nothing)
//		Bei geteilt Komma-Zahlen entfernen




public class main{
	public static void main(String args[]){
		int punkte = 10;
		int level = 2;
		
		
		math.math((int) punkte, (int) level);
		
		System.out.println("Deine erreichten Punkte: " + punkte); // edit to window
		
	}
}
