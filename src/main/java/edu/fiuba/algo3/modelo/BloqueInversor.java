package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class BloqueInversor extends Bloque{

	private Collection<Bloque> bloques = new ArrayList<Bloque>();
	
	public void agregarBloque(Bloque unBloque) {
		bloques.add(unBloque);
	}
	
	@Override
	public void accion(Personaje personaje, Dibujo dibujo) {
		bloques.forEach(bloque->{
			bloque.accionInversa(personaje, dibujo);
		});
		
	}


	@Override
	public void accionInversa(Personaje personaje, Dibujo dibujo) {
		this.accion(personaje, dibujo);
		
	}

}
