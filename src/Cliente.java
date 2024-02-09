package src;
import java.util.List;
import java.util.Map;

public class Cliente {

    //TODO aggiungere il tipo
    private String nome;
    private String cognome;

    // aggiunto getTipo per il debug del main "menu vuoto"
    private TipologiaEnum tipo;
    private AllergieEnum allergieEnum;
    private Integer punteggioCliente;
    private Menu menuScelto;

    //ho aggiunto un nuovo campo per memorizzare le prenotazioni, che ho basato il metodo calcolaSpesa nelle prenotazione dei clienti.


    public Cliente(String nome, String cognome, TipologiaEnum tipo, AllergieEnum allergieEnum, Menu menuScelto) {
        this.nome = nome;
        this.cognome = cognome;
        this.tipo = tipo;
        this.allergieEnum = allergieEnum;
        this.punteggioCliente = 0;
        this.menuScelto = menuScelto;
    }

    public Menu getMenuScelto() {
        return menuScelto;
    }

    public void setMenuScelto(Menu menuScelto) {
        this.menuScelto = menuScelto;
    }

    public void setTipo(TipologiaEnum tipo) {
        this.tipo = tipo;
    }

    public AllergieEnum getAllergieEnum() {
        return allergieEnum;
    }

    public void setAllergieEnum(AllergieEnum allergieEnum) {
        this.allergieEnum = allergieEnum;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // aggiunto getTipo per il debug del main "menu vuoto"
    public TipologiaEnum getTipo() {
        return tipo;
    }


    // questo metodo aggiunge punti ai clienti
    public void aggiungiPuntiClienti(Integer punti) {
        punti += 10;
        System.out.println("Punteggio del cliente : " + nome + " " + punti);

    }

    // questo metodo rimuove i punti
    public void rimuoviPunteggioClienti() {
        this.punteggioCliente = 0;
    }

    // QUESTO METODO VERIFICA SE IL CLIENTE HA SUPERATO IL LIMITE MASSIMO DI PUNTEGGI
    public Boolean limitePunteggioClienti() {
        return punteggioCliente >= 100;

    }

    //trova i tipi delle portate con get nomeportata.
    private Portata trovaPortata(String nomePortata) {
        return prenotazioni.get(nomePortata);
    }

    //calcola la spesa totale della spea di un cliente usando le prenotazioni come base.



    @Override
    public String toString() {
        return nome + " " +cognome;
    }
}
