package lesson1;

public class AppCalc {

	public static void main(String[] args) {
		
		
		double res = Calculator.get_add(3, 4);
		Calculator calc = new Calculator();
		calc.add(3, 4.9);
		calc.add(10.1);
		System.out.println(calc.getResult());
	}

}
