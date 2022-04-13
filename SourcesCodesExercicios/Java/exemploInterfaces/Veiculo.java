/**
 * Síntese
 * 
 * Métodos: frea(), acelera(), getMarca(), getVelocidade(), setMarca(String),
 * setVelocidade(float)
 */
public class Veiculo {
	private String marca;
	private Float velocidade;

	public void frea() {
		if (velocidade > 0)
			velocidade--;
	}

	public void acelera() {
		if (velocidade <= 10)
			velocidade++;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
}