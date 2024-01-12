package src;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String nomeMenu;
    private String tipoMenu;
    private String nomeCuoco;
    private List<Portata> portate;

    public Menu(String nomeMenu, String tipoMenu, String nomeCuoco){
        this.nomeMenu = nomeMenu;
        this.tipoMenu = tipoMenu;
        this.nomeCuoco = nomeCuoco;
        this.portate = new ArrayList<>();
    }

    public void aggiungiPortata(Portata portata) {
        portate.add(portata);
    }

    public void stampaMenu() {
        System.out.println("MENU");
        for (Portata portata : portate) {
            System.out.println("Nome: " + portata.getNome() + " Descrizione: " + portata.getDescrizione() + " Ingredienti: " + portata.getIngredienti() + " Prezzo: " + portata.getPrezzo() + " Tipo: " + portata.getEnumMenu());
        }
    }
}
