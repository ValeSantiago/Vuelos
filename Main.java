import java.util.List;
import java.util.Scanner;

// Clase que representa un vuelo

public class Main {

  public static void main(String[] args) {
    GestionVuelos gestionVuelos = new GestionVuelos();
    Scanner scanner = new Scanner(System.in);

    // Agregar algunos vuelos
    gestionVuelos.agregarVuelo(
      new Vuelo("Nueva York", "Los Angeles", "08:00 AM", "05:00pm")
    );
    gestionVuelos.agregarVuelo(
      new Vuelo("Chicago", "Miami", "10:30 AM", "12:30pm")
    );

    System.out.println("Bienvenido a su reservación de vuelo");
    System.out.println("Ingrese sus datos personales");
    System.out.print("Nombre: ");
    String nombre = scanner.nextLine();
    System.out.print("Apellido: ");
    String apellido = scanner.nextLine();
    Pasajero pasajero = new Pasajero(nombre, apellido);
    System.out.println("Bienvenide " + pasajero.getNombre() + " " + pasajero.getApellido());

    System.out.println("Ingrese los datos de su vuelo");
    System.out.print("¿Su vuelo es internacional? (S/N): ");
    String esInternacional = scanner.nextLine();

    System.out.print("Ingrese origen del vuelo: ");
    String origen = scanner.nextLine();
    System.out.print("Ingrese destino del vuelo: ");
    String destino = scanner.nextLine();
    scanner.close();
    List<Vuelo> resultados = gestionVuelos.buscarVuelos(origen, destino);
    if (resultados.isEmpty()) {
      System.out.println(
        "No tenemos vuelos disponibles de " + origen + " a " + destino + " disculpe las molestias."
      );
    } else {
      System.out.println("Su vuelos de " + origen + " a " + destino + ":");
      for (Vuelo vuelo : resultados) {
        System.out.println("Hora de salida: " + vuelo.getHoraSalida());
      }
    }
  }
}
