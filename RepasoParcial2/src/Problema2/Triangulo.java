package Problema2;
/**
 * 
 * @author Will
 *
 */
public class Triangulo implements Poligono{
	double ladoA;
	double ladoB;
	double ladoC;
	double altura;
	/**
	 * 
	 * @param ladoA int de lado 1 del triangulo
	 * @param ladoB int de lado 2 del triangulo
	 * @param ladoC int de lado 3 del triangulo
	 * @param altura int de altura del triangulo
	 */
	public Triangulo(double ladoA, double ladoB, double ladoC, double altura) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.altura = altura;
	}
	public double getLadoA() {
		return ladoA;
	}
	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}
	public double getLadoB() {
		return ladoB;
	}
	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	public double getLadoC() {
		return ladoC;
	}
	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * Calculo del area de la figura
	 */
	@Override
	public double area() {
		return (ladoC*altura)/2;
	}
	/**
	 * Calculo del perimetro de la figura
	 */
	@Override
	public double perimetro() {
		return ladoA + ladoB + ladoC;
	}

}
