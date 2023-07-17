package in.ineuron.test;

import java.util.Scanner;

import in.ineuron.exception.NegativeNumException;

public class ExceptionApp {

	public static void main(String[] args) throws NegativeNumException {
		System.out.println("Please enter a positive Integer i.e; > 0");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		try {
			if (num < 0) {
				throw new NegativeNumException();
			}
		} catch (NegativeNumException e) {
			System.out.println(e.getMessage());
		}

	}
}
