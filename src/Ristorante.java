package src;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ristorante {
    private String tipo;
    private List<Menu> menu;
    private Map<String, Cliente> prenotazioni;

    public Ristorante(String tipo, List<Menu> menu) {
        this.tipo = tipo;
        this.menu = menu;
        this.prenotazioni = new HashMap<>();
    }
    public void aggiungiPrenotazione(String data, Cliente cliente){
        prenotazioni.put(data, cliente);
    }
    public Cliente getPrenotazione(String data){
        return prenotazioni.get(data);
    }
}
