package Problema1;
/**
 * 
 * @author Will
 *
 */
public class Main {
	//String con el alfabeto en minusculas
	String alfabetoMin = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
	//String con el alfabeto en mayusculas
	String alfabetoMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main op = new Main();
		System.out.println(op.cifrarCesar("hzlGalwQ", 2));
		System.out.println(op.cifrarCesar("pruebanow", "anebfksvarweoupabqp", 3));
	}
	/**
	 * 
	 * @param frase String con la frase que pasara por el cifrado Cesar
	 * @param distancia int de la distancia que se desplazara para cambiar de valor
	 * @return respuesta String de la frase original cifrada
	 */
	public String cifrarCesar(String frase, int distancia) {
		char[] alf1 = alfabetoMin.toCharArray();
		char[] alf2 = alfabetoMay.toCharArray();
		char[] fr = frase.toCharArray();
		for(int i = 0; i < fr.length; i++) {
			for(int y = 0; y < alf1.length; y++) {
				if(fr[i] == alf1[y]) {
					fr[i] = alf1[y + distancia];
					break;
				}
				if(fr[i] == alf2[y]) {
					fr[i] = alf2[y + distancia];
					break;
				}
			}
		}
		String respuesta = "";
		for(int x = 0; x < fr.length; x++) {
			respuesta = respuesta + fr[x];
		}
		return respuesta;
	}
	/**
	 * 
	 * @param frase String con la frase que pasara por el cifrado Cesar
	 * @param alfabeto String que definira los valores que se pueden utilizar para el cifrado
	 * @param distancia int de la distancia que se desplazara para cambiar de valor
	 * @return respuesta String de la frase original cifrada
	 */
	public String cifrarCesar(String frase,String alfabeto, int distancia) {
		alfabeto = alfabeto.concat(alfabeto);
		char[] alf1 = alfabeto.toCharArray();
		char[] fr = frase.toCharArray();
		for(int i = 0; i < fr.length; i++) {
			for(int y = 0; y < alf1.length; y++) {
				if(fr[i] == alf1[y]) {
					fr[i] = alf1[y + distancia];
					break;
				}
			}
		}
		String respuesta = "";
		for(int x = 0; x < fr.length; x++) {
			respuesta = respuesta + fr[x];
		}
		return respuesta;
	}
}

