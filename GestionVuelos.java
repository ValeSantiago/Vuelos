import java.util.ArrayList;
import java.util.List;

// Clase que gestiona los vuelos
public class GestionVuelos {

  private List<Vuelo> vuelos = new ArrayList<>();

  public void agregarVuelo(Vuelo vuelo) {
    vuelos.add(vuelo);
  }

  public List<Vuelo> buscarVuelos(String origen, String destino) {
    List<Vuelo> resultados = new ArrayList<>();
    for (Vuelo vuelo : vuelos) {
      if (
        vuelo.getOrigen().equals(origen) && vuelo.getDestino().equals(destino)
      ) {
        resultados.add(vuelo);
      }
    }
    return resultados;
  }
}
