package negocio;

/**
 * La clase Baul representa un tipo de viaje que requiere espacio en el baúl del vehículo.
 * Es un decorador que extiende la funcionalidad de otro viaje.
 */
public class Baul extends ViajeDecorador {

	/**
     * Constructor para crear un objeto Baul.
     *
     * @param viaje: de tipo IViaje,viaje original al que se le añadirá la opción de usar el baúl.
     */
    public Baul(IViaje viaje) {
        super(viaje);
    }

    /**
     * Calcula el costo del viaje con uso del baúl.
     * El costo se compone del costo original más un adicional basado en la cantidad de pasajeros y la distancia.
     * Además, se agrega un valor extra por usar el baúl.
     *
     * @return double con costo total del viaje con uso del baúl.
     */

    @Override
    public double getCosto() {
        double costoOriginal = getViaje().getCosto();
        double distanciaAdicional = 0.05 * getViaje().getDistancia();
        double pasajerosAdicional = 0.1 * getViaje().getPedido().getCantPasajeros();
        return costoOriginal + getViaje().getValorBase() * (distanciaAdicional + pasajerosAdicional);
    }
}
