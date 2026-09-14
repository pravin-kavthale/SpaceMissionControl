package com.spacecontrol.model;
import java.util.HashSet;

import com.spacecontrol.enums.*;

public class Mission {

    private int missionId;
    private String missionName;
    private String destination;
    private MissionType missionType;
	private MissionPriority priority;
	private MissionStatus status;
	private int duration;

	private HashSet<Astronaut> crew;
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
	public void setMissionType(String missionType) {
		this.missionType = MissionType.valueOf(missionType.toUpperCase());
	}
	public MissionPriority getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = MissionPriority.valueOf(priority.toUpperCase());
	}
	public MissionStatus getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = MissionStatus.valueOf(status.toUpperCase());
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public HashSet<Astronaut> getCrew() {
		return crew;
	}
	public void addCrewMember(Astronaut crewMember) {
		this.crew.add(crewMember);
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
	public Mission(int missionId, String missionName, String destination, String missionType,
			String priority, String status, int duration, HashSet<Astronaut> crew,
			Spacecraft spacecraft) {
		super();
		this.missionId = missionId;
		this.missionName = missionName;
		this.destination = destination;
		this.missionType = MissionType.valueOf(missionType.toUpperCase());
		this.priority = MissionPriority.valueOf(priority.toUpperCase());
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
