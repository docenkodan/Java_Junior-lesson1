package lesson1;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		question q= new question();
		q.ask();
		int index = scan.nextInt();
		if ( q.answer(index) == true)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
