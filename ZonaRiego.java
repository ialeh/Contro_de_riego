public class ZonaRiego {
    private int id;
    private String nombre;
    private String tipoPlanta;
    private int frecuenciaRiego;
    private int duracionRiego;
    private int nivelHumedad; 

    public ZonaRiego(String nombre, String tipoPlanta, int frecuenciaRiego, int duracionRiego) {
        this.nombre = nombre;
        this.tipoPlanta = tipoPlanta;
        this.frecuenciaRiego = frecuenciaRiego;
        this.duracionRiego = duracionRiego;
        // Medir el nivel de humedad al crear una nueva zona de riego
        medirHumedad();
    }

 public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPlanta() {
        return tipoPlanta;
    }

    public void setTipoPlanta(String tipoPlanta) {
        this.tipoPlanta = tipoPlanta;
    }

    public int getFrecuenciaRiego() {
        return frecuenciaRiego;
    }

    public void setFrecuenciaRiego(int frecuenciaRiego) {
        this.frecuenciaRiego = frecuenciaRiego;
    }

    public int getDuracionRiego() {
        return duracionRiego;
    }

    public void setDuracionRiego(int duracionRiego) {
        this.duracionRiego = duracionRiego;
    }
    
    public int getNivelHumedad() {
        return nivelHumedad;
    }

    public void setNivelHumedad(int nivelHumedad) {
        this.nivelHumedad = nivelHumedad;
    }

    // Método para medir el nivel de humedad usando el sensor de humedad
    public void medirHumedad() {
        SensorHumedad sensorHumedad = new SensorHumedad(id); // Suponiendo que el id de la zona se utiliza como identificador en el sensor
        int nivelHumedadMedido = sensorHumedad.medirNivelHumedad();
        setNivelHumedad(nivelHumedadMedido);
    }

    // Otros métodos

    public boolean necesitaRiego() {
        // Verificar si la zona necesita riego basándose en el nivel de humedad
        return nivelHumedad < 50; // Por ejemplo, se considera que necesita riego si el nivel de humedad es menor al 50%
    }

    public String toString() {
        return "Zona: " + nombre + ", Tipo de planta: " + tipoPlanta +
               ", Frecuencia de riego: " + frecuenciaRiego + " días, Duración de riego: " + duracionRiego + " minutos";
    }

    // Otros métodos y lógica relacionada con ZonaRiego
}


