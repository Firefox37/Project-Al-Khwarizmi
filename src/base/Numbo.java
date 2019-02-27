package base;

public class Numbo extends Constant
{
	private int value;

	public Numbo(int parValue)
	{
		this.value = parValue;
	}

	@Override
	public Constant output()
	{
		return this;
	}

	public int toInt()
	{
		return this.value;
	}
}
