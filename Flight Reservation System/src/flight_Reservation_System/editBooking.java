package flight_Reservation_System;

import java.util.Scanner;

public class editBooking extends flightStatus {

	public void editBookingDetails() {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		if (flagStatus == true) {
			System.out.println("Press 1 to Edit Ticket Type");
			System.out.println("Press 2 to Edit Title");
			System.out.println("Press 3 to Edit First Name");
			System.out.println("Press 4 to Edit Last Name");
			System.out.println("Press 5 to Back");
			System.out.println("-------------------------------------------------------------");
			int n = sc1.nextInt();
			while (n != 5) {
				switch (n) {
				case 1:
					System.out.println("Edit the Ticket Type: ");
					setTicket_type(sc.nextLine());
					break;

				case 2:
					System.out.println("Edit The Title: ");
					setTitle(sc.nextLine());
					break;

				case 3:
					System.out.println("Edit The First Name: ");
					setFname(sc.nextLine());
					break;

				case 4:
					System.out.println("Edit the Last Name: ");
					setLname(sc.nextLine());
					break;
				default:
					System.out.println("Wrong Choice");
					break;

				}
				System.out.println("Do you want to edit anything else or press 5 to exit");
				n = sc1.nextInt();
			}
		} else {
			System.out.println("Book your ticket first!!!");
			System.out.println("-------------------------------------------------------------");
		}
	}
}