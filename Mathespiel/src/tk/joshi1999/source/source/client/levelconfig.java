package tk.joshi1999.source.source.client;

public class levelconfig 
{
	public static int levelconfig(int level, int punkte)
	{
		int levela = 100,
			levelb = 1000,
			levelc = 10000,
			leveld = 100000,
			levele = 1000000,
			levelf = 10000000,
			levelg = 100000000,
			levelh = 1000000000,
			leveli = 1500000000,
			levelj = 2000000000;
		if(punkte <= levelb)
			level = 1;
		else if(punkte <= levelc)
			level = 2;
		else if(punkte <= leveld)
			level = 3;
		else if(punkte <= levele)
			level = 4;
		else if(punkte <= levelf)
			level = 5 ;
		else if(punkte <= levelg)
			level = 6;
		else if(punkte <= levelh)
			level = 7;
		else if(punkte <= leveli)
			level = 8;
		else if(punkte <= levelj)
			level = 9;
		else if(punkte >= leveli)
			level = 10;
		else
			level = 1;
		
		return level;
	}
}
