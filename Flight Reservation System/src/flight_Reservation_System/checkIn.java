package flight_Reservation_System;

import java.util.Random;
import java.util.Scanner;

public class checkIn extends bookFlight {
	Scanner sc2 = new Scanner(System.in);
	String pnr = "";
	String stno = "";
	double payment = 0;
	boolean checkInFlag = false;

	void pnrGeneration() {
		Random rand = new Random();
		pnr = "6E";
		for (int i = 0; i < 8; i++) {
			int n = rand.nextInt(8) + 0;
			pnr += Integer.toString(n);
		}
		// System.out.println(pnr);
	}

	String seatNumberGeneration() {
		Random random = new Random();
		char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F' };
		String res = "";
		res = res + alphabet[(int) (Math.random() * 10 % 6)];
		int rand = 0;
		while (true) {
			rand = random.nextInt(31);
			if (rand != 0)
				break;
		}
		stno = rand + res;
		return stno;

	}

	void checkInDetails() {
		double baggage = 15;

		if (flagStatus) {
			System.out.println("Flight Number : " + getFlightNo());
			System.out.println("PNR : " + pnr);
			System.out.println(getSource().toUpperCase() + " ==> " + getDestination().toUpperCase());
			System.out.println("Full Name : " + getTitle().toUpperCase() + " " + getFname().toUpperCase() + " "
					+ getLname().toUpperCase());
			System.out.println("Seat No. : " + seatNumberGeneration());
			System.out.println("Bagage allowed " + baggage + " KG per passenger....");
			System.out.println("Do you want to add extra baggage(in KGs)? (y/n)");
			switch (sc2.nextLine().toLowerCase()) {
			case "y":
				System.out.println("How many KGs you want to add?:");
				double extraBaggage = sc2.nextDouble();
				payment = payment + (extraBaggage * 100);
				System.out.println("Baggage Added successfully.");
				System.out.println("Net Payable amount for additional baggage : Rs. " + payment);
				System.out.println("Web Check-In successfull. ");
				checkInFlag = true;
				break;
			case "n":
				System.out.println("Web Check-In successfull. ");
				checkInFlag = true;
				break;

			default:
				System.out.println("Please Enter correct choice...");
			}

		} else {
			checkInFlag = false;
			System.out.println("You have to Book a ticket in order to check in ...");
		}
	}

}
