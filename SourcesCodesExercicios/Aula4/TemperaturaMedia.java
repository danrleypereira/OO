import java.util.Arrays;
import java.util.Scanner;

/**
 * Síntese: 
	 * Objetivo: Apresentar temperaturas;
	 * Entrada: Temperaturas médias de cada dia do mês de novembro;
	 * Saída: Maior e menor temperatura e o dia que as temperaturas foram iguais.
 */


public class TemperaturaMedia {
	
	final static int diasNoMes = 30;
	
	public static void main(String[] args) {
		
		float[] temperaturas = new float[diasNoMes];
		
		adicionarTemperaturas(temperaturas);
		
		apresentarTemperaturasIguais(temperaturas, diasNoMes);
		
		Arrays.sort(temperaturas);
		
		apresentarTemperaturaMaiorMenor(temperaturas);
		
	}
	
	public static void adicionarTemperaturas(float[] temperaturas){
		Scanner ler = new Scanner(System.in);
		String aux;
		for(int i=0; i<diasNoMes; i++){
			System.out.println("Dia "+ (i+1));
			do{
				aux = ler.next();
			}while( !(isNumeric(aux)) );
			temperaturas[i] = (float)Double.parseDouble(aux);
			System.out.println("Temperatura do dia "+ (i+1) +" = "+ temperaturas[i]);
		}
		ler.close();
	}
	
	private static void apresentarTemperaturaMaiorMenor(float[] temperaturas) {
		System.out.println("Maior temperatura no mês: "+ temperaturas[diasNoMes-1]);
		System.out.println("Menor temperatura no mês: "+ temperaturas[0]);
	}
	
	private static void apresentarTemperaturasIguais(float[] temperaturas, int tamanhoArray){
		int i,j;//variaveis de controle;
		for(i = 0; i<diasNoMes; i++){
			for(j=i+1; j<diasNoMes; j++){
				if(temperaturas[i] == temperaturas[j]){
					System.out.println("As temperaturas dos dias "+ (i+1) + " e "+ (1+j) + " são iguais.");
					System.out.println("Temperatura = " + temperaturas[i]);
				} 
			}
		}
	}
	
	public static boolean isNumeric(String str)  
	{  
		try  
		{  
			Double.parseDouble(str); 
		}  
		catch(NumberFormatException nfe)  
		{  
			System.out.println("Não é um número!\nDigite novamente");
			return false;  
		}  
		return true;  
	}

}