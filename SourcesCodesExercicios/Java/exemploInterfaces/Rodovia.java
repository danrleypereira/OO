/**
 * Síntese da Interface
 * Atributo: limite
 * Método: controlaVelocidade()
 */
public interface Rodovia {
	final float LIMITE = 120;

	// atributo constante
	// todo método é abstrato na interface (assinatura)
	public boolean controlaVelocidade(float velocidade);
}