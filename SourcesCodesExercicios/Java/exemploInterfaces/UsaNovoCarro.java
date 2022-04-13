/** Síntese
 *
Objetivo: movimenta um carro
 *
Entrada: situação da aceleração e combustível
 *
Saída:
mostra movimentação do carro
 */
import javax.swing.JOptionPane;

public class UsaNovoCarro {
	public static void main(String[] args) {
		Carro auto1 = new Carro();
		auto1.setMarca("FORD");
		auto1.setVelocidade(0);
		auto1.setStatus(false);
		if (auto1.mover() == 0) {
			int continua;
			auto1.liga();
			auto1.acelera();
			System.out.println("Carro em movimento");
			mostraVelocidade(auto1);
			do {
				for (int aux = 0; aux < 10; aux++) {
					auto1.acelera();
					mostraVelocidade(auto1);
				}
				System.out.println();
				continua = JOptionPane
						.showConfirmDialog(null,
								"Deseja continuar acelerando?", "Aceleração",
								JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE);
			} while (continua == 0
					&& auto1.controlaVelocidade(auto1.getVelocidade()));
		} else {
			System.out.print("Velocidade = ");
			mostraVelocidade(auto1);
			JOptionPane.showMessageDialog(null, "Carro "
					+ " precisa de gasolina para se mover.", "Informação",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public static void mostraVelocidade(Veiculo auto) {
		System.out.print("\t" + auto.getVelocidade());
	}
}