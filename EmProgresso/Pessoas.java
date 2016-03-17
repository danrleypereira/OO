import java.util.Scanner;

public class Pessoas{
	private String sexo;
	private int peso;
	
	public int getPeso() {
		return peso;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void inserirSexo(){
		//Declara objeto ler
		Scanner ler = new Scanner(System.in);
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
		
		ler.close();
	}
	
	public void inserirPeso(int indicePessoa){
		Scanner ler = new Scanner(System.in);
		System.out.println("Insira o peso da pessoa de nº"+(indicePessoa+1)+":\t");
		int peso;
		do{
			peso = ler.nextInt();
		}while( peso < 0  );
		this.setPeso(peso);
		ler.close();
	}

}
