package logica;

import java.util.ArrayList;

public class Jugador {

	String nombre;
	int nivel;
	String posicion;
	ArrayList<String> incompatibles;
	
	Jugador(){
		incompatibles = new ArrayList<String>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	
	
	
	
}
