package src;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    //todo aggiungere nome tipo e nome del cuoco
    private List<Portata> portate;

    public Menu() {
        this.portate = new ArrayList<>();
    }

    public void aggiungiPortata(Portata portata) {
        portate.add(portata);
    }

    public void stampaMenu() {
        for (Portata portata : portate) {
            portata.stampaPortate();
        }
    }
}
