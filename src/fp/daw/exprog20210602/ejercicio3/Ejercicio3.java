package fp.daw.exprog20210602.ejercicio3;

import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3 {
	static Queue<Integer> colaNumeros = new LinkedList<Integer>();
	//Cola aux para guardar los n numeros de la colaNumeros y poder invertirlos
	static Queue<Integer> colaAuxiliar = new LinkedList<Integer>();
	//La cola resultado
	static Queue<Integer> colaFinal=new LinkedList<Integer>();

	public static void main(String[] args) {

	}

	public static void invertir(int n, Queue<Integer> colaNumeros) {
		
		if(!colaNumeros.isEmpty()) {
			for(int i=0;i<n;i++) {
				int numeroSacado=colaNumeros.poll();
				colaAuxiliar.offer(numeroSacado);
			
			}
		}
		

	}
}
