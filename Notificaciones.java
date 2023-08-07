public class Notificaciones {
    private int nivelHumedad;

    public Notificaciones(int nivelHumedad) {
        this.nivelHumedad = nivelHumedad;
    }

    public int getNivelHumedad() {
        return nivelHumedad;
    }

    public void setNivelHumedad(int nivelHumedad) {
        this.nivelHumedad = nivelHumedad;
    }

    // Método para recibir notificaciones si una zona de riego necesita riego
    public void recibirNotificacion(ZonaRiego zonaRiego) {
        if (zonaRiego.necesitaRiego()) {
            setNivelHumedad(zonaRiego.getNivelHumedad());
            System.out.println("Nivel de humedad en la zona de riego " + zonaRiego.getNombre() +
                               " es bajo: " + getNivelHumedad() + "%. Necesita riego.");
        } else {
            System.out.println("El nivel de humedad en la zona de riego " + zonaRiego.getNombre() +
                               " es suficiente: " + zonaRiego.getNivelHumedad() + "%. No necesita riego.");
        }
    }

    // Otros métodos y lógica relacionada con Notificaciones
}