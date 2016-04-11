public class Validacao {
	public static boolean validaContinua(boolean opcao) {
		if(opcao)
			return true;
		else
			return false;
	}
	public static boolean validaAltura(float altura) {
		if(altura > 0.4F && altura < 2.6F)
			return true;
		else
			return false;
	}
	public static boolean validaIdade(int idade) {
		if(idade > 0 && idade < 150)
			return true;
		else
			return false;
	}
	public static boolean validaNome(String nome) {
		if(nome.length() < 3)
			return false;
		else
			return true;
	}
}
