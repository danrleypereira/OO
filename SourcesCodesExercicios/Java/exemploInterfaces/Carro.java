/**Síntese
 *
Atributos:
 *
Métodos: liga(), desliga(), getStatus() , mover()
 *
setStatus(boolean),controlaVelocidade(float)
 */
import javax.swing.JOptionPane;

public class Carro extends Veiculo implements Rodovia {
	private boolean status;

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void liga() {
		status = true;
	}

	public void desliga() {
		status = false;
	}

	public int mover() {
		final String combustivel = "gasolina";
		return (JOptionPane.showConfirmDialog(null,
				"O veículo está abastecido com " + combustivel + "?",
				"Abastecimento", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE));
	}

	// Implementação obrigatória do método da interface
	public boolean controlaVelocidade(float velocidade) {
		if (velocidade < LIMITE)
			return true;
		else
			return false;
	}
}