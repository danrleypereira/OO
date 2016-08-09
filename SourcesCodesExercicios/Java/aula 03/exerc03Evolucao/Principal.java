/**
 * Sintese
 * 		Objetivo: Cadastrar usu�rios.
 * 		Entradas: Nome, idade, altura.
 * 		Saida: �ltimo usu�rio.
 */

public class Principal {
	public static void main(String[] args) {
		//Declara��es
			Pessoa usuario = new Pessoa();
			boolean opcao = true;
		//Instru��es
			while(Validacao.validaContinua(opcao)) {
				usuario.setNome( Leitura.recebeNome() );
				usuario.setIdade( Leitura.recebeIdade() );
				usuario.setAltura( Leitura.recebeAltura() );
				Servicos.imprimeResultado(usuario);
				opcao = Leitura.recebeOpcao();
		}
	}
}
