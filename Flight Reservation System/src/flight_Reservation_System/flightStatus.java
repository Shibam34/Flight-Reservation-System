package flight_Reservation_System;

import java.util.Scanner;

public class flightStatus extends checkIn {
	public void showStatus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your PNR to find the flight: ");
		String pnrStatus = sc.nextLine();
		String bookingStatus = "CONFIRMED";
		if (pnrStatus.equalsIgnoreCase(pnr) && flagStatus == true) {
			System.out.println("\t**********Flight Status**********");
			System.out.println("\tPNR :            \t" + pnr);
			System.out.println("\tFlight Number :  \t" + getFlightNo());
			System.out.println("\tFlight Booking Status : " + bookingStatus);
			System.out.println("\tDeperture Time : \t" + getJtime());
			System.out.println("\tDeparture date : \t" + getJdate());
			System.out.println();
		} else {
			System.out.println("You need to book your fight first!!!");
		}
	}
}
