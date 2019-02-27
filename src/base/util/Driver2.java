package base.util;

import base.Numbo;
import base.OperationAddition;

public class Driver2
{
	public static void main(String[] parArgs)
	{
		System.out.println(addition(4,7));
		System.out.println(addition(13,15));
		System.out.println(addition(36,36));
		System.out.println(addition(4,73));
		System.out.println(addition(35,24));
		System.out.println(addition(62,35));
		System.out.println(addition(34,89));
		System.out.println(addition(56,55));

		System.out.println(addition(add(1351,35,3,5,435,43,52,5,435,2,345,2435)));
	}

	public static String addition(OperationAddition parOperation)
	{
		return Solution.toString(parOperation) + "=" + Solution.toString(Solution.solve(parOperation));
	}

	public static String addition(int parA, int parB)
	{
		return addition(new OperationAddition(new Numbo(parA), new Numbo(parB)));
	}

	public static OperationAddition add(int... parA)
	{
		if (parA.length == 2)
		{
			return new OperationAddition(new Numbo(parA[1]), new Numbo(parA[0]));
		}

		int[] b = new int[parA.length - 1];
		for (int i = 0; i < b.length; i++)
		{
			b[i] = parA[i];
		}

		return new OperationAddition(new Numbo(parA[parA.length - 1]), add(b));
	}
}