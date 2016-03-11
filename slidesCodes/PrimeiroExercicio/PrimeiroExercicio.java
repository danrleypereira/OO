/**
 * Síntese Objetivo: calcular a média entre 3 alturas de pessoas Entrada: sem
 * entrada (só atribuições) Saída: média das alturas
 */

import java.util.Scanner;

public class PrimeiroExercicio {
	public static void main(String[] args) {
		// Declarações
		String valor;
		Scanner objeto = new Scanner( System.in );
		valor = objeto.nextLine();
		final int QTDE = 3; // quantidade de pessoas
		float altura1, altura2, altura3, mediaAlturas;
		// InstruçõeS	altura1 = 1.58F;
		altura2 = 2.07F;
		altura3 = 0.55F;
		mediaAlturas = (altura1 + altura2 + altura3) / QTDE;
		System.out.println("Média das alturas = " + mediaAlturas);
		System.out.println("Inserido na linha = " + valor);
		objeto.close();
	} // termina o método main()
} // encerra a descrição da classe