package com.spacecontrol.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import com.spacecontrol.model.Astronaut;

public class AstronautService{

	public static void listOfAstronaut(ArrayList<Astronaut> arr)
	{
		System.out.println("------------------List of Astronaut-----------------");
		for (Astronaut a: arr)
		{
			System.out.println(a);
		}
	}
	
	public static Astronaut searchAstronaut(ArrayList<Astronaut> arr,Scanner sc)
	{
		System.out.println("Enter Astronaut id to search");
		int id = sc.nextInt();
		
		for (Astronaut a:arr)
		{
			if (a.getAstronautId() == id)
			{
				System.out.println("Astropnaut details: "+a);
				return a;
			}
		}
		System.out.println("Astronaut not found");
		return null;
	}
	
	public static void updateAstronaut(ArrayList<Astronaut> arr,Scanner sc)
	{
		
		Astronaut a = AstronautService.searchAstronaut(arr, sc);
		System.out.println("previous Details: " + a);
		System.out.println("Enter new details: (name rank Specialization experience setAvailable)");
		a.setName(sc.next());
		a.setRank(sc.next());
		a.setSpecialization(sc.next());
		a.setExperience(sc.nextInt());
		a.setAvailable(sc.nextBoolean());
		System.out.println("new Details: "+ a);
		
		
	}
	
	public static void removeAstronaut(ArrayList<Astronaut> arr, Scanner sc)
	{
		 Astronaut a =AstronautService.searchAstronaut(arr,sc);
		 arr.remove(a);
		 System.out.println("Astronaut removed");
	}
	
	public static void AvalilableAstronaut(ArrayList<Astronaut> arr, Scanner sc)
	{
		System.out.println("-------------------List of available Astronaut-----------------------");
		for(Astronaut a: arr)
		{
			if (a.isAvailable())
			{
				System.out.println(a);
			}
		}
	}
	
	public static void sortAstronaut(ArrayList<Astronaut> arr, Scanner sc)
	{
		Collections.sort(arr);
		
		for (Astronaut a: arr)
		{
			System.out.println(a);
		}
	}
	
}