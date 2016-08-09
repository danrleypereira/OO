package Model;


public class Student {
	private String name;
	private String registration;
	private float average;
	
	public Student(String name, String registration, float average){
		this.name = name;
		this.registration = registration;
		this.average = average;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	
	public void setAverage(float average) {
		this.average = average;
	}
	
	public String getName() {
		return name;
	}
	
	public String getRegistration() {
		return registration;
	}
	
	public float getAverage() {
		return average;
	}
}
