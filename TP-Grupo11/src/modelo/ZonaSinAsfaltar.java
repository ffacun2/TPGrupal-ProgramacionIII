package modelo;

/**
 * La clase SinAsfaltar representa un tipo de viaje que se realiza en terrenos sin asfaltar.
 */
public class ZonaSinAsfaltar extends ViajeDecorador {

	/**
	 * Constructor para decorar viaje con caracteristica de zona SinAsfalto
	 * @param viaje viaje decorado
	 */
    public ZonaSinAsfaltar(IViaje viaje) {
    	super.setIViaje(viaje);
    }

    /**
     * Calcula el costo del viaje sin asfaltar.
     * El costo se compone del valor base más un adicional basado en la distancia y la cantidad de pasajeros.
     * @return double con costo total del viaje con camino sin asfaltar.
     */
    @Override
    public double getCosto() {
        double valorBase = getValorBase();
        double distanciaAdicional = 0.15 * getDistancia();
        double pasajerosAdicional = 0.2 * getPedido().getCantPasajeros();
        return valorBase + valorBase * (distanciaAdicional + pasajerosAdicional);
    }

	@Override
	public int compareTo(IViaje o) {
		if(this.getViaje().getCosto() < o.getCosto())
			return -1;
		else if(this.getViaje().getCosto() > o.getCosto())
			return 1;
		else
			return 0;
	}
	
}
