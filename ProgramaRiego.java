public class ProgramaRiego extends ZonaRiego {
    private int horaInicio;
    private int horaFin;

    public ProgramaRiego(String nombre, String tipoPlanta, int frecuenciaRiego, int duracionRiego) {
        super(nombre, tipoPlanta, frecuenciaRiego, duracionRiego);
        this.horaInicio = 0;
        this.horaFin = 0;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    // Método para establecer el programa de riego
    public void establecerProgramaRiego(int horaInicio, int horaFin) {
        setHoraInicio(horaInicio);
        setHoraFin(horaFin);
    }

    // Método para mostrar los atributos de la zona de riego y el programa de riego establecido
    public void mostrarProgramaRiego() {
        System.out.println("Zona de Riego: " + getNombre());
        System.out.println("Tipo de Planta: " + getTipoPlanta());
        System.out.println("Frecuencia de Riego: " + getFrecuenciaRiego() + " días");
        System.out.println("Duración de Riego: " + getDuracionRiego() + " minutos");
        System.out.println("Nivel de Humedad: " + getNivelHumedad());
        System.out.println("Hora de Inicio del Programa de Riego: " + getHoraInicio() + " horas");
        System.out.println("Hora de Fin del Programa de Riego: " + getHoraFin() + " horas");
    }

}