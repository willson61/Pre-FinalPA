package Problema2;

import java.util.Scanner;

public class FabricaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String entrada;
		Poligono f1 = null;
		System.out.println("Ingrese el numero par ingresar los datos de la figura que desea crear");
		System.out.println("1 para Triangulo Isoceles");
		System.out.println("2 para Triangulo Equilatero");
		System.out.println("3 para Rectangulo");
		System.out.println("4 para Cuadrado");
		System.out.println("5 para Pentagono");
		System.out.println("6 para Hexagono");
		System.out.println("7 para Octagono");
		entrada = sc.nextLine();
		//Switch que determina que figura se creara en base al ingreso del usuario
		switch(entrada) {
		case "1":
			double l1, l2, l3;
			System.out.println("Inrgrese el valor de los dos dos lados iguales del triangulo");
			l1 = sc.nextDouble();
			System.out.println("Ingrese el valor del lado desigual del triangulo");
			l2 = sc.nextDouble();
			System.out.println("Ingrese el valor de la altura del triangulo");
			l3 = sc.nextDouble();
			f1 = new TrianguloIsoceles(l1, l1, l2, l3);
			break;
		case "2":
			System.out.println("Inrgrese el valor de los tres lados iguales del triangulo");
			l1 = sc.nextDouble();
			System.out.println("Ingrese el valor de la altura del triangulo");
			l3 = sc.nextDouble();
			f1 = new TrianguloEquilatero(l1, l1, l1, l3);
			break;
		case "3":
			System.out.println("Inrgrese el valor de los dos dos lados iguales de base del rectangulo");
			l1 = sc.nextDouble();
			System.out.println("Inrgrese el valor de los dos dos lados iguales de altura del rectangulo");
			l2 = sc.nextDouble();
			f1 = new Rectangulo(l1, l2, l1, l2);
			break;
		case "4":
			System.out.println("Ingrese el valor de un lado del cuadrado");
			l1 = sc.nextDouble();
			f1 = new Cuadrado(l1, l1, l1, l1);
			break;
		case "5":
			System.out.println("Ingrese el valor de un lado del pentagono");
			l1 = sc.nextDouble();
			System.out.println("Ingrese el valor de la apotema del pentagono");
			l2 = sc.nextDouble();
			f1 = new Pentagono(l1, l2);
			break;
		case "6":
			System.out.println("Ingrese el valor de un lado del hexagono");
			l1 = sc.nextDouble();
			System.out.println("Ingrese el valor de la apotema del hexagono");
			l2 = sc.nextDouble();
			f1 = new Hexagono(l1, l2);
			break;
		case "7":
			System.out.println("Ingrese el valor de un lado del Octagono");
			l1 = sc.nextDouble();
			System.out.println("Ingrese el valor de la apotema del Octagono");
			l2 = sc.nextDouble();
			f1 = new Octagono(l1, l2);
			break;
		default:
			System.out.println("El dato ingresado no es valido");
			break;
		}
		System.out.println("Ingrese 1 para ver el Area de la figura creada o 2 para ver el Perimetro");
		entrada = sc.next();
		//Condicion que determina si se calculara el area o perimetro de la figura en base a ingreso del usuario
		if(f1 != null) {
			if(entrada.trim().equals("1")) {
				System.out.println("El area de la figura es " + Double.toString(f1.area()));
			}
			if(entrada.trim().equals("2")) {
				System.out.println("El perimetro de la figura es " + Double.toString(f1.perimetro()));
			}
		}
	}
	
}
