package Problema2;

public class Cuadrado extends Cuadrilatero{
	/**
	 * 
	 * @param ladoA int del valor del lado 1
	 * @param ladoB int del valor del lado 2
	 * @param ladoC int del valor del lado 3
	 * @param ladoD int del valor del lado 4
	 */
	public Cuadrado(double ladoA, double ladoB, double ladoC, double ladoD) {
		super(ladoA, ladoB, ladoC, ladoD);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Calculo del area de la figura
	 */
	public double area() {
		ladoC =ladoA;
		ladoD = ladoA;
		ladoB = ladoA;
		return ladoA*ladoB;
	}
	/**
	 * Calculo del perimetro de la figura
	 */
	public double perimetro() {
		ladoC =ladoA;
		ladoD = ladoB;
		ladoB = ladoA;
		return (ladoA * 4);
	}
}
