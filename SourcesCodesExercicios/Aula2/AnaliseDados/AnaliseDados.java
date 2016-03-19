import java.util.ArrayList;
import java.util.Scanner;

/**
 * Síntese Objetivo: Analisar conjunto de dados; Entrada: peso e sexo de 20
 * pessoas; Saída: maior e menor peso informado, média dos pesos dos homens e
 * número de mulheres.
 */

public class AnaliseDados {
	public static void main(String[] args) {
		// declarações
		Scanner ler = new Scanner(System.in);
		final int NUMERO_PESSOAS = 3;
		int numeroMachos = 0, numeroFemeas = 0;
		ArrayList<Pessoa> conjuntoPessoas = new ArrayList<Pessoa>();
		double[] pesosOrdem = new double[NUMERO_PESSOAS];
		double[] pesosHomens = new double[NUMERO_PESSOAS];

		// instruções
		for (int j = 0; j < NUMERO_PESSOAS; j++) {
			Pessoa usuario = new Pessoa();
			conjuntoPessoas.add(usuario);
		}
		// for(int j=0; j< NUMERO_PESSOAS; j++)
		// conjuntoPessoasList.add(new Pessoas());
		// Pessoas[] conjuntoPessoas = (Pessoas[])
		// conjuntoPessoasList.toArray();
		//

		conjuntoPessoas = povoarArray(conjuntoPessoas, NUMERO_PESSOAS, ler);

		for (int i = 0; i < NUMERO_PESSOAS; i++) {
			pesosOrdem[i] = conjuntoPessoas.get(i).getPeso();
			System.out.println("pesosOrdem = " + pesosOrdem[i]);
			if(conjuntoPessoas.get(i).getSexo().equals("MACHO")){
				System.out.println("pesosOrdem in if= " + pesosOrdem[i]);
				pesosHomens[i] = conjuntoPessoas.get(i).getPeso();//aqui está o erro;
				System.out.println("pesosHomens = " + pesosHomens );
				numeroMachos++;
			}else{
				numeroFemeas++;
			}
		}

		quickSort(pesosOrdem, 0, (NUMERO_PESSOAS - 1));

		System.out.println("Maior peso informado:\t" + pesosOrdem[NUMERO_PESSOAS - 1]);
		System.out.println("Menor peso informado:\t" + pesosOrdem[0]);
		System.out.println("Média dos pesos dos Homens:\t" + mediaElementosArray(pesosHomens, numeroMachos));
		System.out.println("Número de Femeas:\t" + numeroFemeas);
		
		ler.close();

	}
	
	private static double mediaElementosArray(double[] pesoHomens, int tamanhoArray){
		double pesoAux = 0;
		for(int i=0; i<tamanhoArray; i++){
			pesoAux += pesoHomens[i];
			System.out.println(pesoHomens[i] + "i = " + i);
		}
		return (pesoAux/(double)tamanhoArray);
	}
	
	public static ArrayList<Pessoa> povoarArray(ArrayList<Pessoa> conjuntoPessoas, int numeroPessoas, Scanner ler) {
		for (int indexPessoa = 0; indexPessoa < numeroPessoas; indexPessoa++) {
			conjuntoPessoas.get(indexPessoa).inserirSexo(ler);
			conjuntoPessoas.get(indexPessoa).inserirPeso(indexPessoa, ler);
		}
		return conjuntoPessoas;
	}

	public static void quickSort(double[] Array, int esq, int dir) {
		int pivo = esq, i, j;
		double aux;
		for (i = esq + 1; i <= dir; i++) {
			j = i;
			if (Array[j] < Array[pivo]) {
				aux = Array[j];
				while (j > pivo) {
					Array[j] = Array[j - 1];
					j--;
				}
				Array[j] = aux;
				pivo++;
			}
		}
		if (pivo - 1 > esq) {
			quickSort(Array, esq, pivo - 1);
		}
		if (pivo + 1 < dir) {
			quickSort(Array, pivo + 1, dir);
		}
	}
}
