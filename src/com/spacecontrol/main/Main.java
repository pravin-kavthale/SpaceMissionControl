package com.spacecontrol.main;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 8;
		do {
			System.out.println("╔══════════════════════════════════════════════╗");
			System.out.println("║        🚀 SPACE MISSION CONTROL SYSTEM       ║");
			System.out.println("╠══════════════════════════════════════════════╣");
			System.out.println("║ 1. Astronaut Management                      ║");
			System.out.println("║ 2. Spacecraft Management                     ║");
			System.out.println("║ 3. Mission Management                        ║");
			System.out.println("║ 4. Launch Control                            ║");
			System.out.println("║ 5. Search & Filter                           ║");
			System.out.println("║ 6. Mission History                           ║");
			System.out.println("║ 7. System Statistics                         ║");
			System.out.println("║ 8. Exit                                      ║");
			System.out.println("╚══════════════════════════════════════════════╝");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			
			switch(choice)
			{
			
				case 1:
					Menu.showAstronautMenu(sc);
					break;
				case 2:
					Menu.showSpaceCraftMenu(sc);
					break;
				case 3:
					Menu.showMissionMenu(sc);
					break;
				case 4:
					Menu.showLaunchControlMenu(sc);
					break;
				case 5:
					break;
				case 6:
					Menu.showMissionHistoryMenu(sc);
					break;
				case 7:
					break;
				case 8:
					break;
				
			}
		}while (choice != 8);
		
		
		
		sc.close();
	}

}

