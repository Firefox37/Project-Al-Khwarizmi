package base;

/**
 * Math Structure for all input/output systems.  In addition, Operation 
 */
public abstract class Operation implements ISimplify
{
	private ISimplify a;
	private ISimplify b;
	private Operand operand;

	public Operation(ISimplify parA, Operand parOperand, ISimplify parB)
	{
		this.a = parA;
		this.b = parB;
		this.operand = parOperand;
	}

	@Override
	public abstract ISimplify output();

	public ISimplify getA()
	{
		return this.a;
	}

	public ISimplify getB()
	{
		return this.b;
	}

	public Operand getOperand()
	{
		return this.operand;
	}
}
