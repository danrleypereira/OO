import javax.swing.JOptionPane;

public class QuilometragemCombustivel
{
  public static void main(String[] args){
    String nome;
    int capacidade;

    //Usuário atribui o nome do carro
    nome = JOptionPane.showInputDialog(null,
      "Qual é o Nome do carro:",
      "Carro",
      JOptionPane.QUESTION_MESSAGE);

    //Usuário atribui a capacidade do Tanque em litros
    capacidade = Integer.parseInt(JOptionPane.showInputDialog(null,
        "Qual é a capacidade do tanque em litros?",
        "Tamanho do Tanque",
        JOptionPane.QUESTION_MESSAGE));

    //cria o objeto carro
    Carro carro1 = new Carro();

    carro1.setCarro(nome, capacidade);
    carro1.inserirQuilometragens();
  }
}
