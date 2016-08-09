package controller;

import view.Error;

public class Validate {
	public static boolean isName(String name){
		try {
			Float.parseFloat(name);
			Integer.parseInt(name);
			view.Error.error("Não pode ser um número.");
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}
	public static boolean isMinusThan(int number, int referenceNumber){
		if(number < referenceNumber){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isMoreThan(int number, int referenceNumber){
		if(number > referenceNumber){
			return true;
		}else{
			Error.error("Número tem que ser maior que " + referenceNumber);
			return false;
		}
	}
	public static boolean isInt(String integer){
		int aux;
		try {
			aux = Integer.parseInt(integer);
			if(aux>0){
				return true;
			}else{
				view.Error.error("Não pode ser um número negativo.");
				return false;
			}
		} catch (NumberFormatException e) {
			view.Error.error();
			return false;
		}
	}
}
