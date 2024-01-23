package src;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nomeMenu;
    private String tipoMenu;
    private String nomeCuoco;
    private List<Portata> portate;
    private TipologiaEnum tipologiaMenu;

    public Menu(String nomeMenu, String tipoMenu, String nomeCuoco, TipologiaEnum tipologiaMenu) {
        this.nomeMenu = nomeMenu;
        this.tipoMenu = tipoMenu;
        this.nomeCuoco = nomeCuoco;
        this.portate = new ArrayList<>();
        this.tipologiaMenu = tipologiaMenu;
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

    //aggiunta nuovo getter
    public TipologiaEnum getTipologiaMenu() {
        return tipologiaMenu;
    }

    public void aggiungiPortata(Portata portata, MenuEnum enumMenu) {
        portata.setEnumMenu(enumMenu);
        portate.add(portata);
    }

    //TODO facciamo uno stampa menu colorato, facciamo un enumerato per le stampe così possiamo usare più colori
    public void stampaMenu() {
        String rosso = "\u001B[31m";
        String reset = "\u001B[31m";
        if (!portate.isEmpty()) {
            for (Portata portata : portate) {
                System.out.println(rosso);
                portata.stampaPortate();
                System.out.println(reset);
            }
        } else {
            System.out.println("Il menu è vuoto.");
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "nomeMenu='" + nomeMenu + '\'' +
                ", tipoMenu='" + tipoMenu + '\'' +
                ", nomeCuoco='" + nomeCuoco + '\'' +
                ", portate=" + portate +
                ", tipologiaMenu=" + tipologiaMenu +
                '}';
    }
}
