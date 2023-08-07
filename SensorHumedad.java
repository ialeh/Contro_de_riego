public class SensorHumedad {
    private int id;
    private int zonaRiegoId;
    private int nivelHumedad;

    public SensorHumedad(int zonaRiegoId) {
        this.zonaRiegoId = zonaRiegoId;
    }

   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getZonaRiegoId() {
        return zonaRiegoId;
    }

    public void setZonaRiegoId(int zonaRiegoId) {
        this.zonaRiegoId = zonaRiegoId;
    }

    public int getNivelHumedad() {
        return nivelHumedad;
    }

    public void setNivelHumedad(int nivelHumedad) {
        this.nivelHumedad = nivelHumedad;
    }
// Método para medir el nivel de humedad y actualizarlo
    public void medirHumedad() {
        // Generar un número aleatorio entre 1 y 100 para simular el nivel de humedad
        int nivelHumedadMedido = (int) (Math.random() * 100) + 1;
        setNivelHumedad(nivelHumedadMedido);
    }
      public int medirNivelHumedad() {
        return nivelHumedad;
    }

}
