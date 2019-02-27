package base;

import base.util.Addition;

public class OperationAddition extends Operation
{
	public OperationAddition(ISimplify parA, ISimplify parB)
	{
		super(parA, Operand.ADDITION, parB);
	}

	@Override
	public ISimplify output()
	{
		ISimplify a = this.getA().output();
		ISimplify b = this.getB().output();
		if (a instanceof Numbo && b instanceof Numbo)
		{
			return Addition.add((Numbo)a, (Numbo)b);
		}
		else
		{
			return new OperationAddition(a, b);
		}
	}
}
