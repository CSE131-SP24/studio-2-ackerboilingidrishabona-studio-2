package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("The amount of money that you start with:");
		double startAmount = in.nextDouble();

		System.out.println("The win probability, or the probability that you win a single play:");
		double winChance = in.nextDouble();

		System.out.println("If you reach this amount of money you had a successful day and leave:");
		double winLimit = in.nextDouble();


		while (0 < startAmount && startAmount < winLimit) {

			double random = Math.random();

			if (random < winChance) {
				startAmount++;
				System.out.println("Simulation # " + "$" + startAmount + " =WIN");
			} else {
				startAmount--;
				System.out.println("Simulation # " + "$" + startAmount + " =LOSE");
			}


		}



	}

}

