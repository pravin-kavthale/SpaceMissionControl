package com.spacecontrol.model;
import com.spacecontrol.enums.SpacecraftStatus;


public class Spacecraft {

	private int spacecraftId;
	private String name;
	private String type;
	private int 	capacity;
	private int 	fuelLevel;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getFuelLevel() {
		return fuelLevel;
	}
	public void setFuelLevel(int fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	public SpacecraftStatus getStatus() {
		return status;
	}
	public void setStatus(SpacecraftStatus status) {
		this.status = status;
	}
	public int getSpacecraftId() {
		return spacecraftId;
	}
	
	
	
	
	public Spacecraft(int spacecraftId, String name, String type, int capacity, int fuelLevel,
			SpacecraftStatus status) {
		super();
		this.spacecraftId = spacecraftId;
		this.name = name;
		this.type = type;
		this.capacity = capacity;
		this.fuelLevel = fuelLevel;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Spacecraft [spacecraftId=" + spacecraftId + ", name=" + name + ", type=" + type + ", capacity="
				+ capacity + ", fuelLevel=" + fuelLevel + ", status=" + status + "]";
	}
	private SpacecraftStatus status;
}
