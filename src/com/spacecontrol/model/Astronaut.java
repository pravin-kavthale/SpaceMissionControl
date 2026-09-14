package com.spacecontrol.model;

import com.spacecontrol.enums.AstronautRank;

public class Astronaut implements Comparable<Astronaut>{

    private int astronautId;
    private String name;
    private AstronautRank rank;
    private String Specialization;
    private int experience;
    private boolean available;

    public int getAstronautId() {
        return astronautId;
    }

    public String getName() {
        return name;
    }

    public AstronautRank getRank() {
        return rank;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(String rank) {
        try {
            this.rank = AstronautRank.valueOf(rank.toUpperCase());
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid astronaut rank: " + rank, e);
        }
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Astronaut(int astronautId, String name, String rank, String specialization, int experience, boolean available) {
        this.astronautId = astronautId;
        this.name = name;
        try {
            this.rank = AstronautRank.valueOf(rank.toUpperCase());
        } catch (NullPointerException | IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid astronaut rank: " + rank, e);
        }
        this.Specialization = specialization;
        this.experience = experience;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Astronaut [astronautId=" + astronautId + ", name=" + name + ", rank=" + rank + ", Specialization="
                + Specialization + ", experience=" + experience + ", available=" + available + "]";
    }

	@Override
	public int compareTo(Astronaut o) {
        if (o == null) {
            throw new NullPointerException("Astronaut to compare cannot be null");
        }
        return Integer.compare(this.astronautId, o.astronautId);
	}

}
