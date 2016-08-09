package model;


public class International extends Team{
	private String[] champions = new String[100];
	private int numberChampions = 0;

	public International(String name, int yearFoundation) {
		super(name, yearFoundation);
		while(view.Procedures.doYouWantContinue("Quer adicionar um novo título?", "Adicionar Título")){
			if(controller.Validate.isMinusThan(numberChampions, 100)){
				this.champions[this.numberChampions++] = view.Procedures.whatIsChampion();
			}else{
				view.Error.error("Máximo de títulos atinjido!");
				break;
			}
		}
	}
	public String[] getChampions() {
		return this.champions;
	}
	public String getChampionAt(int index){
		return this.champions[index];
	}
	public int getNumberChampions() {
		return numberChampions;
	}
}
