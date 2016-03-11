import javax.swing.JOptionPane;

public class Carro
{
  public String nomeCarro;
  public int capacidadeTanque;

  //método para configurar o nome do Carro
  void setCarro( String name, int tanque)
  {
    this.nomeCarro = name;//armazena o nome do carro
    this.capacidadeTanque = tanque;//armazena o nome do carro
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

    int[] viajens = new int[100];
    int contador = 0, quilometragemTotal = 0;
    String dialogInput;
    do{
      dialogInput = JOptionPane.showInputDialog(null,
          "Entre com a quilometragem feita ou clique em cancelar para sair:",
          "quilometragem",
          JOptionPane.QUESTION_MESSAGE);

      //Valida os dados inseridos
      if( dialogInput != null )
      {
            System.out.println("dialogInput" + dialogInput);
            viajens[contador++] = Integer.parseInt(dialogInput);
      }

    }while( (dialogInput != null) );

    //Soma a quilometragem de cada viajem à quilometragemTotal
    for(int i = 0; i<contador; i++)
    {
      quilometragemTotal += viajens[i];
    }

    //Chama o método para determinar a Eficiência
    this.determinarEficiencia( this.getCapacidadeTanque()*contador, quilometragemTotal );
  }

  public void determinarEficiencia(int litrosCombustivel, int quilometros)
  {

    JOptionPane.showMessageDialog( null, "A eficiência do " +
        this.getCarroName() + " é "+ (float)quilometros/litrosCombustivel +
        "Km/L e o tamanho do tanque é " + this.getCapacidadeTanque() +" litros!",
        "Eficiência", JOptionPane.INFORMATION_MESSAGE );
  }
}
