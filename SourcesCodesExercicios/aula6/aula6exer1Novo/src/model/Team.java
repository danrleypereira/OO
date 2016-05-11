package model;

public abstract class Team {
	protected String name;
	protected int yearFoundation;
	public Team(String name, int yearFoundation) {
		this.name = name;
		this.yearFoundation = yearFoundation;
	}
	public String getName() {
		return name;
	}
	public int getYearFoundation() {
		return yearFoundation;
	}	
	
}
