import java.text.*;
public class Servicos {
	public static void limpaTela(){
		for(int i = 0;i < 45;i++)
			System.out.println();
	}
	public static void imprimeResultado(Pessoa usuario) {
		DecimalFormat centesimo = new DecimalFormat("0.00");
		limpaTela();
		System.out.print("Resultado:\n");
		System.out.println("Nome: " + usuario.getNome());
		System.out.println("Altura: " + centesimo.format( usuario.getAltura() ));
		System.out.println("Idade: " + usuario.getIdade() );
	}
}
