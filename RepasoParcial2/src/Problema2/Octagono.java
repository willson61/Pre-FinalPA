package Problema2;
/**
 * 
 * @author Will
 *
 */
public class Octagono implements Poligono{
	double lado;
	double apotema;
	/**
	 * 
	 * @param lado int del valor de uno de los 8 lados iguales del octagono
	 * @param apotema int de la apotema del octagono
	 */
	public Octagono(double lado, double apotema) {
		super();
		this.lado = lado;
		this.apotema = apotema;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	@Override
	/**
	 * Calculo del area de la figura
	 */
	public double area() {
		return (perimetro()*apotema)/2;
	}

	@Override
	/**
	 * Calculo del perimetro de la figura
	 */
	public double perimetro() {
		return lado*8;
	}
}
