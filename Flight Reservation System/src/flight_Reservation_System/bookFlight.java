package flight_Reservation_System;

import java.util.Random;
import java.util.Scanner;

public class bookFlight extends passengerDetails {
	Scanner sc = new Scanner(System.in);
	String fno;
	int netPayment;
	boolean flagStatus = false;

	void payableAmount() {
		Random random = new Random();
		netPayment = random.nextInt(7000 - 4000) + 4000;
		System.out.println("Your Net payable amount is :" + netPayment);
		flagStatus = true;
	}

	void flightNoGeneration() {
		Random rand = new Random();
		fno = "6E-";
		for (int i = 0; i < 4; i++) {
			int n = rand.nextInt(4) + 0;
			fno += Integer.toString(n);
		}

	}

	void oneWay() {
		flightNoGeneration();
		setFlightNo(fno);
		System.out.println("From : ");
		setSource(sc.nextLine());
		System.out.println("To : ");
		setDestination(sc.nextLine());
		System.out.println("Journey Date : ");
		setJdate(sc.nextLine());
		System.out.println("Journey Time: ");
		setJtime(sc.nextLine());
		System.out.println("Ticket Type : ");
		setTicket_type(sc.nextLine());
		System.out.println("Number of Passenger(s) : ");
		setNop(sc.nextInt());

		// System.out.println(getTicket_type());
	}

	void roundTrip() {
		flightNoGeneration();
		setFlightNo(fno);
		System.out.println("From : ");
		setSource(sc.nextLine());
		System.out.println("To : ");
		setDestination(sc.nextLine());
		System.out.println("Journey Date : ");
		setJdate(sc.nextLine());
		System.out.println("Journey Time: ");
		setJtime(sc.nextLine());
		System.out.println("Return Date : ");
		setRdate(sc.nextLine());
		System.out.println("Return Time : ");
		setRtime(sc.nextLine());
		System.out.println("Ticket Type : ");
		setTicket_type(sc.nextLine());
		System.out.println("Number of Passenger(s) : ");
		setNop(sc.nextInt());

		netPayment = netPayment * 2;

		/*
		 * System.out.println("***************************************************");
		 * System.out.
		 * println("Congratulations!! Ticket Booked...Happy and Safe Journey...");
		 * System.out.println("***************************************************");
		 */
	}

	void intakeDetails() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Passenger Title : ");
		setTitle(sc1.nextLine());
		System.out.println("Enter Passenger First Name : ");
		setFname(sc1.nextLine());
		System.out.println("Enter Passenger Last Name : ");
		setLname(sc1.nextLine());
		System.out.println("Enter Passenger Mobile no. : ");
		setMob(sc1.nextLine());
		System.out.println("Enter Passenger Email : ");
		setEmail(sc1.nextLine());
		System.out.println("Enter Passenger Age : ");
		setAge(sc1.nextInt());
	}

	/*
	 * void intakePassDetails(int getNop) { int passCount = getNop; for(int i =
	 * 1;i<= passCount ; i++) {
	 * System.out.println("Enter details of passenger no. "+i);
	 * 
	 * } }
	 */

}
