package modelo;

import java.io.Serializable;
import java.util.ArrayList;

import Excepciones.ExistenteChoferException;
import negocio.Sistema;

/**
 * La clase Chofer representa a un conductor con su información personal y categoría.
 */
public abstract class Chofer implements Serializable,Cloneable{
    private String dni; // Documento de identidad del chofer
    private String nombre; // Nombre completo del chofer
    
    /**
     * Constructor para crear un objeto Chofer.
     * <b>pre:</b>dni distinto de null y vacio, valido.
     * 			nombre distinto de null, no vacio y valido.
     * @param dni:de tipo String, documento de identidad del chofer.
     * @param nombre: de tipo String, nombre completo del chofer.
     * @throws IllegalArgumentException Si la categoría no es válida.
     */
    public Chofer(String dni, String nombre) {
        super();
        this.dni = dni;
        this.nombre = nombre;
    }

    /**
     * Obtiene el sueldo del chofer según su categoría.
     * @return double con sueldo del chofer.
     * @throws ExistenteChoferException 
     */
    public abstract double getSueldo();
    
	public String getDni() {
		return this.dni;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public ArrayList<IViaje> getViajes(){
		return Sistema.getInstance().reporteViajesChofer(this, null, null);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	/**
     *Devuelve una representación en forma de cadena de Chofer.
	*@return String que representa a Chofer.
	 * @throws  
	*/
	public String toString() {
		return "\n********"+
				"\nNombre: "+this.nombre+
				"\nDNI: "+this.dni+
				"\nSueldo: $"+getSueldo();
	}
    
}
