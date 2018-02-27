package lesson1;

public class Calculator {
	
	private double result;

	public double getResult()
	{
		return result;
	}
	
	public void add(double arg1, double arg2)
	{
		result = arg1 + arg2;
	}
	
	public void add(double arg)
	{
		result += arg;
	}
	
	public static double get_add(double arg1, double arg2)
	{
		return arg1 + arg2;
	}
	
	public Calculator() {
		result = 0;
		
	}
	
}
