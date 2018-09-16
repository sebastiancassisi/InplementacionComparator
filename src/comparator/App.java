package comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1, "Sebastian", 31));
		lista.add(new Persona(2, "Juan", 50));
		lista.add(new Persona(3, "Pepe", 22));
		
		//Collections.sort(lista, new NombreComparator<Persona>());
		
		Collections.sort(lista, new Comparator<Persona>() {

			@Override
			public int compare(Persona o1, Persona o2) {
				int rta=0;
				
				if(o1.getEdad()>o2.getEdad()){
					return rta=1;
					}if (o1.getEdad()<o2.getEdad()) {
						return rta=-1;
					} else {
						return rta=0;
					}		
				
			}
		});
		
		for (Persona persona : lista) {
		System.out.println(persona.getNombre());	
		}
		

	}

}
