import javax.swing.JOptionPane;
import java.util.Scanner;

public class Carro
{
  public String nomeCarro;
  public int capacidadeTanque;

  //método para configurar o nome do Carro
  void setCarro( String name, int tanque)
  {
    nomeCarro = name;//armazena o nome do carro
    capacidadeTanque = tanque;//armazena o nome do carro
  }

  //método para recuperar o nome do carro
  public String getCarroName()
  {
    return nomeCarro;
  }

  //método para recuperar a capacidade do tanque
  public int getCapacidadeTanque()
  {
    return capacidadeTanque;
  }


  public void inserirQuilometragens()
  {
    Scanner input = new Scanner( System.in );

    int[] viajens = new int[100];
    int sentinela = 0, contador = 0, quilometragemTotal = 0;

    System.out.println( "Entre com a quilometragem feita ou -1 para sair:" );
    viajens[contador++] = input.nextInt();

    while(sentinela != -1)
    {
      System.out.println( "Entre com a quilometragem feita ou -1 para sair:" );
      sentinela = input.nextInt();
      if(sentinela != -1){
        viajens[contador++] = sentinela;
      }
    }

    for(int i = 0; i<contador; i++)
    {
      quilometragemTotal += viajens[i];
    }

    determinarEficiencia( getCapacidadeTanque()*contador, quilometragemTotal );
  }

  public void determinarEficiencia(int litrosCombustivel, int quilometros)
  {
    System.out.println("litros de combustivel = " + litrosCombustivel);
    System.out.println("quilometros = " + quilometros);

    JOptionPane.showMessageDialog( null, "A eficiência do " +
        getCarroName() + " é "+ (float)quilometros/litrosCombustivel + " e o tamanho do tanque é"
         + getCapacidadeTanque() +"!", "Eficiência", JOptionPane.PLAIN_MESSAGE );
  }
}
