package com.spacecontrol.main;
import java.util.ArrayList;
import java.util.Scanner;

import com.spacecontrol.model.Astronaut;
import com.spacecontrol.service.AstronautService;


public class Menu {

	public static void showAstronautMenu(Scanner sc) {
		try  {

			System.out.println("\n\t===== ASTRONAUT MANAGEMENT =====");
			System.out.println("\t1. Register Astronaut");
			System.out.println("\t2. View All Astronauts");
			System.out.println("\t3. Search Astronaut");
			System.out.println("\t4. Update Astronaut");
			System.out.println("\t5. Remove Astronaut");
			System.out.println("\t6. View Available Astronauts");
			System.out.println("\t7. Sort Astronaut by ID");
			System.out.println("\t8. Back");
			
			ArrayList<Astronaut> arr = new ArrayList<Astronaut>();
			
			int choice;
			do {
				System.out.print("Enter choice: ");
				choice = sc.nextInt();

				switch (choice) {
					case 1:
						System.out.println();
						System.out.println("Enter astronautId name rank(TRAINEE,SPECIALIST, PILOT,  COMMANDER) specialization experience available");
						arr.add(new Astronaut(sc.nextInt(), sc.next(), sc.next(), sc.next(),sc.nextInt(), sc.nextBoolean()));
						break;

					case 2:
						AstronautService.listOfAstronaut(arr);
						break;

					case 3:
						AstronautService.searchAstronaut(arr, sc);
						break;

					case 4:
						AstronautService.updateAstronaut(arr, sc);
						break;

					case 5:
						AstronautService.removeAstronaut(arr, sc);
						break;

					case 6:
						AstronautService.AvalilableAstronaut(arr, sc);
						break;
					case 7:
						AstronautService.sortAstronaut(arr,sc);
						break;
					case 8:
						System.out.println("---------------Exiting--------------------------");
						break;
					default:
						System.out.println("Invalid choice");
						break;
				}
			} while (choice != 8);

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	public static void showMissionMenu(Scanner sc) {
		try {
			System.out.println("===== MISSION MANAGEMENT =====\r\n"
					+ "\r\n"
					+ "1. Create Mission\r\n"
					+ "2. View All Missions\r\n"
					+ "3. View Mission Details\r\n"
					+ "4. Update Mission\r\n"
					+ "5. Cancel Mission\r\n"
					+ "6. Assign Astronaut\r\n"
					+ "7. Remove Astronaut\r\n"
					+ "8. Assign Spacecraft\r\n"
					+ "9. Change Mission Priority\r\n"
					+ "10. Back");
			int choice;
			do {
				System.out.println("Enter your choice");
				choice = sc.nextInt();

				switch (choice) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						break;
					case 7:
						break;
					case 8:
						break;
					case 9:
						break;
					case 10:
						return;
					default:
						System.out.println("Invalid choice");
						break;
				}
			} while (choice != 0);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void showMissionHistoryMenu(Scanner sc) {
		try {
			System.out.println("===== MISSION HISTORY =====\r\n"
					+ "\r\n"
					+ "1. View Mission Event Log\r\n"
					+ "2. View Launch History\r\n"
					+ "3. View Completed Missions\r\n"
					+ "4. View Aborted Missions\r\n"
					+ "5. View Mission Timeline\r\n"
					+ "6. Back");
			int choice = 0;

			do {
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();

				switch (choice) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						return;
					default:
						System.out.println("Invalid choice");
						break;
				}
			} while (choice != 0);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void showSpaceCraftMenu(Scanner sc) {
		try{
			System.out.println("===== SPACECRAFT MANAGEMENT =====\r\n"
					+ "\r\n"
					+ "1. Register Spacecraft\r\n"
					+ "2. View All Spacecraft\r\n"
					+ "3. Search Spacecraft\r\n"
					+ "4. Update Spacecraft\r\n"
					+ "5. Remove Spacecraft\r\n"
					+ "6. Refuel Spacecraft\r\n"
					+ "7. Perform Maintenance\r\n"
					+ "8. View Available Spacecraft\r\n"
					+ "9. Back");

			int ch;

			do {
				System.out.println("Enter your choice");
				ch = sc.nextInt();

				switch (ch) {
					case 1:
						break;

					case 2:
						break;

					case 3:
						break;

					case 4:
						break;

					case 5:
						break;
					case 6:
						break;

					case 7:
						break;

					case 8:
						break;

					case 9:
						return;
					default:
						System.out.println("Invalid choice");
						break;
				}

			} while (ch != 0);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void showLaunchControlMenu(Scanner sc) {
		try{
			System.out.println("===== LAUNCH CONTROL =====\r\n"
					+ "\r\n"
					+ "1. View Launch-Ready Missions\r\n"
					+ "2. Run Pre-Launch Checks\r\n"
					+ "3. Prepare Mission\r\n"
					+ "4. Launch Mission\r\n"
					+ "5. Abort Mission\r\n"
					+ "6. Complete Mission\r\n"
					+ "7. View Active Missions\r\n"
					+ "8. Back");

			int choice;

			do {
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();

				switch (choice) {
					case 1:
						break;

					case 2:
						break;

					case 3:
						break;

					case 4:
						break;

					case 5:
						break;

					case 6:
						break;

					case 7:
						break;

					case 8:
						return;

					default:
						System.out.println("Invalid Choice");
						break;
				}
			} while (choice != 0);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
