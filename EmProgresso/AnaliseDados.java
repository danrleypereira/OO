import java.util.Scanner;
import java.util.ArrayList;


public class AnaliseDados {

	/** Síntese 
	*    Objetivo: Analisar conjunto de dados;
	*    Entrada:  peso e sexo de 20 pessoas;
	*    Saída:    maior e menor peso informado, média dos pesos
	*    dos homens e número de mulheres.
	*/
	public static void main(String[] args) {
		// declarações
		final int NUMERO_PESSOAS = 20;
		ArrayList<Pessoas> conjuntoPessoasList = new ArrayList<Pessoas>();
		int[] pesosOrdem = new int[NUMERO_PESSOAS];
		//instruções
		for(int j=0; j< NUMERO_PESSOAS; j++)
			conjuntoPessoasList.add(new Pessoas);
		Pessoas[] conjuntoPessoas = conjuntoPessoasList.toArray();
		
		
		povoarArray(conjuntoPessoas, NUMERO_PESSOAS);
		
		for(int i=0; i<conjuntoPessoas.size(); i++){
			pesosOrdem[i] = conjuntoPessoas.get(i).getPeso();
		}
		
		quickSort(pesosOrdem, 0, (NUMERO_PESSOAS-1));
		
		System.out.println("Maior peso informado:\t" + pesosOrdem[NUMERO_PESSOAS-1]);
		System.out.println("Menor peso informado:\t" + pesosOrdem[0]);
		
		
		
	}
	
	public static void povoarArray(ArrayList<Pessoas> conjuntoPessoas, int numeroPessoas){
		for(int i = 0; i < numeroPessoas; i++){
			conjuntoPessoas.get(i).inserirSexo();
			conjuntoPessoas.get(i).inserirPeso(i);
		}
	}
	
	public static void quickSort(int[] Array, int esq, int dir){
	    int pivo = esq,i,ch,j;
	    for(i=esq+1;i<=dir;i++){
	        j = i;
	        if(Array[j] < Array[pivo]){
	         ch = Array[j];
	         while(j > pivo){    
	            Array[j] = Array[j-1];
	            j--;
	         }
	         Array[j] = ch;
	         pivo++;        
	        }  
	    }
	    if(pivo-1 > esq){
	        quickSort(Array,esq,pivo-1);
	    }
	    if(pivo+1 < dir){
	        quickSort(Array,pivo+1,dir);
	    }
	}
}