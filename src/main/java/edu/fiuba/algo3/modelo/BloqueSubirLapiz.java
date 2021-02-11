package edu.fiuba.algo3.modelo;


public class BloqueSubirLapiz extends Bloque {

    public void accion(Personaje personaje, Dibujo dibujo) {
        personaje.subirLapiz();
    }

	@Override
	public void accionInversa(Personaje personaje, Dibujo dibujo) {
		personaje.bajarLapiz();		
	}
}
