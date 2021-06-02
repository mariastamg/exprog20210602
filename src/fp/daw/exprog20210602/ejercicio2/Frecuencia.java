package fp.daw.exprog20210602.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Frecuencia {

	File ruta;
	static Set<String> palabrasSueltas = new TreeSet<String>();
	static Map<String, Integer> contador = new HashMap<String, Integer>();

	public Frecuencia(File ruta) throws IOException {
		// Almacenamos las palabras por separado
		
		this.ruta = ruta;
		try {
			FileReader fr = new FileReader(ruta);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while ((linea = br.readLine()) != null) {
				String palabras[] = linea.split("\\P{L}+");
				for (String pal : palabras) {
					if (pal.length() > 0) {
						palabrasSueltas.add(pal);
					}
				}

			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Ya tenemos las palabras en un tree set, vamos a crear un map contador que vaya almacenando las palabras y su frecuencia
		Iterator<String> i = palabrasSueltas.iterator();
		while (i.hasNext()) {
			String e = i.next();
			if (!contador.containsKey(e)) {
				contador.putIfAbsent(e, 1);
			} else {
				int contadorActual = contador.get(e);
				contadorActual++;
				contador.replace(e, contadorActual);
			}
		}
	}
	
	//Metodo que acepte un String que represente la palabra y retorne su frecuencia
	public int frecuenciaPalabras(String palabra) {
		int frecuenciaPalabra = 0;
		
		Iterator<Entry<String, Integer>> c = contador.entrySet().iterator();
		while (c.hasNext()) {
			Entry<String, Integer> b = c.next();
			if (b.getValue()!=0) {
				return frecuenciaPalabra;
			}
				
		}

		return 0;
		
	}

	public File getRuta() {
		return ruta;
	}

	public void setRuta(File ruta) {
		this.ruta = ruta;
	}

}
