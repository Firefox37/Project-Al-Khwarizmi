package base.util;

import base.Numbo;

public class Addition
{
	public static Numbo add(Numbo parA, Numbo parB)
	{
		return new Numbo(parA.toInt() + parB.toInt());
	}
}