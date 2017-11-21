package Problema2;
/**
 * 
 * @author Will
 *
 */
public class TrianguloEquilatero extends Triangulo{
	/**
	 * 
	 * @param ladoA int de lado 1 del triangulo
	 * @param ladoB int de lado 2 del triangulo
	 * @param ladoC int de lado 3 del triangulo
	 * @param altura int de altura del triangulo
	 */
	public TrianguloEquilatero(double ladoA, double ladoB, double ladoC, double altura) {
		super(ladoA, ladoB, ladoC, altura);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Calculo del area de la figura
	 */
	public double area() {
		ladoB = ladoA;
		ladoC = ladoA;
		return (ladoC*altura)/2;
	}
	/**
	 * Calculo del perimetro de la figura
	 */
	public double perimetro() {
		ladoB = ladoA;
		ladoC = ladoA;
		return ladoB*3;
	}
}
