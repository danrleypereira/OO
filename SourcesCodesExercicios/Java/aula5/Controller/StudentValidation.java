package Controller;

import java.util.ArrayList;

import Model.Student;

/**
 * Excessão: 
 * 	Entrada1: 
 * 			Nome: Danrley Sapo Largado;
 * 			Matrícula: 0223;
 * 			média final: 8;
 * 	Entrada2:
 * 			Nome: Gois da Silva Largado;
 * 			Matrícula: 230;
 * 			média final: 20;
 * 	Entrada3: 
 * 			Nome: Gabriela Friends Forever;
 * 			Matrícula: mil;
 * 			média final: 2;
			
 * **/


public class StudentValidation {

	public static boolean validationName(String text) {
		if(text.isEmpty()){
			return false;
		}else{
			return true;
		}
	}

	public static boolean validationRegistration(String text, ArrayList<Student> arrayStudent) {
		try{
			int registration = Integer.parseInt(text);
			if(registration > 1000 | registration < 0){
				return false;
			}else{
				return true;
			}
		}catch(Exception e){
			return false;
		}
	}

	public static boolean validationAverage(String textAverage) {
		try{
			float average = Float.parseFloat(textAverage);
			if(average > 10 | average < 0){
				return false;
			}else{
				return true;
			}
		}catch(Exception e){
			return false;
		}
			
	}
		
		
	
}
