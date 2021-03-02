package flight_Reservation_System;

import java.util.Scanner;

public class flightReservationSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boardingPass bp = new boardingPass();

		while (true) {
			System.out.println("________________________________________________________________");
			System.out.println();
			System.out.println("************************WELCOME TO INDIGO***********************");
			System.out.println("________________________________________________________________");
			System.out.println("----------------------------------------------------------------");
			System.out.println("1. BOOK A FLIGHT");
			System.out.println("2. WEB CHECK-IN");
			System.out.println("3. KNOW YOUR FLIGHT STATUS");
			System.out.println("4. EDIT BOOKING");
			System.out.println("5. GET YOUR BOARDING PASS");
			System.out.println("6. EXIT");
			System.out.println("----------------------------------------------------------------");

			System.out.println("Enter your choice::");
			int choice = sc.nextInt();
			System.out.println("-------------------------------------------------------------");

			switch (choice) {
			case 1: {

				System.out.println("1. One Way Trip");
				System.out.println("2. Round Trip");

				System.out.println("-------------------------------------------------------------");

				switch (sc.nextInt()) {
				case 1:
					bp.oneWay();
					bp.intakeDetails();
					bp.payableAmount();
					break;
				case 2:
					bp.roundTrip();
					bp.intakeDetails();
					bp.payableAmount();
					break;
				default:
					System.out.println("Incorrect input!!! Please re-enter choice from our menu");
				}
				break;
			}

			case 2:
				bp.pnrGeneration();
				bp.checkInDetails();
				break;
			case 3:
				bp.showStatus();
				break;
			case 4:
				bp.editBookingDetails();
				break;
			case 5:
				bp.t.boardingPassGenerator();
				break;
			case 6:
				System.out.println("Thank you for Flying with INDIGO");
				System.out.println("-------------------------------------------------------------");
				System.exit(0);
			default:
				System.out.println("Incorrect input!!! Please re-enter choice from our menu");
				break;

			}

		}

	}

}
