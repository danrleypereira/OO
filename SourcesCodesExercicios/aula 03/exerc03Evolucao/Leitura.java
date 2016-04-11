import java.util.Scanner;
public class Leitura {
	public static boolean recebeOpcao() {
		char opcao;
		Scanner recebe = new Scanner(System.in);
		
		System.out.print("\nContinuar cadastrando?\nDigite 'S' para sim e 'N' para n�o: ");
		opcao = recebe.next().toUpperCase().charAt(0);
		
		while(opcao != 'S' && opcao != 'N') {
			Servicos.limpaTela();
			System.out.print("Op��o inv�lida! Continuar cadastrando?\nDigite 'S' para sim e 'N' para n�o: ");
			opcao = recebe.next().toUpperCase().charAt(0);
		}
		
		if(opcao == 'S')
			return true;
		else
			return false;
	}
	public static float recebeAltura() {
		Scanner recebe = new Scanner(System.in);
		
		float altura = 0;
		Servicos.limpaTela();
		System.out.print("Digite a altura (deve ser maior que 0,4 e menor que 2,6 metros): ");
		
		
		while(true){
			if(recebe.hasNextFloat()){
				try{
					altura = recebe.nextFloat();
					if(Validacao.validaAltura(altura))
						return altura;
					else{
						System.out.println("Digite uma altura válida!");
						continue;}
				}catch(Exception e){
					System.out.println("Inválido!\n Digite novamente.");
					continue;
				}
			}else{
				System.out.println("Digite uma altura válida!");
				recebe.next();
				continue;
			}
		}
//		return altura;
	}

	public static int recebeIdade() {
		Scanner recebe = new Scanner(System.in);
		int idade = 0;
		Servicos.limpaTela();
		System.out.print("Digite a idade (deve ser maior que zero e menor que 150): ");
		
		while(true){
			if(recebe.hasNextInt()){
				try{
					idade = recebe.nextInt();
					if(Validacao.validaIdade(idade))
						return idade;
					else{
						System.out.println("Digite um número válido!");
						continue;
					}
				}catch(Exception e){
					System.out.println("Inválido!\n Digite novamente.");
					recebe.next();
					continue;
				}
			}else{
				System.out.println("Digite um número válido!");
				recebe.next();
				continue;
			}
		}
//		return idade;

		}
	public static String recebeNome() {
		Scanner recebe = new Scanner(System.in);
		String nome = "";
		
		Servicos.limpaTela();
		System.out.print("Digite um nome (m�nimo de 3 caracteres): ");
		
		while(true){
			if(recebe.hasNext()){
				try{
					nome = recebe.next();
					if(Validacao.validaNome(nome)){
						return nome;
					}else{
						System.out.println("Digite um nome válido!");
						continue;
					}
				}catch(Exception e){
					System.out.println("Inválido!\n Digite novamente.");
					recebe.next();
					continue;
				}
			}else{
				System.out.println("Digite um nome válido!");
				recebe.next();
				continue;
			}
		}
//		return nome;
	}
}
