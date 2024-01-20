package src;

import java.time.OffsetDateTime;
import java.util.*;

public class Ristorante {
    private String nomeRistorante;
    private Set<Menu> menu;
    private List<Portata> portate;
    private Map<String, Cliente> prenotazioni;
    private Integer copertiRistorante;

    public Ristorante(String nomeRistorante, Integer copertiRistorante) {
        this.nomeRistorante = nomeRistorante;
        this.copertiRistorante = copertiRistorante;
        this.menu = new HashSet<>();
        this.prenotazioni = new HashMap<>();
        this.portate = new ArrayList<>();
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

    public Set<Menu> getMenu() {
        return menu;
    }

    public void setMenu(Set<Menu> menu) {
        this.menu = menu;
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
    public Cliente getPrenotazione(String data){
        return prenotazioni.get(data);
    }
    public void aggiungiPrenotazione(String data, Cliente cliente){
        prenotazioni.put(data, cliente);
    }

    public void stampaPrenotazioni(){
        System.out.println(prenotazioni);
    }

    public void aggiungiMenu(Menu menuAggiunto){
        if(menuAggiunto != null){
            menu.add(menuAggiunto);
        }else {
            System.out.println("Impossibile aggiungere al menù");
        }
    }
    public void rimuoviMenu(Menu menuRimosso){
        if(menu.contains(menuRimosso)){
            menu.remove(menuRimosso);
        }else {
            System.out.println("Impossibile rimuovere dal menù");
        }
    }
    public void stampaMenu(TipologiaEnum tipologiaEnum){
        System.out.println("menu " +tipologiaEnum);
        System.out.println(menu);
    }
}

