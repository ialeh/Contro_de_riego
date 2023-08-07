public class ControlManual extends ZonaRiego {
    private boolean estadoRiego;

    public ControlManual(String nombre, String tipoPlanta, int frecuenciaRiego, int duracionRiego) {
        super(nombre, tipoPlanta, frecuenciaRiego, duracionRiego);
        this.estadoRiego = false; // Inicialmente el riego está apagado
    }

    public boolean isEstadoRiego() {
        return estadoRiego;
    }

    public void setEstadoRiego(boolean estadoRiego) {
        this.estadoRiego = estadoRiego;
    }

    // Método para activar el riego manualmente
    public void activarRiego() {
        if (!estadoRiego) {
            estadoRiego = true;
            System.out.println("El riego ha sido activado manualmente en la zona de riego: " + getNombre());
        } else {
            System.out.println("El riego ya está activado en la zona de riego: " + getNombre());
        }
    }

    // Método para desactivar el riego manualmente
    public void desactivarRiego() {
        if (estadoRiego) {
            estadoRiego = false;
            System.out.println("El riego ha sido desactivado manualmente en la zona de riego: " + getNombre());
        } else {
            System.out.println("El riego ya está desactivado en la zona de riego: " + getNombre());
        }
    }

    // Otros métodos y lógica relacionada con ControlManual
}
