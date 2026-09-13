package com.spacecontrol.model;
import java.util.ArrayList;
import com.spacecontrol.enums.*;

public class Mission {

    private int missionId;
    private String missionName;
    private String destination;
    private MissionType missionType;
	private MissionPriority priority;
	private MissionStatus status;
	private int duration;

	private ArrayList<Astronaut> crew;
	private Spacecraft spacecraft;
	
	
	public String getMissionName() {
		return missionName;
	}
	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public MissionType getMissionType() {
		return missionType;
	}
	public void setMissionType(MissionType missionType) {
		this.missionType = missionType;
	}
	public MissionPriority getPriority() {
		return priority;
	}
	public void setPriority(MissionPriority priority) {
		this.priority = priority;
	}
	public MissionStatus getStatus() {
		return status;
	}
	public void setStatus(MissionStatus status) {
		this.status = status;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public ArrayList<Astronaut> getCrew() {
		return crew;
	}
	public void setCrew(ArrayList<Astronaut> crew) {
		this.crew = crew;
	}
	public Spacecraft getSpacecraft() {
		return spacecraft;
	}
	public void setSpacecraft(Spacecraft spacecraft) {
		this.spacecraft = spacecraft;
	}
	public int getMissionId() {
		return missionId;
	}
	public Mission(int missionId, String missionName, String destination, MissionType missionType,
			MissionPriority priority, MissionStatus status, int duration, ArrayList<Astronaut> crew,
			Spacecraft spacecraft) {
		super();
		this.missionId = missionId;
		this.missionName = missionName;
		this.destination = destination;
		this.missionType = missionType;
		this.priority = priority;
		this.status = status;
		this.duration = duration;
		this.crew = crew;
		this.spacecraft = spacecraft;
	}
	@Override
	public String toString() {
		return "Mission [missionId=" + missionId + ", missionName=" + missionName + ", destination=" + destination
				+ ", missionType=" + missionType + ", priority=" + priority + ", status=" + status + ", duration="
				+ duration + ", crew=" + crew + ", spacecraft=" + spacecraft + "]";
	}
	
	
}
