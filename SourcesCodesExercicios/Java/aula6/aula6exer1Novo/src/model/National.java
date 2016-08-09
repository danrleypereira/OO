package model;

public class National extends Team{
	private int numberChampions;

	public National(String name, int yearFoundation, int numberChampions) {
		super(name, yearFoundation);
		this.numberChampions = numberChampions;
	}

	public int getNumberChampions() {
		return this.numberChampions;
	}	
	
}
