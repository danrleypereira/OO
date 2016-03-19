import java.text.DecimalFormat;
import java.util.Scanner;

public class Pessoa{
	private String sexo;
	private double peso;
	DecimalFormat mascara = new DecimalFormat("0.###");
	
	public double getPeso() {
		return peso;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setPeso(double peso) {
		this.peso = Double.parseDouble(mascara.format(peso));
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void inserirSexo(Scanner ler){
		//inserção e validação da string inserida pelo usuário
		String usuarioDeclaracao;
		System.out.println("Qual é o seu sexo?");
		int i = 0; //para validação;
		do{
			//sexo de acordo com a teoria de gênero
			if(i != 0){
				System.out.println("Sexo inválido, tente MACHO ou FEMEA. Qual é o seu sexo?");
			}
			usuarioDeclaracao = ler.next();
			i++;
		/*compara a string inserida com MACHO(caseInsensitive) e imprime MACHO ou FEMEA**/
		}while( !( usuarioDeclaracao.equalsIgnoreCase("macho") | usuarioDeclaracao.equalsIgnoreCase("femea") ) );
		
		//seta o sexo que o usuário definiu
		usuarioDeclaracao = usuarioDeclaracao.toUpperCase();
		
		if(usuarioDeclaracao.equals("MACHO")){
			this.setSexo("MACHO") ;
		}else{
			this.setSexo("FEMEA");
		}
	}
	
	public void inserirPeso(int indicePessoa, Scanner ler){
		double peso;
		System.out.println("Insira o peso da pessoa de nº"+(indicePessoa+1)+":\t");
		while( !(ler.hasNextDouble() && ( (peso = ler.nextDouble()) > 0 )) ){
			System.out.println("inválido");
			ler.next();
		}
		System.out.println("Peso = " + peso);
		this.setPeso( Double.parseDouble(mascara.format(peso)) );
	}
}
