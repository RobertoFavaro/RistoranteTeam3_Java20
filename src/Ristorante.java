package src;

import java.util.*;

public class Ristorante {
    private String nomeRistorante;
    private Set<Menu> menuSet;
    private List<Portata> portate;
    private Map<String, Cliente> prenotazioni;
    private Integer copertiRistorante;
    private Integer postiOccupati;

    public Ristorante(String nomeRistorante, Integer copertiRistorante) {
        this.nomeRistorante = nomeRistorante;
        this.copertiRistorante = copertiRistorante;
        this.menuSet = new HashSet<>();
        this.prenotazioni = new HashMap<>();
        this.portate = new ArrayList<>();
        this.postiOccupati = 0;
    }

    public String getNomeRistorante() {
        return nomeRistorante;
    }

    public void setNomeRistorante(String nomeRistorante) {
        this.nomeRistorante = nomeRistorante;
    }

    public Integer getCopertiRistorante() {
        return copertiRistorante;
    }

    public void setCopertiRistorante(Integer copertiRistorante) {
        this.copertiRistorante = copertiRistorante;
    }

    public Integer getPostiOccupati() {
        return postiOccupati;
    }

    public void setPostiOccupati(Integer postiOccupati) {
        this.postiOccupati = postiOccupati;
    }

    public Set<Menu> getMenuSet() {
        return menuSet;
    }

    public void setMenuSet(Set<Menu> menuSet) {
        this.menuSet = menuSet;
    }

    public List<Portata> getPortate() {
        return portate;
    }

    public void setPortate(List<Portata> portate) {
        this.portate = portate;
    }

    public Map<String, Cliente> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(Map<String, Cliente> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    public Cliente getPrenotazione(String data) {
        return prenotazioni.get(data);
    }

    public void aggiungiPrenotazione(String data, Cliente cliente) {
        if (prenotazioni.size() < copertiRistorante) {
            prenotazioni.put(data, cliente);
            //aggiunto le stampe
            System.out.println("Prenotazione effettuata per " + cliente.getNome() + " " + cliente.getCognome());
        } else {
            System.out.println("Prenotazione non disponibile, il ristorante è pieno.");
        }
    }

    public void stampaPrenotazioni() {
        System.out.println("Prenotazioni del ristorante:");
        for (Map.Entry<String, Cliente> entry : prenotazioni.entrySet()) {
            String data = entry.getKey();
            Cliente nome = entry.getValue();
            System.out.println("Data: " + data + ", Nome: " + nome);
        }
    }

    public void aggiungiMenu(Menu menuAggiunto) {
        if (menuAggiunto != null) {
            menuSet.add(menuAggiunto);
        } else {
            System.out.println("Impossibile aggiungere al menù");
        }
    }

    public void rimuoviMenu(Menu menuRimosso) {
        if (menuSet.contains(menuRimosso)) {
            menuSet.remove(menuRimosso);
        } else {
            System.out.println("Impossibile rimuovere dal menù");
        }
    }

    //aggiunto nuovo metodo stampa tipologia menu.
//    public void stampaMenuRistorante(TipologiaEnum tipologiaEnum) {
//        System.out.println("Menu " + tipologiaEnum);
//        for (Menu menuEntry : menu) {
//            if (menuEntry.getTipologiaMenu() == tipologiaEnum) {
//                menuEntry.stampaMenu();
//            }
//        }
//    }
    public void stampaMenuRistorante(TipologiaEnum tipologiaEnum){
        System.out.println("menu " +tipologiaEnum);
        for (Menu menuVar: menuSet) {
            menuVar.stampaMenu();
        }

    }
//TODO facciamo un sistema di punteggi fidelity card
    public void verificaCapienza(int copertiRichiesti, String data, Cliente cliente) {
        int postiDisponibili = copertiRistorante - postiOccupati;
        if (copertiRichiesti <= postiDisponibili) {
            aggiungiPrenotazione(data, cliente);
            System.out.println("Prenotazione effettuata");
        } else {
            System.out.println("Impossibile aggiungere prenotazione,siamo pieni!");
        }

    }

    @Override
    public String toString() {
        return "Ristorante{" +
                "nomeRistorante='" + nomeRistorante + '\'' +
                ", menu=" + menuSet +
                ", portate=" + portate +
                ", prenotazioni=" + prenotazioni +
                ", copertiRistorante=" + copertiRistorante +
                ", postiOccupati=" + postiOccupati +
                '}';
    }
}

