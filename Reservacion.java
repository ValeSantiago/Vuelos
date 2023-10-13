public class Reservacion {

  private Pasajero pasajero;
  private Vuelo vuelo;
  private String origen;
  private String destino;
  private String horaSalida;
  private String horaLlegada;
  private boolean esInternacional;

  public Reservacion(
    Pasajero pasajero,
    String origen,
    String destino,
    String horaSalida,
    String horaLlegada,
    boolean esInternacional
  ) {
    this.pasajero = pasajero;
    this.vuelo =
      new Vuelo(origen, destino, horaSalida, horaLlegada, esInternacional);
    this.origen = origen;
    this.destino = destino;
    this.horaSalida = horaSalida;
    this.horaLlegada = horaLlegada;
    this.esInternacional = esInternacional;
  }

  public Pasajero getPasajero() {
    return pasajero;
  }

  public Vuelo getVuelo() {
    return vuelo;
  }

  public String getOrigen() {
    return origen;
  }

  public String getDestino() {
    return destino;
  }

  public String getHoraSalida() {
    return horaSalida;
  }

  public String getHoraLlegada() {
    return horaLlegada;
  }

  public boolean esInternacional() {
    return esInternacional;
  }
}
