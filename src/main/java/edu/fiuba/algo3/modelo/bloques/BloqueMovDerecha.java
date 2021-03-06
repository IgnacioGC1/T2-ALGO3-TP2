package edu.fiuba.algo3.modelo.bloques;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;

public class BloqueMovDerecha extends Bloque{

	public BloqueMovDerecha() {
		nombre = "bloque_mov_derecha";
	}
	
    public void ejecutar(Personaje personaje, Dibujo dibujo) {
        personaje.mover(new Posicion(1,0), dibujo);
    }

	@Override
	public void ejecutarInversa(Personaje personaje, Dibujo dibujo) {
		personaje.mover(new Posicion(-1,0), dibujo);
		
	}
}
