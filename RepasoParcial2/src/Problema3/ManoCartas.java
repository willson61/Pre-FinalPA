package Problema3;
/**
 * @author Will
 */
import java.util.Random;

public class ManoCartas {
	static LinkedPositionalList<Carta> cartas = new LinkedPositionalList<>();
	static LinkedPositionalList<Carta> temp = new LinkedPositionalList<>();
	Position<Carta> n, n2;;
	public static void main(String[] args) {
		ManoCartas op = new ManoCartas();
		
		op.agregarCarta(10, 'C');
		op.agregarCarta(4, 'B');
		op.agregarCarta(9, 'D');
		op.agregarCarta(7, 'C');
		op.agregarCarta(3, 'A');
		op.jugar('C');
	}
	/**
	 * Metodo para agregar una carta a la lista posicional
	 * @param valor int con valor numerico de la carta
	 * @param categoria char con categoria de carta a jugar
	 */
	public void agregarCarta(int valor, char categoria) {
		Carta tempCarta = new Carta(categoria, valor);
		if(cartas.isEmpty()) {
			n = cartas.addFirst(tempCarta);
			n2 = temp.addFirst(tempCarta);
		}
		else {
			n = cartas.addAfter(n, tempCarta);
			n2 = temp.addAfter(n2, tempCarta);
		}
	}
	/**
	 * Metodo de juego que elimina la ultima carta de cierta categoria
	 * @param categoria char con categoria de carta a jugar
	 */
	public void jugar(char categoria) {
		Carta[] cartasCategoria = new Carta[cartas.size()];
		Carta p = temp.removeFirst();
		Random r = new Random();
		int cont = 0;
		for(int y = 0; y < cartas.size(); y++) {
			cartasCategoria[y] = p;
			if(cartasCategoria[y].categoria == categoria) {
				cont++;
			}
			p = temp.removeFirst();
		}
		if(cont > 0) {
			for(int i = cartas.size() - 1; i > 0; i--) {
				if(temp.search(cartasCategoria[i]).getElement().categoria == categoria) {
					cartas.remove(temp.search(cartasCategoria[i]));
					break;
				}
			}
		}
		else {
			int n = r.nextInt(cartas.size() - 1);
			cartas.remove(cartas.search(cartasCategoria[n]));
		}
	}
}
