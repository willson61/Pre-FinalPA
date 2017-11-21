package Problema3;
/**
 * 
 * @author Will
 *
 */
public class Carta {
	char categoria;
	int valor;
	/**
	 * 
	 * @return categoria
	 */
	public char getCategoria() {
		return categoria;
	}
	/**
	 * 
	 * @param categoria Char con categoria de carta
	 */
	public void setCategoria(char categoria) {
		this.categoria = categoria;
	}
	/**
	 * 
	 * @return valor
	 */
	public int getValor() {
		return valor;
	}
	/**
	 * 
	 * @param valor int con valor numerico de la carta
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}
	/**
	 * 
	 * @param categoria Char con categoria de carta
	 * @param valor int con valor numerico de la carta
	 */
	public Carta(char categoria, int valor) {
		super();
		this.categoria = categoria;
		this.valor = valor;
	}
}
