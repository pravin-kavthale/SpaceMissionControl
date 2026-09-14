package com.spacecontrol.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.spacecontrol.model.Astronaut;

public class AstronautService{

	public static void listOfAstronaut(ArrayList<Astronaut> arr)
	{
		try {
			if (arr == null) {
				throw new IllegalArgumentException("Astronaut list cannot be null");
			}
			System.out.println("------------------List of Astronaut-----------------");
			for (Astronaut a: arr)
			{
				System.out.println(a);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Unable to list astronauts: " + e.getMessage());
		}
	}
	
	public static Astronaut searchAstronaut(ArrayList<Astronaut> arr,Scanner sc)
	{
		try {
			if (arr == null || sc == null) {
				throw new IllegalArgumentException("Astronaut list and scanner are required");
			}
			System.out.println("Enter Astronaut id to search");
			int id = sc.nextInt();
			for (Astronaut a:arr)
			{
				if (a != null && a.getAstronautId() == id)
				{
					System.out.println("Astronaut details: "+a);
					return a;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Astronaut ID must be a whole number.");
			sc.nextLine();
			return null;
		} catch (IllegalArgumentException e) {
			System.out.println("Unable to search astronauts: " + e.getMessage());
			return null;
		}
		System.out.println("Astronaut not found");
		return null;
	}
	
	public static void updateAstronaut(ArrayList<Astronaut> arr,Scanner sc)
	{
		try {
			Astronaut a = AstronautService.searchAstronaut(arr, sc);
			if (a == null) {
				return;
			}
			System.out.println("previous Details: " + a);
			System.out.println("Enter new details: (name rank Specialization experience setAvailable)");
			a.setName(sc.next());
			a.setRank(sc.next());
			a.setSpecialization(sc.next());
			a.setExperience(sc.nextInt());
			a.setAvailable(sc.nextBoolean());
			System.out.println("new Details: "+ a);
		} catch (InputMismatchException e) {
			System.out.println("Invalid astronaut details. Check the value types and try again.");
			sc.nextLine();
		} catch (IllegalArgumentException e) {
			System.out.println("Unable to update astronaut: " + e.getMessage());
		}
	}
	
	public static void removeAstronaut(ArrayList<Astronaut> arr, Scanner sc)
	{
		try {
			Astronaut a = AstronautService.searchAstronaut(arr,sc);
			if (a == null) {
				return;
			}
			arr.remove(a);
			System.out.println("Astronaut removed");
		} catch (IllegalArgumentException e) {
			System.out.println("Unable to remove astronaut: " + e.getMessage());
		}
	}
	
	public static void AvalilableAstronaut(ArrayList<Astronaut> arr, Scanner sc)
	{
		try {
			if (arr == null) {
				throw new IllegalArgumentException("Astronaut list cannot be null");
			}
			System.out.println("-------------------List of available Astronaut-----------------------");
			for(Astronaut a: arr)
			{
				if (a != null && a.isAvailable())
				{
					System.out.println(a);
				}
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Unable to list available astronauts: " + e.getMessage());
		}
	}
	
	public static void sortAstronaut(ArrayList<Astronaut> arr, Scanner sc)
	{
		try {
			if (arr == null) {
				throw new IllegalArgumentException("Astronaut list cannot be null");
			}
			Collections.sort(arr);
			for (Astronaut a: arr)
			{
				System.out.println(a);
			}
		} catch (IllegalArgumentException | NullPointerException e) {
			System.out.println("Unable to sort astronauts: " + e.getMessage());
		}
	}
	
}