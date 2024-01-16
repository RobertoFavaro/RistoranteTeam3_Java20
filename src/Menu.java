package src;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nomeMenu;
    private String tipoMenu;
    private String nomeCuoco;
    private List<Portata> portate;

    public Menu(String nomeMenu, String tipoMenu, String nomeCuoco) {
        this.nomeMenu = nomeMenu;
        this.tipoMenu = tipoMenu;
        this.nomeCuoco = nomeCuoco;
        this.portate = new ArrayList<>();
    }

    public String getNomeMenu() {
        return nomeMenu;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public String getNomeCuoco() {
        return nomeCuoco;
    }

    public List<Portata> getPortate() {
        return portate;
    }

    public void setNomeMenu(String nomeMenu) {
        this.nomeMenu = nomeMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public void setNomeCuoco(String nomeCuoco) {
        this.nomeCuoco = nomeCuoco;
    }

    public void setPortate(List<Portata> portate) {
        this.portate = portate;
    }

    public void aggiungiPortata(Portata portata, MenuEnum enumMenu) {
        portata.setEnumMenu(enumMenu);
        portate.add(portata);
    }

    //TODO facciamo uno stampa menu colorato, uno che prende il tipo, possiamo mettere le eccezioni

    public void stampaMenu() {
        System.out.println("MENU");
        for (Portata portata : portate) {
            //TODO che usiamo a fare il polimorfismo?
            portata.stampaPortate();

        }
    }
}
