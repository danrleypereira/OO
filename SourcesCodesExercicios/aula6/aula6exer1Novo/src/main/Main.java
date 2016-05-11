package main;
import java.util.Vector;

import model.International;
import model.National;
/*Síntese:
 * 	Objetivo: Cadastrar times Internacionais e nacionais com seus respectivos títulos;
 * 	Entrada: Times e suas especificações;
 * 	Saída: Times em formato tabelar.
 * 
 */

public class Main {
	public static void main(String[] args) {
		Vector<International> teamsInternational = new Vector<International>();
		Vector<National> teamsNational = new Vector<National>();
		while(true){
			view.Procedures.menu(teamsInternational, teamsNational);
		}
	}
}
