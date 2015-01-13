package tk.joshi1999.source.source.math;

public class math 
{
	public static int math(int punkte, int level)
	{
		//configure the level for +
		Plus.Plus((int) punkte, (int) level);
		//configure the level for -
		Minus.Minus((int) punkte, (int) level);
		//configure the level for *
		Mal.Mal((int) punkte, (int) level);
		//configure the level for /
		Geteilt.Geteilt((int) punkte, (int) level);
		
		return punkte;
	}
}
