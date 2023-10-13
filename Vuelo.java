public class Vuelo {

  private String origen;
  private String destino;
  private String horaSalida;
  private String horaLlegada;
  private boolean esInternacional;

  public Vuelo(
    String origen,
    String destino,
    String horaSalida,
    String horaLlegada
  ) {
    this.origen = origen;
    this.destino = destino;
    this.horaSalida = horaSalida;
    this.horaLlegada = horaLlegada;
    this.esInternacional = false;
  }

  public Vuelo(
    String origen,
    String destino,
    String horaSalida,
    String horaLlegada,
    boolean esInternacional
  ) {
    this.origen = origen;
    this.destino = destino;
    this.horaSalida = horaSalida;
    this.horaLlegada = horaLlegada;
    this.esInternacional = esInternacional;
  }

  public String getOrigen() {
    return origen.toString();
  }

  public String getDestino() {
    return destino.toString();
  }

  public String getHoraSalida() {
    return horaSalida.toString();
  }

  public String getHoraLlegada() {
    return horaLlegada.toString();
  }

  public boolean esInternacional() {
    return esInternacional;
  }
}
