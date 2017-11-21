package Problema2;

public class Cuadrilatero implements Poligono{
	double ladoA;
	double ladoB;
	double ladoC;
	double ladoD;
	/**
	 * 
	 * @param ladoA int del valor del lado 1
	 * @param ladoB int del valor del lado 2
	 * @param ladoC int del valor del lado 3
	 * @param ladoD int del valor del lado 4
	 */
	public Cuadrilatero(double ladoA, double ladoB, double ladoC, double ladoD) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		this.ladoD = ladoD;
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
	public double getLadoD() {
		return ladoD;
	}
	public void setLadoD(double ladoD) {
		this.ladoD = ladoD;
	}
	/**
	 * Calculo del area de la figura
	 */
	@Override
	public double area() {
		return ladoA*ladoB;
	}
	/**
	 * Calculo del perimetro de la figura
	 */
	@Override
	public double perimetro() {
		return ladoA + ladoB + ladoC + ladoD;
	}

}
