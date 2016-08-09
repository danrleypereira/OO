package Controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Model.Student;


public class Procedures {

	public static boolean doesUserWantContinue(){
		
		int optionPanel = JOptionPane.showConfirmDialog(null,"Você quer adiconar um aluno?","Principal", JOptionPane.YES_NO_OPTION);

		switch (optionPanel) {
		case JOptionPane.YES_OPTION:
		  return true;
		case JOptionPane.NO_OPTION:
		  return false;
		default:
			return false;
		}
	}

	public static void registerStudent(String name, String registration, float average, ArrayList<Student> arrayStudent){		
		Student student = new Student(name, registration, average);
		arrayStudent.add(student);
	}
	
	public static boolean doesRegistrationExist(int registration, ArrayList<Student> arrayStudent){
		for(int i=0; i<arrayStudent.size(); i++){
			if( registration == Integer.parseInt(( arrayStudent.get(i).getRegistration())) ){
				return true;
			}
		}
		return false;
		
	}
}
