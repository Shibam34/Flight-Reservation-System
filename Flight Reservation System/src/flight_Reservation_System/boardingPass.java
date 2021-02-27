package flight_Reservation_System;

import java.util.Random;

public class boardingPass extends editBooking implements Ticket {

	int gateNumberGenerator() {
		Random rnd = new Random();
		int gtno;
		gtno = 1 + rnd.nextInt(31);
		return gtno;
	}

	int sequenceGenerator() {
		Random rnd1 = new Random();
		int sqno;
		sqno = 150 + rnd1.nextInt(50);
		return sqno;
	}

	@Override
	public void boardingPassGenerator() {
		if (checkInFlag) {
			System.out.println("----------------------------------------------------------------");
			System.out.println(" INDIGO\t\t\t\t\t\t    goIndiGo.in");
			System.out.println("----------------------------------------------------------------");
			System.out.println("\tName : " + getLname().toUpperCase() + "/" + getFname().toUpperCase() + "/"
					+ getTitle().toUpperCase());
			System.out.println();
			System.out.println(
					"\tFrom : " + getSource().toUpperCase() + "\t\t\t" + "To : " + getDestination().toUpperCase());
			System.out.println("\tFlight : " + getFlightNo() + "\t\t" + "Date : " + getJdate());
			System.out.println("\tBoarding Time: 4:55 PM \t\tDeperture Time : " + getJtime());
			System.out.println("\tSequence : " + sequenceGenerator() + "\t\t\t" + "Class : " + getTicket_type());
			System.out.println("\tGate : " + gateNumberGenerator() + "\t\t\t" + "Seat : " + seatNumberGeneration());
			System.out.println("----------------------------------------------------------------");
		} else {
			System.out.println("In order to get Boarding pass you have to check-in first...");
		}
	}

}
