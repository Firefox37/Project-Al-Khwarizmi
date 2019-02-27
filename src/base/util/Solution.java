package base.util;

import base.ISimplify;
import base.Numbo;
import base.Operation;
public class Solution
{
	public static ISimplify solve(ISimplify parSimplify)
	{
		return parSimplify.output();
	}

	public static String toString(ISimplify parSimplify)
	{
		if (parSimplify instanceof Numbo)
		{
			return Solution.toString((Numbo)parSimplify);
		}

		if (parSimplify instanceof Operation)
		{
			return Solution.toString((Operation)parSimplify);
		}

		return "";
	}

	public static String toString(Operation parOperation)
	{
		String operand = "";

		switch(parOperation.getOperand())
		{
		case ADDITION:
			operand = "+";
			break;
		}

		return Solution.toString(parOperation.getA()) + operand + Solution.toString(parOperation.getB());
	}

	public static String toString(Numbo parNumber)
	{
		return "" + parNumber.toInt();
	}
}
