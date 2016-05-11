package view;

import java.util.Vector;

import javax.swing.JOptionPane;

import model.International;
import model.National;

public class Procedures {
	public static boolean doYouWantContinue(String messageUser, String titleDialog){
		int option = JOptionPane.showConfirmDialog(null, messageUser, titleDialog, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if(option == JOptionPane.YES_OPTION){
			return true;
		}else{
			return false;
		}
	}
	public static int inputYearFoundation(){
		String year;
		do{
			year = JOptionPane.showInputDialog(null, "Qual é o ano?", "Inseri ano", JOptionPane.PLAIN_MESSAGE);
		}
		while(!(controller.Validate.isInt(year) && controller.Validate.isMoreThan(Integer.parseInt(year), 1800)));
		return Integer.parseInt(year);
	}
	public static int inputNumber(){
		String number;
		do{
			number = JOptionPane.showInputDialog(null, "Qual é o número de títulos nacionais?", "Inseri número de títulos", JOptionPane.PLAIN_MESSAGE);
		}
		while(!(controller.Validate.isInt(number) && controller.Validate.isMoreThan(Integer.parseInt(number), 0)));
		return Integer.parseInt(number);
	}
	public static String inputName(){
		String name;
		while(!controller.Validate.isName(name = JOptionPane.showInputDialog(null, "Qual é o nome?", "Inseri Nome", JOptionPane.PLAIN_MESSAGE)));
		return name;
		
	}
	public static String whatIsChampion(){
		String internationalChampion;
		do{
			internationalChampion = JOptionPane.showInputDialog(null, "Qual é o título internacional?", "Título", JOptionPane.PLAIN_MESSAGE);
		}while(!controller.Validate.isName(internationalChampion));
		return internationalChampion;
	}
	public static boolean isTeamInternational(){
		String[] escolha = {"Nacional", "Internacional"};
		if(1 == JOptionPane.showOptionDialog(null, "Qual é a classificação do time?", "Time", 0, JOptionPane.INFORMATION_MESSAGE, null, escolha, escolha[0]))
		{
			return true;
		}else{
			return false;
		}
	}
	public static void showTeamsNational(Vector<National> teamsNational){
		if(teamsNational.size() != 0){
			System.out.println("Nacional\n");
		}else{
			Error.error("Não há time Nacional cadastrado!");
		}
		for(int i=0; i<teamsNational.size(); i++) {
			System.out.printf("%s\t%d\t%d\n", teamsNational.get(i).getName(), 
					teamsNational.get(i).getYearFoundation(), teamsNational.get(i).getNumberChampions());
		}
	}
	//@Override
	public static void showTeamsInternational (Vector<International> teamsInternational){
		if(teamsInternational.size() != 0){
			System.out.println("Internacional\n");
		}else{
			Error.error("Não há time Internacional cadastrado!");
		}
		for(int i=0; i<teamsInternational.size(); i++) {
			System.out.printf("%s\t%d\n", teamsInternational.get(i).getName(), 
					teamsInternational.get(i).getYearFoundation());
			for(int j = 0; j < teamsInternational.get(i).getNumberChampions(); j++){
				System.out.println("Título: " + teamsInternational.get(i).getChampionAt(j));
			}
		}
	}
	public static void showNumberChampionsInternational(Vector<International> teamInternational){
		int auxNumberChampions = 0;
		for(int i=0; i< teamInternational.size(); i++){
			auxNumberChampions += teamInternational.get(i).getNumberChampions();
		}
		JOptionPane.showConfirmDialog(null, "Número de títulos é: " +auxNumberChampions, "Títulos", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
	}
	public static void showNumberChampionsNational(Vector<National> teamNational){
		int auxNumberChampions = 0;
		for(int i=0; i< teamNational.size(); i++){
			auxNumberChampions += teamNational.get(i).getNumberChampions();
		}
		JOptionPane.showConfirmDialog(null, "Número de títulos é: " +auxNumberChampions, "Títulos", JOptionPane.OK_OPTION, JOptionPane.PLAIN_MESSAGE);
	}
	public static void menu(Vector<International> teamsInternational, Vector<National> teamsNational){
		String[] escolha = {"NOVO", "LISTAR TODOS", "Ver títulos", "Sair"};
		int answer = JOptionPane.showOptionDialog(null, "Escolha um opção", "Menu", 0, JOptionPane.INFORMATION_MESSAGE, null, escolha, escolha[0]);
		switch(escolha[answer]){
			case "NOVO":
				if(isTeamInternational()){
					teamsInternational.add(new International(inputName(), inputYearFoundation()));
				}else{
					teamsNational.add(new National(inputName(), inputYearFoundation(), inputNumber()));
				}
				break;
			case "LISTAR TODOS":
				showTeamsNational(teamsNational);
				showTeamsInternational(teamsInternational);
				break;
			case "Ver títulos":
				if(isTeamInternational()){
					showNumberChampionsInternational(teamsInternational);
				}else{
					showNumberChampionsNational(teamsNational);
				}
				break;
			case "Sair":
				System.exit(0);
				break;
		}
	}
}
