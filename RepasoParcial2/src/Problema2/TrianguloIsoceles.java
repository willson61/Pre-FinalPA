package Problema2;
/**
 * 
 * @author Will
 *
 */
public class TrianguloIsoceles extends Triangulo{
	/**
	 * 
	 * @param ladoA int de lado 1 del triangulo
	 * @param ladoB int de lado 2 del triangulo
	 * @param ladoC int de lado 3 del triangulo
	 * @param altura int de altura del triangulo
	 */
	public TrianguloIsoceles(double ladoA, double ladoB, double ladoC, double altura) {
		super(ladoA, ladoB, ladoC, altura);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Calculo del area de la figura
	 */
	public double area() {
		ladoA = ladoB;
		return (ladoC*altura)/2;
	}
	/**
	 * Calculo del perimetro de la figura
	 */
	public double perimetro() {
		ladoA = ladoB;
		return ladoC + (ladoA * 2);
	}
}
