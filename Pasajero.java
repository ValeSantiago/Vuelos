public class Pasajero {

  private String nombre;
  private String apellido;

  public Pasajero(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  String getNombre() {
    return nombre.toString();
  }

  public String getApellido() {
    return apellido.toString();
  }
}
