import javax.swing.JOptionPane;
import java.util.Scanner;

public class QuilometragemCombustivel
{
  public static void main(String[] args){
    //Cria Scanner para obter entrada a partir da janela de comando.
    Scanner input = new Scanner( System.in );
    String nome;
    int capacidade;
    System.out.println("Adicione o Nome e a capacidade em litros do carro:");
    nome = input.nextLine();
    capacidade = input.nextInt();


    Carro carro1 = new Carro();

    carro1.setCarro(nome, capacidade);
    carro1.inserirQuilometragens();

  }
}
