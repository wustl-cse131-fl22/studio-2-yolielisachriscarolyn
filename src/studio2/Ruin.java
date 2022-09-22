package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double startAmount;
		double winChance;
		double winLimit;
		int totalSimulations;
		int losses = 0;

		
		System.out.println("startAmount: ");
		startAmount = in.nextDouble();
		System.out.println("winChance: ");
		winChance = in.nextDouble();
		System.out.println("winLimit: ");
		winLimit = in.nextDouble();
		System.out.println("totalSimulations: ");
		totalSimulations = in.nextInt();
	
	for (int simulations = 1; simulations<=totalSimulations; simulations++) {
		double amount = startAmount;
		int i = 0;
		while (amount<winLimit && amount>0) {
			if (Math.random()<=winChance) {
			amount++;
			i++;
			}
			else{
				amount--;
				i++;
				losses++;
			}
		}
		if (amount>0) {
			System.out.println("simulation :"+simulations+" "+i+" WIN");
		}
		else {
			System.out.println("simulation :"+simulations+" "+i+" LOSE");
		}

	}
	System.out.println("Losses: "+" "+losses+ "  " + "Simulations: "+ totalSimulations);
		
		
		
		
		

	}

}
