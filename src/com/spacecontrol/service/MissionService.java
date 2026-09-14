package com.spacecontrol.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.spacecontrol.*;
import com.spacecontrol.model.Astronaut;
import com.spacecontrol.model.Mission;

class MissionService
{
//	System.out.println("===== MISSION MANAGEMENT =====\r\n"
//			+ "\r\n"
//			+ "1. Create Mission\r\n"
//			+ "2. View All Missions\r\n"
//			+ "3. View Mission Details\r\n"
//			+ "4. Update Mission\r\n"
//			+ "5. Cancel Mission\r\n"
//			+ "6. Assign Astronaut\r\n"
//			+ "7. Remove Astronaut\r\n"
//			+ "8. Assign Space craft\r\n"
//			+ "9. Change Mission Priority\r\n"
//			+ "10. Back");
	public static void ShowMissions(ArrayList<Mission> arr) {
		System.out.println("---------------List of Missions------------------");
		for (Mission m : arr)
		{
			System.out.println(m);
		}
		
	}
	
	public static Mission searchMission(ArrayList<Mission> arr, Scanner sc )
	{
		System.out.println("Enter the Mission id: ");
		int id = sc.nextInt();
		for(Mission m : arr)
		{
			if (m.getMissionId() == id)
			{
				System.out.println("Mission details: "+m);
				return m;
			}
		}
		return null;
		
	}
	
	
	public void UpdateMission(ArrayList<Mission> arr,Scanner sc )
	{
		
		Mission m = MissionService.searchMission(arr, sc);
		
		System.out.println("Enter the new mission details: ( "
				+ "    missionName;\r\n"
				+ "    destination;\r\n"
				+ "    missionType (EXPLORATION RESEARCH SATELLITE CARGO RESCUE );\r\n"
				+ "	   priority(LOW MEDIUM HIGH CRITICAL);\r\n"
				+ "	   status (PLANNED SCHEDULED PREPARING READY LAUNCHED IN_PROGRESS COMPLETED ABORTED)\r\n"
				+ "    duration;)");
		
		m.setMissionName(sc.next());
		m.setDestination(sc.next());
		m.setMissionType(sc.next());
		m.setPriority(sc.next());
		m.setStatus(sc.next());
		m.setDuration(sc.nextInt());
		System.out.println("Updated Details "+ m);
		
	}
	
	public void CancelMission(ArrayList<Mission> arr,Scanner sc)
	{
		Mission m= MissionService.searchMission(arr, sc);
		m.setStatus("ABORTED");
		System.out.println(m.getMissionId()+"Mision Canceled");
		
	}
	
	public void AddCrewMember(Astronaut a,Mission m)
	{	
		m.addCrewMember(a);
	}
	
	
	
	
	
	
}