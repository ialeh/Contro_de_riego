import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ZonaRiego> zonasRegistradas = new ArrayList<>();
        ArrayList<ProgramaRiego> programasRegistrados = new ArrayList<>();
        Notificaciones notificaciones = new Notificaciones(0);

        int opcion;

        do {
            System.out.println("\n------- MENÚ DE OPCIONES -------");
            System.out.println("1. Registrar una Zona de Riego");
            System.out.println("2. Programar Riegos para una Zona");
            System.out.println("3. Ver Notificaciones de Zonas que Necesitan Riego");
            System.out.println("4. Simular Nivel de Humedad del Sensor");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Registrar una zona de riego
                    System.out.print("Ingrese el nombre de la zona de riego: ");
                    scanner.nextLine();
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el tipo de planta: ");
                    String tipoPlanta = scanner.nextLine();
                    System.out.print("Ingrese la frecuencia de riego (días): ");
                    int frecuenciaRiego = scanner.nextInt();
                    System.out.print("Ingrese la duración de riego (minutos): ");
                    int duracionRiego = scanner.nextInt();

                    ZonaRiego zonaRiego = new ZonaRiego(nombre, tipoPlanta, frecuenciaRiego, duracionRiego);
                    zonasRegistradas.add(zonaRiego);
                    System.out.println("Zona de Riego registrada exitosamente.");
                    break;

                case 2:
                    // Programar riegos para una zona
                    if (zonasRegistradas.isEmpty()) {
                        System.out.println("No se han registrado zonas de riego. Por favor, registre una zona primero.");
                        break;
                    }

                    System.out.println("Zonas de Riego Registradas:");
                    for (int i = 0; i < zonasRegistradas.size(); i++) {
                        System.out.println((i + 1) + ". " + zonasRegistradas.get(i).getNombre());
                    }

                    System.out.print("Seleccione el número de la zona para programar riegos: ");
                    int zonaSeleccionada = scanner.nextInt();

                    if (zonaSeleccionada <= 0 || zonaSeleccionada > zonasRegistradas.size()) {
                        System.out.println("Opción inválida. Por favor, seleccione una zona válida.");
                        break;
                    }

                    System.out.print("Ingrese la hora de inicio del riego (hora militar, ej. 8 para las 8:00): ");
                    int horaInicio = scanner.nextInt();
                    System.out.print("Ingrese la hora de fin del riego (hora militar, ej. 10 para las 10:00): ");
                    int horaFin = scanner.nextInt();

                    ProgramaRiego programaRiego = new ProgramaRiego(
                        zonasRegistradas.get(zonaSeleccionada - 1).getNombre(),
                        zonasRegistradas.get(zonaSeleccionada - 1).getTipoPlanta(),
                        zonasRegistradas.get(zonaSeleccionada - 1).getFrecuenciaRiego(),
                        zonasRegistradas.get(zonaSeleccionada - 1).getDuracionRiego()
                    );
                    programaRiego.establecerProgramaRiego(horaInicio, horaFin);
                    programasRegistrados.add(programaRiego);
                    System.out.println("Programa de Riego registrado exitosamente para la zona seleccionada.");
                    break;

                case 3:
                    // Ver notificaciones de zonas que necesitan riego
                    for (ZonaRiego zona : zonasRegistradas) {
                        notificaciones.recibirNotificacion(zona);
                    }
                    break;

                case 4:
                    // Simular nivel de humedad del sensor
                    System.out.println("Zonas de Riego Registradas:");
                    for (int i = 0; i < zonasRegistradas.size(); i++) {
                        System.out.println((i + 1) + ". " + zonasRegistradas.get(i).getNombre());
                    }

                    System.out.print("Seleccione el número de la zona para simular el nivel de humedad: ");
                    int zonaSimulada = scanner.nextInt();

                    if (zonaSimulada <= 0 || zonaSimulada > zonasRegistradas.size()) {
                        System.out.println("Opción inválida. Por favor, seleccione una zona válida.");
                        break;
                    }

                    zonasRegistradas.get(zonaSimulada - 1).medirHumedad();
                    System.out.println("Nivel de humedad simulado para la zona seleccionada.");
                    break;

                case 5:
                    // Salir del programa
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}

