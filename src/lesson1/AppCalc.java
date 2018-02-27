package lesson1;

public class AppCalc {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.add(3, 4.9);
		System.out.println(calc.getResult());
	}

}
